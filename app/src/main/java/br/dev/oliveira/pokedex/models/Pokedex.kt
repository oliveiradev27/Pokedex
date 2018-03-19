package br.dev.oliveira.pokedex.models

import java.io.Serializable

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */

data class Pokedex (
        var name : String = "",
        var url  : String = ""
) : Serializable