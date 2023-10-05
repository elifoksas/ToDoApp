package com.elifoksas.todoapp.ui.fragment

import android.os.Bundle
import android.text.Editable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.elifoksas.todoapp.R
import com.elifoksas.todoapp.databinding.FragmentDetayBinding
import com.elifoksas.todoapp.ui.viewmodel.AnasayfaViewModel
import com.elifoksas.todoapp.ui.viewmodel.DetayViewModel

class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding
    private lateinit var viewModel: DetayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle: DetayFragmentArgs by navArgs()
        val gelenGorev = bundle.gorev
        binding.editTextGorev.text = Editable.Factory.getInstance().newEditable(gelenGorev.gorev_ad)

        binding.buttonGuncelle.setOnClickListener {
            val gorev_ad = binding.editTextGorev.text.toString()
            guncelle(gelenGorev.gorev_id,gorev_ad)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : DetayViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun guncelle(gorev_id:Int,gorev_ad:String){
        viewModel.guncelle(gorev_id,gorev_ad)
    }

}