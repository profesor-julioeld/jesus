package com.s2daw.demo.dao;

import com.s2daw.demo.models.Bar;
import org.springframework.data.repository.CrudRepository;


public interface BarRepository extends CrudRepository<Bar, Integer> {
}
