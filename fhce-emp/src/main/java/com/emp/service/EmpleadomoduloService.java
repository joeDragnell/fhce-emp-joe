package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.emp.dao.EmpleadomoduloDAO;
import com.emp.model.EmpleadomoduloModel;

@Service
public class EmpleadomoduloService {

    @Autowired
    private EmpleadomoduloDAO empleadomoduloDao;

    public List<EmpleadomoduloModel> obtenerPorCif(Long cif) {
        return empleadomoduloDao.getCif(cif);
    }

    public List<EmpleadomoduloModel> obtenerListaModuloEmpleado(Long cif) {
        return empleadomoduloDao.getListaModuloEmpleado(cif);
    }

    public EmpleadomoduloModel obtenerEmpleadoModulo(Long cif) {
        return empleadomoduloDao.getEmpleadoModulo(cif);
    }

    public void guardarEmpleadoModulo(EmpleadomoduloModel empleadomoduloModel) {
        empleadomoduloDao.save(empleadomoduloModel);
    }
}