package com.dimension.pokemon.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AbilityDTO {

    private AbilityDetailsDTO ability;

    @JsonProperty("is_hidden")
    private boolean isHidden;

    private int slot;

}
