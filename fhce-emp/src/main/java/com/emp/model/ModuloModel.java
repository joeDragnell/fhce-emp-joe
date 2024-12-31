package com.emp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="modulo")
public class ModuloModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true,nullable = false)
	private Long id;
	
	@Column(nullable = false, name="_01nombre")
	private String nombre;
	
	@Column(length = 100, name="_02ruta")
	private String ruta;
	
	@Column(nullable = false, name="_03imagen")
	private String imagen;
	
	@Column( name="_04idmenu")
	private int idmenu;
	
	

	public ModuloModel(Long id, String nombre, String ruta, String imagen, int idmenu) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ruta = ruta;
		this.imagen = imagen;
		this.idmenu = idmenu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getIdmenu() {
		return idmenu;
	}

	public void setIdmenu(int idmenu) {
		this.idmenu = idmenu;
	}

	
	
}
