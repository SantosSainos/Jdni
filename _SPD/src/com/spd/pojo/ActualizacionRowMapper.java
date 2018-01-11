package com.spd.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ActualizacionRowMapper implements RowMapper<Actualizacion>{

	@Override
	public Actualizacion mapRow(ResultSet rs, int rowNum) throws SQLException {
		Actualizacion actualizacion = new Actualizacion();
		
		actualizacion.setId_registro_spd(rs.getInt("id_registro_spd"));
		actualizacion.setId_emp(rs.getInt("id_emp"));
		actualizacion.setCurp_spd(rs.getString("curp_spd"));
		actualizacion.setNombre_spd(rs.getString("nombre_spd"));
		actualizacion.setFecha_alta(rs.getTimestamp("fecha_alta"));
		actualizacion.setObservaciones(rs.getString("observaciones"));
		
		return null;
	}


}
