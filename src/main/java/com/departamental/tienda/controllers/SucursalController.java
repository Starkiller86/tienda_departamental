package com.departamental.tienda.controllers;

import com.departamental.tienda.models.Empleado;
import com.departamental.tienda.models.Sucursal;
import com.departamental.tienda.repositories.EmpleadoRepo;
import com.departamental.tienda.repositories.SucursalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sucursales")
public class SucursalController {
    SucursalRepo sucursalRepo;

    @Autowired
    public void setSucursalRepo(SucursalRepo sucursalRepo) {
        this.sucursalRepo = sucursalRepo;
    }

    @PostMapping
    public void postSucursal(@RequestBody Sucursal sucursal){
        sucursalRepo.save(sucursal);
    }

    @GetMapping("/id")
    public Sucursal getSucursalById(@PathVariable Integer id){
        return sucursalRepo.findById(id).orElse(null);
    }

    @GetMapping
    public Iterable<Sucursal> getAllSucursales(){
        return sucursalRepo.findAll();
    }

    @PutMapping
    public void putSucursal(@RequestBody Sucursal sucursal){
        sucursalRepo.save(sucursal);
    }

    @DeleteMapping
    public void deleteSucursal(@RequestBody Sucursal sucursal){
        sucursalRepo.delete(sucursal);
    }
}
