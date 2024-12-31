package com.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.ContratoDAO;
import com.emp.dao.EmpleadomoduloDAO;
import com.emp.dao.EmpleadoDAO;
import com.emp.model.ContratoModel;
import com.emp.model.EmpleadomoduloModel;
import com.emp.obj.Contrato.ContratoRequest;
import com.emp.obj.Contrato.ContratoResponse;
import com.emp.model.EmpleadoModel;

@Service
public class ContratoService {

    @Autowired
    private ContratoDAO contratoDao;
    
    @Autowired
    private EmpleadomoduloDAO empleadomoduloDao;
    
    @Autowired
    private EmpleadoDAO empleadoDao;

    // Método para listar todos los contratos
    public List<ContratoModel> listar() {
        return this.contratoDao.findAll();
    }

    // Método para añadir un contrato
    public ContratoResponse addContrato(ContratoRequest request) throws Exception {
        EmpleadoModel empleadoModel = this.empleadoDao.getEmpleado(request.getCif());

        // Verificar si el empleado es de tipo 2 y crear un módulo si es necesario
        if (empleadoModel.getTipoEmpleadoId().longValue() == 2L) {
            EmpleadomoduloModel EmpleadomoduloModel = this.empleadomoduloDao.getEmpleadoModulo(request.getCif());
            if (EmpleadomoduloModel == null) {
                EmpleadomoduloModel = new EmpleadomoduloModel();
                EmpleadomoduloModel.setCif(request.getCif());
                EmpleadomoduloModel.setIdModulo(request.getIdModulo());
                EmpleadomoduloModel.setEstado(request.getEstado());
                this.empleadomoduloDao.save(EmpleadomoduloModel);
            }
        }

        // Crear y asignar valores al nuevo contrato
        ContratoModel contrato = new ContratoModel(null,request.getCif(),request.getEmpleadoId(),request.getNumeroContrato(),request.getServicio(),request.getUnidad(),request.getInicio(),request.getFin(),request.getGestion(),request.getDetalle());

        // Guardar el contrato en la base de datos
        this.contratoDao.save(contrato);

        return new ContratoResponse("Contrato añadido correctamente", true, contrato);
    }

    // Método para listar contratos basados en CIF y empleado
    public List<ContratoModel> listarContratos(Long cif, Long empleado) {
        return this.contratoDao.getContratos(cif, empleado);
    }

    // Método para actualizar un contrato
    public ContratoResponse actualizarContrato(ContratoRequest request) throws Exception {
        ContratoModel contrato = this.contratoDao.getContratoByCif(request.getCif());

        if (contrato != null) {
            // Actualizar los campos necesarios del contrato
            contrato.setEmpleadoId(request.getEmpleadoId());
            contrato.setNumeroContrato(request.getNumeroContrato());
            contrato.setServicio(request.getServicio());
            contrato.setUnidad(request.getUnidad());
            contrato.setInicio(request.getInicio());
            contrato.setFin(request.getFin());
            contrato.setGestion(request.getGestion());
            contrato.setDetalle(request.getDetalle());

            // Guardar el contrato actualizado en la base de datos
            this.contratoDao.save(contrato);

            return new ContratoResponse("Contrato actualizado correctamente", true, contrato);
        } else {
            throw new Exception("Contrato no encontrado con el CIF proporcionado");
        }
    }
}

