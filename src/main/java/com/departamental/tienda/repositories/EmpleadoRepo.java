package com.departamental.tienda.repositories;

import com.departamental.tienda.models.Empleado;
import org.springframework.data.repository.CrudRepository;

public interface EmpleadoRepo extends CrudRepository<Empleado, Integer> {
}
