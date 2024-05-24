package com.departamental.tienda.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "areas")
@Getter
@Setter

public class Area {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombrearea")
    private String nombreArea;
    @Column(name = "descripcion")
    private String descripcion;

    /*
    @OneToMany(mappedBy = "idArea")
    private List<Gerente> listaGerentes;
    @OneToMany(mappedBy = "idArea")
    private List<Empleado> listaEmpleados;*/
}
