package com.departamental.tienda.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empleados")
@Getter
@Setter
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_de_nacimiento")
    private LocalDate fecha_de_nacimiento;

    @ManyToOne
    @JoinColumn(name = "idregion")
    private Region idRegion;
    @ManyToOne
    @JoinColumn(name ="idgerente")
    private Gerente idGerente;
    @ManyToOne
    @JoinColumn(name = "idarea")
    private Area idArea;
    @ManyToOne
    @JoinColumn(name = "idsucursal")
    private Sucursal idSucursal;

    /*
    @OneToMany(mappedBy = "idSupervisor")
    @JsonIgnore
    private List<Sucursal> listaSucursales;*/
}
