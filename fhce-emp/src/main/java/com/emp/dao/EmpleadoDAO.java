package com.emp.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.emp.model.EmpleadoModel;

public interface EmpleadoDAO extends JpaRepository<EmpleadoModel, Long>{
	
	@Query(value = "select * from empleado where _01cif=?",nativeQuery=true)
	EmpleadoModel getEmpleado(Long cif);
	
	@Query(value = "select * from empleado where _02tipo_empleado_id=? and _04estado=?",nativeQuery=true)
	List<EmpleadoModel> getListaEmpleado(Long tipo, int estado);
}

