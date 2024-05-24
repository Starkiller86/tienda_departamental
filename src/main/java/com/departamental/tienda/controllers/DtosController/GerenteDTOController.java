package com.departamental.tienda.controllers.DtosController;

import com.departamental.tienda.repositories.EntityManagers.GerenteDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gerenteDTO")
public class GerenteDTOController {
    GerenteDTOService dtoService;

    @Autowired
    public void setDtoService(GerenteDTOService dtoService) {
        this.dtoService = dtoService;
    }
    @GetMapping("/1")
    public List getAllGerenteDTO1(){
        return dtoService.getAllGerenteDTO1();
    }
    @GetMapping("/2")
    public List getAllGerenteDTO2(){
        return dtoService.getAllGerenteDTO2();
    }
    @GetMapping("/inner")
    public List getAllGerenteDTOInner(){
        return dtoService.getAllGerenteDTOInner();
    }
}
