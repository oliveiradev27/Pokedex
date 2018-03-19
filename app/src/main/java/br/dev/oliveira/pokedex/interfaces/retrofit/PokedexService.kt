package br.dev.oliveira.pokedex.interfaces.retrofit

import br.dev.oliveira.pokedex.models.PokedexApi
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */
interface PokedexService {

    @GET("pokedex")
    fun get(): Call<PokedexApi>


}