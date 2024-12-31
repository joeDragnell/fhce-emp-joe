package com.emp.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "contrato")
public class ContratoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(nullable = false, name="_01cif")
    private Long cif;

    @Column(nullable = false, name="_02empleadoId")
    private Long empleadoId;

    @Column( name="_03numeroContrato")
    private String numeroContrato;

    @Column( name="_04servicio")
    private String servicio;

    @Column(length = 100, name="_05unidad")
    private String unidad;

    @Column(name = "_06inicio" )
    private String inicio;

    @Column(name = "_07fin")
    private String fin;

    @Column(nullable = false, name="_08gestion")
    private int gestion;

    @Column(length = 255, name="_09detalle")
    private String detalle;
    
    

	public ContratoModel(Long id, Long cif, Long empleadoId, String numeroContrato, String servicio, String unidad,
			String inicio, String fin, int gestion, String detalle) {
		
		this.id = id;
		this.cif = cif;
		this.empleadoId = empleadoId;
		this.numeroContrato = numeroContrato;
		this.servicio = servicio;
		this.unidad = unidad;
		this.inicio = inicio;
		this.fin = fin;
		this.gestion = gestion;
		this.detalle = detalle;
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

	public Long getEmpleadoId() {
		return empleadoId;
	}

	public void setEmpleadoId(Long empleadoId) {
		this.empleadoId = empleadoId;
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

	public int getGestion() {
		return gestion;
	}

	public void setGestion(int gestion) {
		this.gestion = gestion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	

    
    

	
}

