package com.departamental.tienda.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "sucursales")
@Getter
@Setter
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "direccion")
    private String direccion;
    @Column(name = "gerente_gral")
    private String gerente_gral;
    @Column(name = "supervisor")
    private String supervisor;

    /*@ManyToOne
    @JoinColumn(name = "idsupervisor")
    private Empleado idSupervisor;*/

    @ManyToOne
    @JoinColumn(name = "idregion")
    private Region idRegion;
/*
    @OneToMany(mappedBy = "idSucursal")
    private List<Empleado> listaEmpleados;
    /*
    @OneToMany(mappedBy = "idSucursal")
    private List<Gerente> listaGerentes;*/
}
