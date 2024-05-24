package com.departamental.tienda.repositories;

import com.departamental.tienda.models.Area;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AreaRepo extends CrudRepository<Area, Integer> {

}
