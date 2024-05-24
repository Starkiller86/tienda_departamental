package com.departamental.tienda.repositories.EntityManagers;

import com.departamental.tienda.models.dtos.RegionesDtos.RegionDTO1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionDTOService {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List getAllRegionDTO1(){
        return entityManager.createNativeQuery("SELECT r.nombreRegion, r.regente as `NombreRegente` FROM regiones r", RegionDTO1.class).getResultList();
    }

}
