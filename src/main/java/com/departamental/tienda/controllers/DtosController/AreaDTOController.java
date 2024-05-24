package com.departamental.tienda.controllers.DtosController;

import com.departamental.tienda.repositories.EntityManagers.AreaDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/areaDTO")
public class AreaDTOController {
    AreaDTOService dtoService;
    @Autowired
    public void setDtoService(AreaDTOService dtoService) {
        this.dtoService = dtoService;
    }
    @GetMapping("/1")
    public List getAllAreaDTO1(){
        return dtoService.getAllAreaDTO1();
    }
    @GetMapping("/2")
    public List getAllAreaDTO2(){
        return dtoService.getAllAreaDTO2();
    }
}
