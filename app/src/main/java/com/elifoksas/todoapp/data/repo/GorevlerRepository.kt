package com.elifoksas.todoapp.data.repo

import com.elifoksas.todoapp.data.datasource.GorevlerDataSource
import com.elifoksas.todoapp.data.entity.Gorevler

class GorevlerRepository (var gds : GorevlerDataSource){

    suspend fun kaydet(gorev_ad:String) = gds.kaydet(gorev_ad)
    suspend fun guncelle(gorev_id:Int, gorev_ad: String) = gds.guncelle(gorev_id, gorev_ad)
    suspend fun sil(gorev_id: Int) = gds.sil(gorev_id)
    suspend fun gorevleriYukle() : List<Gorevler> = gds.gorevleriYukle()
    suspend fun ara(aramaKelimesi:String) : List<Gorevler> = gds.ara(aramaKelimesi)

}