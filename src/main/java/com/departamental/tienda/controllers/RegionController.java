package com.departamental.tienda.controllers;

import com.departamental.tienda.models.Empleado;
import com.departamental.tienda.models.Region;
import com.departamental.tienda.repositories.EmpleadoRepo;
import com.departamental.tienda.repositories.RegionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/regiones")
public class RegionController {
    RegionRepo regionRepo;

    @Autowired
    public void setRegionRepo(RegionRepo regionRepo) {
        this.regionRepo = regionRepo;
    }

    @PostMapping
    public void postRegion(@RequestBody Region region){
        regionRepo.save(region);
    }

    @GetMapping("/id")
    public Region getRegionById(@PathVariable Integer id){
        return regionRepo.findById(id).orElse(null);
    }

    @GetMapping
    public Iterable<Region> getAllRegiones(){
        return regionRepo.findAll();
    }

    @PutMapping
    public void putRegion(@RequestBody Region region){
        regionRepo.save(region);
    }

    @DeleteMapping
    public void deleteRegion(@RequestBody Region region){
        regionRepo.delete(region);
    }
}
