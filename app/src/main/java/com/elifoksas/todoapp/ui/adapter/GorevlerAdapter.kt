package com.elifoksas.todoapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.elifoksas.todoapp.R
import com.elifoksas.todoapp.data.entity.Gorevler
import com.elifoksas.todoapp.databinding.ItemTasarimBinding
import com.elifoksas.todoapp.ui.fragment.AnasayfaFragmentDirections
import com.elifoksas.todoapp.ui.viewmodel.AnasayfaViewModel
import com.elifoksas.todoapp.utils.gecis

class GorevlerAdapter (private val mContext:Context,
                       private val gorevlerListesi:List<Gorevler>, var viewModel: AnasayfaViewModel) : RecyclerView.Adapter<GorevlerAdapter.TasarimTutucu>(){

    inner class TasarimTutucu(val binding: ItemTasarimBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TasarimTutucu {
        val binding = ItemTasarimBinding.inflate(LayoutInflater.from(mContext),parent,false)
        return TasarimTutucu(binding)
    }

    override fun getItemCount(): Int {
        return gorevlerListesi.size
    }
    override fun onBindViewHolder(holder: TasarimTutucu, position: Int) {
        val binding = holder.binding
        val gorev = gorevlerListesi[position]

        binding.textViewGorev.text = gorev.gorev_ad

        binding.cardViewGorev.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayFragmentGecis(gorev= gorev)
            Navigation.gecis(it,gecis)
        }
    }

    fun sil(gorev_id:Int){
        viewModel.sil(gorev_id)
    }
}