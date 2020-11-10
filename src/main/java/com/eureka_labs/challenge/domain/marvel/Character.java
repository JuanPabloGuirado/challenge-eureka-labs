package com.eureka_labs.challenge.domain.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Character {
    private String id;
    private String name;
    private String description;
    private String modified;
    private String resourceURI;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
}
