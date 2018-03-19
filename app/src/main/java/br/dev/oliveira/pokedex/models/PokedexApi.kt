package br.dev.oliveira.pokedex.models

/**
 * Created by Leandro de Oliveira on 16/03/2018.
 */
data class PokedexApi(
        var count: Int = 0,
        var previous : String = "",
        var next : String = "",
        var results : List<Pokedex> = ArrayList()
)