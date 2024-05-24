package com.departamental.tienda.controllers;

import com.departamental.tienda.models.V15;
import com.departamental.tienda.repositories.V15Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/view")
public class V15Controller {

    V15Repo v15Repo;

    @Autowired
    public void setV15Repo(V15Repo v15Repo) {
        this.v15Repo = v15Repo;
    }
    @GetMapping
    public Iterable<V15> getViews() {
        return v15Repo.findAll();
    }
}
