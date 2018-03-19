package br.dev.oliveira.pokedex.ui.viewholders

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import br.dev.oliveira.pokedex.R
import br.dev.oliveira.pokedex.R.id.text_title_area
import br.dev.oliveira.pokedex.models.Pokedex
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.row_pokedex_area.view.*

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */

class PokeItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    var textPokedexArea : TextView

    init {
        textPokedexArea = itemView.findViewById(R.id.text_title_area)
    }

    fun bindData(pokedex: Pokedex){
        textPokedexArea.text = pokedex.name

        textPokedexArea.setOnClickListener {

        }
    }

}
