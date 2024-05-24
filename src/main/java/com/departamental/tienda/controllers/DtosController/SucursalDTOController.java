package com.departamental.tienda.controllers.DtosController;

import com.departamental.tienda.repositories.EntityManagers.SucursalDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sucursalDTO")
public class SucursalDTOController {
    SucursalDTOService dtoService;

    @Autowired
    public void setDtoService(SucursalDTOService dtoService) {
        this.dtoService = dtoService;
    }
    @GetMapping("/1")
    public List getAllSucursalDTO1(){
        return dtoService.getAllSucursalDTO1();
    }
    @GetMapping("/inner")
    public List getAllSucursalDTOInner(){
        return dtoService.getAllSucursalDTOInner();
    }
}
