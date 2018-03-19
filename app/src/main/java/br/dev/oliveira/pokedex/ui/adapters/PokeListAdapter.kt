package br.dev.oliveira.pokedex.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import br.dev.oliveira.pokedex.R
import br.dev.oliveira.pokedex.models.Pokedex
import br.dev.oliveira.pokedex.ui.viewholders.PokeItemViewHolder

/**
 * Created by Leandro de Oliveira on 12/03/2018.
 */

class PokeListAdapter(var pokedexList : List<Pokedex>)
    : RecyclerView.Adapter<PokeItemViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeItemViewHolder {

        // Obtém inflater
        val context = parent?.getContext()
        val inflater = LayoutInflater.from(context)

        // Instancia o layout para manipulação dos elementos
        val view = inflater.inflate(R.layout.row_pokedex_area, parent, false)

        // Passa a ViewHolder
        return PokeItemViewHolder(view)

    }

    override fun onBindViewHolder(holder: PokeItemViewHolder, position: Int) {
        val post = this.pokedexList[position]
        holder.bindData(post)
    }

    override fun getItemCount(): Int = pokedexList.size

}
