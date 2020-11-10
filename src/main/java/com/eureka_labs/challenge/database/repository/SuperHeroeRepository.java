package com.eureka_labs.challenge.database.repository;

import com.eureka_labs.challenge.database.entity.SuperHeroe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface SuperHeroeRepository extends CrudRepository<SuperHeroe, Integer> {

    List<SuperHeroe> findAll();

    SuperHeroe findByName(String name);
}
