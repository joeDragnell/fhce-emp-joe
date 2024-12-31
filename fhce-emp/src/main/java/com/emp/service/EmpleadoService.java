package com.emp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.ContratoDAO;
import com.emp.dao.EmpleadoDAO;
import com.emp.dao.EmpleadomoduloDAO;
import com.emp.dao.TipoempleadoDAO;
import com.emp.model.ContratoModel;
import com.emp.model.EmpleadoModel;
import com.emp.model.EmpleadomoduloModel;
import com.emp.obj.Empleado.EmpleadoRequest;
import com.emp.obj.Empleado.EmpleadoResponse;

@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoDAO empleadoDao;
	
	@Autowired
	private TipoempleadoDAO tipoempleadoDao;

	@Autowired
	private ContratoDAO contratoDao;
	
	@Autowired
	private EmpleadomoduloDAO empleadoModuloDao;

	public List<EmpleadoResponse> listar() {
		List<EmpleadoResponse> responseList = new ArrayList<>();
		List<EmpleadoModel> empleados = empleadoDao.findAll();
		for (EmpleadoModel empleado : empleados) {
			responseList.add(new EmpleadoResponse(empleado));
		}
		return responseList;
	}

	public List<EmpleadoResponse> getListaEmpleado(Long tipo) {
		List<EmpleadoResponse> listaEmpleadoObj = new ArrayList<>();
		List<EmpleadoModel> lE = empleadoDao.getListaEmpleado(tipo, 1);
		for (EmpleadoModel empleado : lE) {
			listaEmpleadoObj.add(new EmpleadoResponse(empleado));
		}
		return listaEmpleadoObj;
	}

	public void addEmpleado(EmpleadoRequest empleadoRequest) throws Exception {
		EmpleadoModel empleadoModel = new EmpleadoModel(empleadoRequest);
		empleadoDao.save(empleadoModel);
	}

	public void updateEmpleado(EmpleadoRequest empleadoRequest) throws Exception {
		EmpleadoModel empleadoModel = new EmpleadoModel(empleadoRequest);
		empleadoDao.save(empleadoModel);
	}

	public EmpleadoResponse getEmpleado(Long cif) {
		EmpleadoModel empleadoModel = empleadoDao.getEmpleado(cif);
		if (empleadoModel == null) {
			return new EmpleadoResponse(cif, cif, cif, 0, null, null); // Retorna un objeto vacío en caso de no encontrar
		}
		return new EmpleadoResponse(empleadoModel);
	}
}

