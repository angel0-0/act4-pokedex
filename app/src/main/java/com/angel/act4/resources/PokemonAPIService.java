package com.angel.act4.resources;
import com.angel.act4.resources.PokemonFetchResults;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PokemonAPIService {
    @GET("pokemon/?limit=50")
    Call<PokemonFetchResults> getPokemons();
}