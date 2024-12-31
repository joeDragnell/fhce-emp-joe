package com.emp.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.emp.model.ContratoModel;

@Repository
public interface ContratoDAO extends JpaRepository<ContratoModel, Long> {

    // Método personalizado para obtener contratos por CIF y empleadoId usando una consulta nativa
    @Query(value = "SELECT * FROM contrato WHERE _01cif = ?1 AND _02empleado_id = ?2", nativeQuery = true)
    List<ContratoModel> getContratos(Long cif, Long empleadoId);

    // Método automático de Spring Data JPA para obtener un contrato por su CIF
    ContratoModel getContratoByCif(Long cif);

    // Otros métodos personalizados pueden añadirse aquí si es necesario
}
