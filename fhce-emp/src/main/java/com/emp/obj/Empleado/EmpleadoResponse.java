package com.emp.obj.Empleado;

import com.emp.model.EmpleadoModel;


public class EmpleadoResponse {
	
	private Long id;
	private Long cif;
	private Long tipoEmpleadoId;
	private int estado;
	private String fecha;
	private String salida;
	//private String empleado;
	

	
	public EmpleadoResponse(Long id, Long cif, Long tipoEmpleadoId, int estado, String fecha, String salida) {
		super();
		this.id = id;
		this.cif = cif;
		this.tipoEmpleadoId = tipoEmpleadoId;
		this.estado = estado;
		this.fecha = fecha;
		this.salida = salida;
	}
	
	public EmpleadoResponse(EmpleadoModel empleado) {
		this.id = empleado.getId();
		this.cif = empleado.getCif();
		this.estado = empleado.getEstado();
		//this.empleado = ""; // Aquí podrías añadir la lógica para obtener el nombre, si lo tienes.
		this.tipoEmpleadoId = empleado.getTipoEmpleadoId();
		this.fecha = empleado.getFecha();
		this.salida = empleado.getSalida();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	

}