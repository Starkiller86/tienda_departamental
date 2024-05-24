package com.departamental.tienda.controllers;

import com.departamental.tienda.models.Empleado;
import com.departamental.tienda.models.Gerente;
import com.departamental.tienda.repositories.GerenteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gerentes")
public class GerenteController {
    GerenteRepo gerenteRepo;

    @Autowired
    public void setGerenteRepo(GerenteRepo gerenteRepo) {
        this.gerenteRepo = gerenteRepo;
    }
    @PostMapping
    public void postGerente(@RequestBody Gerente gerente){
        gerenteRepo.save(gerente);
    }

    @GetMapping("/id")
    public Gerente getGerenteById(@PathVariable Integer id){
        return gerenteRepo.findById(id).orElse(null);
    }

    @GetMapping
    public Iterable<Gerente> getAllGerentes(){
        return gerenteRepo.findAll();
    }

    @PutMapping
    public void putGerente(@RequestBody Gerente gerente){
        gerenteRepo.save(gerente);
    }

    @DeleteMapping
    public void deleteGerente(@RequestBody Gerente gerente){
        gerenteRepo.delete(gerente);
    }
}
