package com.dimension.pokemon.service;

import com.dimension.pokemon.client.PokemonClient;
import com.dimension.pokemon.model.dto.PokemonDTO;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokemonClient pokemonClient;

    public PokemonService(PokemonClient pokemonClient) {
        this.pokemonClient = pokemonClient;
    }

    public PokemonDTO getPokemonInfo(String name) {

        return pokemonClient.getPokemonByName(name);

    }
}
