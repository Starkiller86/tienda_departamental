package com.departamental.tienda.controllers.DtosController;

import com.departamental.tienda.repositories.EntityManagers.RegionDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/regionDTO")
public class RegionDTOController {
    RegionDTOService dtoService;

    @Autowired
    public void setDtoService(RegionDTOService dtoService) {
        this.dtoService = dtoService;
    }
    @GetMapping("/1")
    public List getAllRegionDTO1(){
        return dtoService.getAllRegionDTO1();
    }

}
