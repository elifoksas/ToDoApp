package com.elifoksas.todoapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.elifoksas.todoapp.R
import com.elifoksas.todoapp.databinding.FragmentKayitBinding

class KayitFragment : Fragment() {
    private lateinit var binding: FragmentKayitBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKayitBinding.inflate(inflater, container, false)
        return binding.root
    }

}