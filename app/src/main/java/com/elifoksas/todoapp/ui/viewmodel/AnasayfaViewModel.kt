package com.elifoksas.todoapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.elifoksas.todoapp.data.entity.Gorevler
import com.elifoksas.todoapp.data.repo.GorevlerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor(var grepo : GorevlerRepository) : ViewModel() {

    var gorevListesi = MutableLiveData<List<Gorevler>>()

    init {
        gorevleriYukle()
    }

    fun sil(gorev_id:Int){
        CoroutineScope(Dispatchers.Main).launch {
            grepo.sil(gorev_id)
        }
    }

    fun gorevleriYukle(){
        CoroutineScope(Dispatchers.Main).launch {
            gorevListesi.value = grepo.gorevleriYukle()
        }
    }

    fun ara(aramaKelimesi:String){
        CoroutineScope(Dispatchers.Main).launch {
            gorevListesi.value = grepo.ara(aramaKelimesi)
        }
    }






}