package com.eureka_labs.challenge.domain.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MarvelResponse {
    @JsonProperty("data")
    private CharacterDataContainer data;
}
