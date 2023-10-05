package com.elifoksas.todoapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.elifoksas.todoapp.data.repo.GorevlerRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class KayıtViewModel : ViewModel() {

    var grepo = GorevlerRepository()
    fun kaydet(gorev_ad:String){
        CoroutineScope(Dispatchers.Main).launch {
            grepo.kaydet(gorev_ad)
        }
    }
}