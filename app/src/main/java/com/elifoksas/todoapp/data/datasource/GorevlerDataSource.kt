package com.elifoksas.todoapp.data.datasource

import com.elifoksas.todoapp.data.entity.Gorevler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GorevlerDataSource {

    suspend fun kaydet(gorev_ad:String){

    }

    suspend fun guncelle(gorev_id:Int, gorev_ad: String){

    }

    suspend fun sil(gorev_id: Int){

    }

    suspend fun gorevleriYukle() : List<Gorevler> = withContext(Dispatchers.IO){
        val liste = ArrayList<Gorevler>()
        val g1 = Gorevler(1,"Kod yaz.")
        val g2 = Gorevler(2,"Ben kalbimin orta yerine seni yazdım\n" +
                "Bir gülsen razıyım\n" +
                "Nasıl aldın ahımı, ne geçti söyle eline?\n")
        val g3 = Gorevler(3,"eöflşsöfef")
        liste.add(g1)
        liste.add(g2)
        liste.add(g3)
        return@withContext liste
    }

    suspend fun ara(aramaKelimesi:String) : List<Gorevler> = withContext(Dispatchers.IO){
        val liste = ArrayList<Gorevler>()
        val g1 = Gorevler(1,"Kod")
        liste.add(g1)
        return@withContext liste
    }
}