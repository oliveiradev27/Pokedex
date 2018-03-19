package br.dev.oliveira.pokedex.interfaces.listeners

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */
interface OnResponseListener<T> {

    fun onSucess(response : T?)
    fun onFail(t : Throwable?)

}