package com.emp.obj.Contrato;

public class ContratoRequest {

    private Long cif;
    private Long empleadoId;
    private String numeroContrato;
    private String servicio;
    private String unidad;
    private String inicio;
    private String fin;
    private int gestion;
    private String detalle;
    private Long idmodulo;
    private int estado;
    
	
	public ContratoRequest(Long cif, Long empleadoId, String numeroContrato, String servicio, String unidad,
			String inicio, String fin, int gestion, String detalle, Long idmodulo, int estado) {
		super();
		this.cif = cif;
		this.empleadoId = empleadoId;
		this.numeroContrato = numeroContrato;
		this.servicio = servicio;
		this.unidad = unidad;
		this.inicio = inicio;
		this.fin = fin;
		this.gestion = gestion;
		this.detalle = detalle;
		this.idmodulo = idmodulo;
		this.estado = estado;
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
	public Long getIdModulo() {
		return idmodulo;
	}
	public void setIdModulo(Long idmodulo) {
		this.idmodulo = idmodulo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	

   
}
