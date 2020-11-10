package com.eureka_labs.challenge.services.processor;

import com.eureka_labs.challenge.database.entity.SuperHeroe;

import java.util.List;

public interface Processor {


    void loadSuperHeroes();

    List<SuperHeroe> getAllSuperHeroes();

    SuperHeroe getSuperHeroByName(String name);
}
