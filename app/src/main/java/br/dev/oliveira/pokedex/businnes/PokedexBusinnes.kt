package br.dev.oliveira.pokedex.businnes

import android.util.Log
import br.dev.oliveira.pokedex.constants.TagConstants
import br.dev.oliveira.pokedex.interfaces.listeners.OnBindDataListener
import br.dev.oliveira.pokedex.interfaces.listeners.OnResponseListener
import br.dev.oliveira.pokedex.models.Pokedex
import br.dev.oliveira.pokedex.repositories.PokedexRepository

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */
class PokedexBusinnes {

    private var repository: PokedexRepository

    init {
        repository = PokedexRepository()
    }

    fun get(listener: OnBindDataListener<List<Pokedex>>) {
        repository.get(object : OnResponseListener<List<Pokedex>> {
            override fun onSucess(response: List<Pokedex>?) {
                listener.onBind(response)
            }

            override fun onFail(t: Throwable?) {
                Log.e(TagConstants.TAG_LOG, t?.message)
                t?.printStackTrace()
                listener.onBind(null)
            }
        })
    }

}