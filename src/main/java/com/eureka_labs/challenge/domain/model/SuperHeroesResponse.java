package com.eureka_labs.challenge.domain.model;

import com.eureka_labs.challenge.database.entity.SuperHeroe;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
@Data
public class SuperHeroesResponse {

    //lo que devuelve la llamada
    @ApiModelProperty(value = "List with all super heroes")
    List<SuperHeroe> superHeroList;
}
