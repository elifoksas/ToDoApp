package com.elifoksas.todoapp.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.elifoksas.todoapp.data.repo.GorevlerRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetayViewModel @Inject constructor(var grepo : GorevlerRepository) : ViewModel() {

    fun guncelle(gorev_id:Int,gorev_ad:String){
        CoroutineScope(Dispatchers.Main).launch {
            grepo.guncelle(gorev_id,gorev_ad)
        }
    }

}