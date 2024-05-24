package com.departamental.tienda.controllers;

import com.departamental.tienda.models.Area;
import com.departamental.tienda.repositories.AreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/areas")
public class AreaController {
    AreaRepo areaRepo;
    @Autowired
    public void setAreaRepo(AreaRepo areaRepo) {
        this.areaRepo = areaRepo;
    }

    /**
     * Create
     * @param area
     */
    @PostMapping
    public void postArea(@RequestBody Area area){
        areaRepo.save(area);
    }

    /**
     * Read by Id
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Area getAreaById(@PathVariable Integer id){
        return areaRepo.findById(id).orElse(null);
    }

    /**
     * Read
     * @return
     */
    @GetMapping
    public Iterable<Area> getAllAreas(){
        return areaRepo.findAll();
    }

    /**
     * Update
     * @param area
     */
    @PutMapping
    public void putArea(@RequestBody Area area){
        areaRepo.save(area);
    }

    /**
     * Delete
     * @param area
     */
    @DeleteMapping
    public void deleteArea(@RequestBody Area area){
        areaRepo.delete(area);
    }

}
