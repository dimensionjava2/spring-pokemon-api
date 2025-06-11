package com.dimension.pokemon.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PokemonDTO {

    private List<AbilityDTO> abilities;

    @JsonProperty("base_experience")
    private Integer baseExperience;

}
