package com.eureka_labs.challenge.domain.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class CharacterDataContainer {
    @JsonProperty("results")
    private List<Character> characterList;
}
