package com.eureka_labs.challenge.controllers;

import com.eureka_labs.challenge.database.entity.SuperHeroe;
import com.eureka_labs.challenge.domain.model.SuperHeroesResponse;
import com.eureka_labs.challenge.services.processor.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private static final Logger LOG = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private Processor processor;

    @RequestMapping(value = "/loadheroes", method = RequestMethod.POST)
    public void loadHeroes() {
        LOG.info("Request to start loading all marvel superheroes to database...");
        processor.loadSuperHeroes();
    }

    @RequestMapping(value = "/superheroes", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SuperHeroesResponse> getAllSuperHeroes() {
        List<SuperHeroe> superHeroeList = processor.getAllSuperHeroes();
        SuperHeroesResponse superHeroesResponse = new SuperHeroesResponse();
        superHeroesResponse.setSuperHeroList(superHeroeList);
        return new ResponseEntity<>(superHeroesResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/superhero/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SuperHeroe> getSuperHeroByName(@PathVariable String name) {
        SuperHeroe superHeroe = processor.getSuperHeroByName(name);
        return new ResponseEntity<>(superHeroe, HttpStatus.OK);
    }

}
