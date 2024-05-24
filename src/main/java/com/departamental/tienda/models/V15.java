package com.departamental.tienda.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDate;

@Entity
@Table(name="v15")
@Immutable
@Getter
@Setter
public class V15 {
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
    @Column(name = "nombre_gerente")
    private String nombre_gerente;
}
