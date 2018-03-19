package br.dev.oliveira.pokedex.interfaces.listeners

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */
interface OnBindDataListener<T> {

    fun onBind(data : T?)

}