package com.emp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emp.model.EmpleadomoduloModel;


public interface EmpleadomoduloDAO extends JpaRepository<EmpleadomoduloModel, Long>{
	@Query(value = "select * from empleadomodulo where _01cif=?",nativeQuery=true)
	List<EmpleadomoduloModel>getCif(Long cif);
	
	@Query(value = "select * from empleadomodulo where _01cif=? and _03estado = 1",nativeQuery=true)
	List<EmpleadomoduloModel>getListaModuloEmpleado(Long cif);
	
	@Query(value = "select * from empleadomodulo where _01cif=?",nativeQuery=true)
	EmpleadomoduloModel getEmpleadoModulo(Long cif);

}
