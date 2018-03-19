package br.dev.oliveira.pokedex.interfaces.contracts

import br.dev.oliveira.pokedex.models.Pokedex

/**
 * Created by Leandro on 12/03/2018.
 */
interface PokedexListContract {

    interface Presenter {
        fun getAllPokedex()
    }

    interface View {
        fun showProgressBar()
        fun hideProgressBar()
        fun setPokedex(list : List<Pokedex>)
        fun showDialogMessage(resourceTitle : Int, resourceMessage : Int)
    }

}