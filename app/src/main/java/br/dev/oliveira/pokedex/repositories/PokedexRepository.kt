package br.dev.oliveira.pokedex.repositories

import br.dev.oliveira.pokedex.interfaces.listeners.OnResponseListener
import br.dev.oliveira.pokedex.interfaces.retrofit.PokedexService
import br.dev.oliveira.pokedex.models.Pokedex
import br.dev.oliveira.pokedex.models.PokedexApi
import br.dev.oliveira.pokedex.utils.network.Retrofit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */
class PokedexRepository {

    fun get(listener: OnResponseListener<List<Pokedex>>) {
        val pokedexService = Retrofit()
                .getInitializer()
                .create(PokedexService::class.java)

        pokedexService.get().enqueue(object: Callback<PokedexApi>{

            override fun onResponse(call: Call<PokedexApi>?, response: Response<PokedexApi>?) {
                listener.onSucess(response?.body()?.results)
            }

            override fun onFailure(call: Call<PokedexApi>?, t: Throwable?) {
                listener.onFail(t)
            }
        })
    }

}