package com.elifoksas.todoapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.elifoksas.todoapp.R
import com.elifoksas.todoapp.databinding.FragmentKayitBinding
import com.elifoksas.todoapp.ui.viewmodel.AnasayfaViewModel
import com.elifoksas.todoapp.ui.viewmodel.KayıtViewModel

class KayitFragment : Fragment() {
    private lateinit var binding: FragmentKayitBinding
    private lateinit var viewModel: KayıtViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKayitBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : KayıtViewModel by viewModels()
        viewModel = tempViewModel
    }

}