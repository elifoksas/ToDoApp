package com.elifoksas.todoapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.elifoksas.todoapp.R
import com.elifoksas.todoapp.databinding.FragmentAnasayfaBinding
import com.elifoksas.todoapp.ui.viewmodel.AnasayfaViewModel
import com.elifoksas.todoapp.utils.gecis

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

        binding.floatingActionButton.setOnClickListener {
            Navigation.gecis(it,R.id.kayitFragmentGecis)
        }

    }


}