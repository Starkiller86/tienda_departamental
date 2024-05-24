package com.departamental.tienda.controllers.DtosController;

import com.departamental.tienda.repositories.EntityManagers.EmpleadoDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleadoDTO")
public class EmpleadoDTOController {
    EmpleadoDTOService dtoService;
    @Autowired
    public void setDtoService(EmpleadoDTOService dtoService) {
        this.dtoService = dtoService;
    }
    @GetMapping("/1")
    public List getAllEmpleadoDTO1(){
        return dtoService.getAllEmpleadoDTO();
    }
    @GetMapping("/2")
    public List getAllEmpleadoDTO2(){
        return dtoService.getAllEmpleadoDTO2();
    }
    @GetMapping("/3")
    public List getAllEmpleadoDTO3(){
        return dtoService.getAllEmpleadoDTO3();
    }
    @GetMapping("/inner")
    public List getAllEmpleadoDTOInner(){
        return dtoService.getAllEmpleadoDTOInner();
    }
    @GetMapping("/inner2")
    public List getAllEmpleadoDTOInner2(){
        return dtoService.getAllEmpleadoDTOInner2();
    }
}
