package com.eureka_labs.challenge.domain.marvel;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Character {

    //eliminar atributos inncesarios, dejar solo aquellos que son utiles para la aplicacion
    //siempre que en el mapper este seteado en 'false' el fail_unknown_properties
    private String id;
    private String name;
    private String description;
    private String modified;
    private String resourceURI;
    @JsonProperty("thumbnail")
    private Thumbnail thumbnail;
}
