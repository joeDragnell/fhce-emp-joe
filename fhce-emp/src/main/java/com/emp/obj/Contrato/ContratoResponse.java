package com.emp.obj.Contrato;

import com.emp.model.ContratoModel;

public class ContratoResponse {

    private Long id;
    private String numeroContrato;
    private String servicio;
    private String unidad;
    private String inicio;
    private String fin;
    private int gestion;
    private String detalle;
    
    
	public ContratoResponse(Long id, String numeroContrato, String servicio, String unidad, String inicio, String fin,
			int gestion, String detalle) {
		super();
		this.id = id;
		this.numeroContrato = numeroContrato;
		this.servicio = servicio;
		this.unidad = unidad;
		this.inicio = inicio;
		this.fin = fin;
		this.gestion = gestion;
		this.detalle = detalle;
	}
	
	public ContratoResponse(String string, boolean b, ContratoModel contrato) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getInicio() {
		return inicio;
	}
	public void setInicio(String inicio) {
		this.inicio = inicio;
	}
	public String getFin() {
		return fin;
	}
	public void setFin(String fin) {
		this.fin = fin;
	}
	public int getgestion() {
		return gestion;
	}
	public void setgestion(int gestion) {
		this.gestion = gestion;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	

    
}
