package com.departamental.tienda.controllers;

import com.departamental.tienda.models.Empleado;
import com.departamental.tienda.repositories.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    EmpleadoRepo empleadoRepo;

    @Autowired
    public void setEmpleadoRepo(EmpleadoRepo empleadoRepo) {
        this.empleadoRepo = empleadoRepo;
    }

    @PostMapping
    public void postEmpleado(@RequestBody Empleado empleado){
        empleadoRepo.save(empleado);
    }

    @GetMapping("/id")
    public Empleado getEmpleadoById(@PathVariable Integer id){
        return empleadoRepo.findById(id).orElse(null);
    }

    @GetMapping
    public Iterable<Empleado> getAllEmpleados(){
        return empleadoRepo.findAll();
    }

    @PutMapping
    public void putEmpleado(@RequestBody Empleado empleado){
        empleadoRepo.save(empleado);
    }

    @DeleteMapping
    public void deleteEmpleado(@RequestBody Empleado empleado){
        empleadoRepo.delete(empleado);
    }
}
