package com.departamental.tienda.repositories.EntityManagers;

import com.departamental.tienda.models.dtos.GerenteDtos.GerenteDTO1;
import com.departamental.tienda.models.dtos.GerenteDtos.GerenteDTO2;
import com.departamental.tienda.models.dtos.GerenteDtos.GerenteDTOInner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteDTOService {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List getAllGerenteDTO1(){
        return entityManager.createNativeQuery("SELECT g.nombre as `NombreGerente`, g.idArea FROM gerentes g", GerenteDTO1.class).getResultList();
    }
    @Transactional
    public List getAllGerenteDTO2(){
        return entityManager.createNativeQuery("SELECT g.nombre as `NombreGerente`, g.apellido FROM gerentes g", GerenteDTO2.class).getResultList();
    }
    @Transactional
    public List getAllGerenteDTOInner(){
        return entityManager.createNativeQuery("SELECT g.nombre, g.apellido, a.descripcion as descripcion_area FROM gerentes g INNER JOIN areas a ON a.id = g.idArea", GerenteDTOInner.class).getResultList();
    }
}
