package br.dev.oliveira.pokedex.utils.network

import br.dev.oliveira.pokedex.constants.ApiConstants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrofit {

    private val retrofit  = Retrofit.Builder()
            .baseUrl(ApiConstants.ROOT_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    fun getInitializer() : Retrofit = retrofit

}
