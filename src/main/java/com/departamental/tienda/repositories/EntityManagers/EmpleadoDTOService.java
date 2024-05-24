package com.departamental.tienda.repositories.EntityManagers;

import com.departamental.tienda.models.dtos.EmpleadoDtos.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoDTOService {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List getAllEmpleadoDTO(){
        return entityManager
                .createNativeQuery("SELECT e.id, e.nombre, e.apellido from empleados e", EmpleadoDTO.class)
                .getResultList();
    }
    @Transactional
    public List getAllEmpleadoDTO2(){
        return entityManager
                .createNativeQuery("SELECT e.nombre, e.apellido, e.fecha_de_nacimiento from empleados e", EmpleadoDTO2.class)
                .getResultList();
    }
    @Transactional
    public List getAllEmpleadoDTO3(){
        return entityManager
                .createNativeQuery("SELECT e.nombre, e.idRegion, e.idSucursal from empleados e", EmpleadoDTO3.class)
                .getResultList();
    }
    @Transactional
    public List getAllEmpleadoDTOInner(){
        return entityManager
                .createNativeQuery("SELECT e.nombre, r.nombreRegion as nombre_Region, s.direccion as `direccion_Sucursal` FROM empleados e INNER JOIN regiones r ON r.id = e.idRegion INNER JOIN sucursales s ON s.id = e.idSucursal", EmpleadoDTOInner.class).getResultList();
    }
    @Transactional
    public List getAllEmpleadoDTOInner2(){
        return entityManager
                .createNativeQuery("SELECT e.nombre, a.nombreArea AS nombre_area, g.nombre as nombre_gerente FROM empleados e INNER JOIN areas a ON a.id = e.idArea INNER JOIN gerentes g on g.id = e.idGerente", EmpleadoDTOInner2.class)
                .getResultList();
    }
}
