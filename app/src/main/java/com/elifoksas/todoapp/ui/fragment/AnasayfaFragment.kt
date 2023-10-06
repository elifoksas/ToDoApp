package com.elifoksas.todoapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.elifoksas.todoapp.R
import com.elifoksas.todoapp.data.entity.Gorevler
import com.elifoksas.todoapp.databinding.FragmentAnasayfaBinding
import com.elifoksas.todoapp.ui.adapter.GorevlerAdapter
import com.elifoksas.todoapp.ui.viewmodel.AnasayfaViewModel
import com.elifoksas.todoapp.utils.gecis
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private lateinit var viewModel: AnasayfaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        viewModel.gorevListesi.observe(viewLifecycleOwner){
            val gorevlerAdapter = GorevlerAdapter(requireContext(),it,viewModel)
            binding.recyclerView.adapter = gorevlerAdapter
        }

        binding.floatingActionButton.setOnClickListener {
            Navigation.gecis(it,R.id.kayitFragmentGecis)
        }


        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                ara(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                ara(newText)
                return true
            }

        })

    }

    fun ara(aramaKelimesi:String){
        viewModel.ara(aramaKelimesi)
    }

    override fun onResume() {
        super.onResume()
        viewModel.gorevleriYukle()
    }


}