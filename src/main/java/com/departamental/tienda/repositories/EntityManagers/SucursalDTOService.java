package com.departamental.tienda.repositories.EntityManagers;

import com.departamental.tienda.models.dtos.SucursalDtos.SucursalDTO1;
import com.departamental.tienda.models.dtos.SucursalDtos.SucursalDTOInner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SucursalDTOService {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    public List getAllSucursalDTO1(){
        return entityManager.createNativeQuery("SELECT s.direccion, s.idRegion FROM sucursales s", SucursalDTO1.class).getResultList();
    }
    @Transactional
    public List getAllSucursalDTOInner(){
        return entityManager.createNativeQuery("SELECT s.gerente_gral, r.nombreRegion as nombre_region, r.regente as nombre_regente FROM sucursales s INNER JOIN regiones r on r.id = s.id", SucursalDTOInner.class).getResultList();
    }
}
