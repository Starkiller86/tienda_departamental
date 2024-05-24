package com.departamental.tienda.models.dtos.EmpleadoDtos;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @AllArgsConstructor
public class EmpleadoDTO2 {
    String nombre;
    String apellido;
    Date fecha_de_nacimiento;
}
