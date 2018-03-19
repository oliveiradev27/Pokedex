package br.dev.oliveira.pokedex.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import br.dev.oliveira.pokedex.R
import br.dev.oliveira.pokedex.interfaces.contracts.PokedexListContract
import br.dev.oliveira.pokedex.models.Pokedex
import br.dev.oliveira.pokedex.presenters.PokedexListPresenter
import br.dev.oliveira.pokedex.ui.adapters.PokeListAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList

class MainActivity :
        AppCompatActivity(),
        PokedexListContract.View {

    private lateinit var mPokedexList: ArrayList<Pokedex>
    private var mPresenter : PokedexListContract.Presenter = PokedexListPresenter(this)
    lateinit var adapter : PokeListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPokedexList = ArrayList<Pokedex>()
        mPresenter.getAllPokedex()

    }

    override fun showProgressBar() {
        recycler_pokedex_area.visibility = View.GONE
        progress_pokedex_area.visibility = View.VISIBLE
    }

    override fun hideProgressBar() {
        progress_pokedex_area.visibility = View.GONE
        recycler_pokedex_area.visibility = View.VISIBLE
    }

    override fun setPokedex(list: List<Pokedex>) {
        mPokedexList.removeAll(mPokedexList)
        mPokedexList.addAll(list)

        setAdapter()
    }

    fun setAdapter() {
        adapter = PokeListAdapter(mPokedexList)
        recycler_pokedex_area.layoutManager = LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        )
        recycler_pokedex_area.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    override fun showDialogMessage(resourceTitle: Int, resourceMessage: Int) {
        AlertDialog.Builder(this)
                .setTitle(resourceTitle)
                .setMessage(resourceMessage)
                .create()
                .show()
    }

}
