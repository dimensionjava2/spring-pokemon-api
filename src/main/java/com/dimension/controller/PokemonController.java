package com.dimension.pokemon.controller;

import com.dimension.pokemon.model.dto.PokemonDTO;
import com.dimension.pokemon.model.dto.PokemonRequest;
import com.dimension.pokemon.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon/api/v1")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @PostMapping("/poke/retrieve")
    public ResponseEntity<PokemonDTO> getPokemon(@RequestBody PokemonRequest pokemonRequest) {

        PokemonDTO pokemonDTO = pokemonService.getPokemonInfo(pokemonRequest.getName());
        return ResponseEntity.ok(pokemonDTO);
    }
}
