package com.departamental.tienda.models.dtos.EmpleadoDtos;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
@AllArgsConstructor
public class EmpleadoDTO {
    @Id
    int id;
    String nombre;
    String apellido;
}
