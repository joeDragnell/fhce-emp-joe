package com.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.ContratoModel;
import com.emp.obj.Contrato.ContratoRequest;
import com.emp.obj.Contrato.ContratoResponse;
import com.emp.service.ContratoService;



@RestController
@RequestMapping("fhce-emp/contrato")
@CrossOrigin("http://192.168.31.45:8080/")
public class ContratoController {

    @Autowired
    private ContratoService contratoService=new ContratoService();;

    @GetMapping("/listar")
    public List<ContratoModel> listar() {
    	
        return contratoService.listar();
    }

    @PostMapping("/addContrato")
    public ContratoResponse addContrato(@RequestBody ContratoRequest request) throws Exception {
        return contratoService.addContrato(request);
    }

    @GetMapping("/listarContratos")
    public List<ContratoModel> listarContratos(@RequestParam Long cif, @RequestParam Long empleado) {
        return contratoService.listarContratos(cif, empleado);
    }

    @PutMapping("/actualizarContrato")
    public ContratoResponse actualizarContrato(@RequestBody ContratoRequest request) throws Exception {
        return contratoService.actualizarContrato(request);
    }
}


