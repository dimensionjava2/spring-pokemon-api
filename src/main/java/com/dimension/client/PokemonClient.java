package com.dimension.pokemon.client;

import com.dimension.pokemon.model.dto.PokemonDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokemonApi", url = "${pokemon.api.url}")
public interface PokemonClient {

    @GetMapping("/{name}")
    PokemonDTO getPokemonByName(@PathVariable("name") String name);
}

