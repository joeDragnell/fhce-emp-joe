package com.emp.obj.Empleado;

import com.emp.model.EmpleadoModel;

public class EmpleadoRequest {
	// Propiedades necesarias para crear/actualizar un empleado
	private Long cif;
	private Long tipoEmpleadoId;
	private int estado;
	private String fecha;
	private String salida;

	// Constructor, Getters y Setters

	

	public EmpleadoRequest(EmpleadoModel empleado) {
		this.cif = empleado.getCif();
		this.tipoEmpleadoId = empleado.getTipoEmpleadoId();
		this.estado = empleado.getEstado();
		this.fecha = empleado.getFecha();
		this.salida = empleado.getSalida();
	}

	public EmpleadoRequest(Long cif, Long tipoEmpleadoId, int estado, String fecha, String salida) {
		super();
		this.cif = cif;
		this.tipoEmpleadoId = tipoEmpleadoId;
		this.estado = estado;
		this.fecha = fecha;
		this.salida = salida;
	}

	public Long getCif() {
		return cif;
	}

	public void setCif(Long cif) {
		this.cif = cif;
	}

	public Long getTipoEmpleadoId() {
		return tipoEmpleadoId;
	}

	public void setTipoEmpleadoId(Long tipoEmpleadoId) {
		this.tipoEmpleadoId = tipoEmpleadoId;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

	// Getters y Setters...
	
}

