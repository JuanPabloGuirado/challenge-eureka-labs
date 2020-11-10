package com.eureka_labs.challenge.services.marvel;

import com.eureka_labs.challenge.domain.marvel.Character;

import java.util.List;

public interface MarvelAPIService {
    List<Character> getSuperHeroes();
}
