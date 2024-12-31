package com.emp.obj.Empleadomodulo;

public class empleadomoduloRequest {
	private long id;
	private long cif;
	private long idModulo;
	private int estado;
	
	//constructores
	public empleadomoduloRequest(long id, long cif, long idModulo, int estado) {
		super();
		this.id = id;
		this.cif = cif;
		this.idModulo = idModulo;
		this.estado = estado;
	}
	// get y set
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCif() {
		return cif;
	}
	public void setCif(long cif) {
		this.cif = cif;
	}
	public long getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(long idModulo) {
		this.idModulo = idModulo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	

}
