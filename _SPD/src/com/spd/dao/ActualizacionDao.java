package com.spd.dao;

import java.util.List;

import com.spd.pojo.Actualizacion;

public interface ActualizacionDao {

	public boolean save(Actualizacion actualizacion);
	public List<Actualizacion> findAll();
	public Actualizacion findById(int id);
	public List<Actualizacion> findByNombre(String nombre);
	public boolean update(Actualizacion actualizacion);
	public boolean delete(int idAct);
	public int[] saveAll(List<Actualizacion> actualizacions);
}
