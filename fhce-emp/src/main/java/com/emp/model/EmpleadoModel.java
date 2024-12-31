package com.emp.model;



import com.emp.obj.Empleado.EmpleadoRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



/**
 * Clase que representa la entidad 'empleado' en la base de datos.
 */
@Entity
@Table(name = "empleado")
public class EmpleadoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(name = "_01cif", nullable = false)
    private Long cif;

    @Column(name = "_02tipo_empleado_id", nullable = false)
    private Long tipoEmpleadoId;

    @Column(name = "_03fecha")
    private String fecha;

    @Column(name = "_04stado", nullable = false)
    private int estado;

    @Column(name = "_05salida")
    private String salida;

	public EmpleadoModel(Long id, Long cif, Long tipoEmpleadoId, String fecha, int estado, String salida) {
		super();
		this.id = id;
		this.cif = cif;
		this.tipoEmpleadoId = tipoEmpleadoId;
		this.fecha = fecha;
		this.estado = estado;
		this.salida = salida;
	}

	  public EmpleadoModel(EmpleadoRequest empleadoRequest) {
	        //this.id= empleadoRequest.getId();
	        this.cif = empleadoRequest.getCif();
	        this.tipoEmpleadoId = empleadoRequest.getTipoEmpleadoId();
	        this.fecha = empleadoRequest.getFecha();
	        this.estado = empleadoRequest.getEstado();
	        this.salida= empleadoRequest.getSalida();
	        //this.contratoId = empleadoRequest.getContratoId(); // Si aplica
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

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public String getSalida() {
		return salida;
	}

	public void setSalida(String salida) {
		this.salida = salida;
	}

    // Getters y Setters

    
}