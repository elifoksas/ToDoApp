package com.elifoksas.todoapp.utils

import android.view.View
import androidx.navigation.NavDirections
import androidx.navigation.Navigation

fun Navigation.gecis(view: View, id:Int){
    findNavController(view).navigate(id)
}

fun Navigation.gecis(view: View, id: NavDirections){
    findNavController(view).navigate(id)
}