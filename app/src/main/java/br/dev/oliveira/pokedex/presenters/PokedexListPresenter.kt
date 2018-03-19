package br.dev.oliveira.pokedex.presenters

import br.dev.oliveira.pokedex.R
import br.dev.oliveira.pokedex.businnes.PokedexBusinnes
import br.dev.oliveira.pokedex.interfaces.contracts.PokedexListContract
import br.dev.oliveira.pokedex.interfaces.listeners.OnBindDataListener
import br.dev.oliveira.pokedex.models.Pokedex

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */

class PokedexListPresenter constructor(val mView: PokedexListContract.View):
        PokedexListContract.Presenter {

    val mBusiness: PokedexBusinnes = PokedexBusinnes()

    override fun getAllPokedex() {

        mView.showProgressBar()

        mBusiness.get(object : OnBindDataListener<List<Pokedex>> {
            override fun onBind(data: List<Pokedex>?) {
                if (data != null) {
                    mView.setPokedex(data)
                    mView.hideProgressBar()
                } else {
                    mView.hideProgressBar()
                    mView.showDialogMessage(
                           R.string.mensagem_do_sistema,
                           R.string.erro_acesso_servidor
                    )
                }
            }
        })
    }
}