package com.departamental.tienda.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "regiones")
@Getter
@Setter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombreregion")
    private String nombreRegion;
    @Column(name = "regente")
    private String regente;
    @Column(name = "nosucursales")
    private int noSucursales;

    /*
    @OneToMany(mappedBy = "idRegion")
    private List<Empleado> listaEmpleados;
    @OneToMany(mappedBy = "idRegion")
    private List<Sucursal> listaSucursales;*/
}
