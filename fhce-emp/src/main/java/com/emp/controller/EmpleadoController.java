package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.emp.obj.Empleado.EmpleadoRequest;
import com.emp.obj.Empleado.EmpleadoResponse;
import com.emp.service.EmpleadoService;

@RestController
@RequestMapping("fhce-egovf-emp/empleado")
@CrossOrigin("http://192.168.31.45:8080/")
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@GetMapping("/listar")
	public List<EmpleadoResponse> listar() {
		return empleadoService.listar();
	}
	
	@GetMapping("/getListaEmpleado")
	public List<EmpleadoResponse> getListaEmpleado(@RequestParam(value = "tipo") Long tipo) {
		return empleadoService.getListaEmpleado(tipo);
	}
	
	@PostMapping("/addEmpleado")
	public void addEmpleado(@RequestBody EmpleadoRequest empleadoRequest) throws Exception {
		empleadoService.addEmpleado(empleadoRequest);
	}
	
	@PutMapping("/updateEmpleado")
	public void updateEmpleado(@RequestBody EmpleadoRequest empleadoRequest) throws Exception {
		empleadoService.updateEmpleado(empleadoRequest);
	}
	
	@GetMapping("/getEmpleado")
	public EmpleadoResponse getEmpleado(@RequestParam(value = "cif") Long cif) {
		return empleadoService.getEmpleado(cif);
	}
}
