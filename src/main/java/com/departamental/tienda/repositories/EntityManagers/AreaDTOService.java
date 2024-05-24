package com.departamental.tienda.repositories.EntityManagers;

import com.departamental.tienda.models.dtos.AreaDtos.AreaDTO1;
import com.departamental.tienda.models.dtos.AreaDtos.AreaDTO2;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaDTOService {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List getAllAreaDTO1(){
        return entityManager.createNativeQuery("SELECT a.nombreArea FROM areas a", AreaDTO1.class).getResultList();
    }
    @Transactional
    public List getAllAreaDTO2(){
        return entityManager.createNativeQuery("SELECT a.descripcion FROM areas a", AreaDTO2.class).getResultList();
    }
}
