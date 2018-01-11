package com.spd.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spd.pojo.Actualizacion;
import com.spd.pojo.ActualizacionRowMapper;

@Component("actualizacionDao")
public class ActualizacionDaoImplement implements ActualizacionDao {
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Autowired
	private void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	@Override
	public boolean save(Actualizacion actualizacion) {
		BeanPropertySqlParameterSource paramMap = new BeanPropertySqlParameterSource(
				actualizacion);

		return jdbcTemplate
				.update("insert into Evaluados_Demo 	(id_emp, curp_spd, nombre_spd,fecha_alta,observaciones) values "
						+ "							(:id_emp, :curp_spd, :nombre_spd, :fecha_alta, :observaciones)",
						paramMap) == 1;
	}

	@Override
	public List<Actualizacion> findAll() {
		return jdbcTemplate.query("select * from Evaluados_Demo",
				new RowMapper<Actualizacion>() {

					@Override
					public Actualizacion mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Actualizacion actualizacion = new Actualizacion();

						actualizacion.setId_registro_spd(rs
								.getInt("id_registro_spd"));
						actualizacion.setId_emp(rs.getInt("id_emp"));
						actualizacion.setCurp_spd(rs.getString("curp_spd"));
						actualizacion.setNombre_spd(rs.getString("nombre_spd"));
						actualizacion.setFecha_alta(rs
								.getTimestamp("fecha_alta"));
						actualizacion.setObservaciones(rs
								.getString("observaciones"));

						return actualizacion;
					}
				});
	}

	@Override
	public Actualizacion findById(int id) {
		return jdbcTemplate
				.queryForObject(
						"select * from Evaluados_Demo where id_registro_spd=:id_registro_spd",
						new MapSqlParameterSource("id_registro_spd", id),
						new ActualizacionRowMapper());
	}

	@Override
	public List<Actualizacion> findByNombre(String nombre) {
		return jdbcTemplate
				.query("select * from Evaluados_Demo where nombre_spd like :nombre_spd",
						new MapSqlParameterSource("nombre", "%" + nombre + "%"),
						new ActualizacionRowMapper());
	}

	@Override
	public boolean update(Actualizacion actualizacion) {
		return jdbcTemplate
				.update("update Evaluados_Demo set id_emp=:id_emp, curp_spd=:curp_sdp, nombre_spd=:nombre_spd, fecha_alta=:fecha_alta, observaciones=:observaciones where id_registro_spd=:id_registro_spd",
						new BeanPropertySqlParameterSource(actualizacion)) == 1;
	}

	@Override
	public boolean delete(int idAct) {
		return jdbcTemplate
				.update("delete from Evaluados_Demo where id_registro_spd=:id_registro_spd",
						new MapSqlParameterSource("id_registro_spd", idAct)) == 1;
	}

	@Transactional
	@Override
	public int[] saveAll(List<Actualizacion> actualizacions) {
		SqlParameterSource[] batchArgs = SqlParameterSourceUtils
				.createBatch(actualizacions.toArray());

		return jdbcTemplate
				.batchUpdate(
						"insert into Evaluados_Demo 	(id_emp, curp_spd, nombre_spd,fecha_alta,observaciones) values "
								+ "							(:id_emp, :curp_spd, :nombre_spd, :fecha_alta, :observaciones)",
						batchArgs);
	}

}
