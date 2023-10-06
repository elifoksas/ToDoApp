package com.elifoksas.todoapp.data.datasource

import com.elifoksas.todoapp.data.entity.Gorevler
import com.elifoksas.todoapp.room.GorevlerDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GorevlerDataSource(var gdao : GorevlerDao) {

    suspend fun kaydet(gorev_ad:String){
        val yeniGorev = Gorevler(0,gorev_ad)
        gdao.kaydet(yeniGorev)
    }

    suspend fun guncelle(gorev_id:Int, gorev_ad: String){
        val guncelGorev = Gorevler(gorev_id,gorev_ad)
        gdao.guncelle(guncelGorev)
    }

    suspend fun sil(gorev_id: Int){
        val silinenGorev = Gorevler(gorev_id,"")
        gdao.sil(silinenGorev)
    }

    suspend fun gorevleriYukle() : List<Gorevler> = withContext(Dispatchers.IO){
        return@withContext gdao.gorevleriYukle()
    }

    suspend fun ara(aramaKelimesi:String) : List<Gorevler> = withContext(Dispatchers.IO){
        return@withContext gdao.ara(aramaKelimesi)
    }
}