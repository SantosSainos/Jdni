package com.spd.pojo;

import java.sql.Timestamp;

public class Actualizacion {

	private int id_registro_spd;
	private int id_emp;
	private String curp_spd;
	private String nombre_spd;
	private Timestamp fecha_alta;
	private String observaciones;

	public Actualizacion(){}

	public Actualizacion(int id_emp, String curp_spd, String nombre_spd,
			Timestamp fecha_alta, String observaciones) {
		this.id_emp = id_emp;
		this.curp_spd = curp_spd;
		this.nombre_spd = nombre_spd;
		this.fecha_alta = fecha_alta;
		this.observaciones = observaciones;
	}

	public Actualizacion(int id_registro_spd, int id_emp, String curp_spd,
			String nombre_spd, Timestamp fecha_alta, String observaciones) {
		this.id_registro_spd = id_registro_spd;
		this.id_emp = id_emp;
		this.curp_spd = curp_spd;
		this.nombre_spd = nombre_spd;
		this.fecha_alta = fecha_alta;
		this.observaciones = observaciones;
	}

	public int getId_registro_spd() {
		return id_registro_spd;
	}

	public void setId_registro_spd(int id_registro_spd) {
		this.id_registro_spd = id_registro_spd;
	}

	public int getId_emp() {
		return id_emp;
	}

	public void setId_emp(int id_emp) {
		this.id_emp = id_emp;
	}

	public String getCurp_spd() {
		return curp_spd;
	}

	public void setCurp_spd(String curp_spd) {
		this.curp_spd = curp_spd;
	}

	public String getNombre_spd() {
		return nombre_spd;
	}

	public void setNombre_spd(String nombre_spd) {
		this.nombre_spd = nombre_spd;
	}

	public Timestamp getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(Timestamp fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Actualizacion [id_registro_spd=" + id_registro_spd
				+ ", id_emp=" + id_emp + ", curp_spd=" + curp_spd
				+ ", nombre_spd=" + nombre_spd + ", fecha_alta=" + fecha_alta
				+ ", observaciones=" + observaciones + "]";
	}
	
	
	
	
}
