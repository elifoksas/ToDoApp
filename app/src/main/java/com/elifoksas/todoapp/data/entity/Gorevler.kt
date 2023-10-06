package com.elifoksas.todoapp.data.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull
import java.io.Serializable

@Entity(tableName = "toDos")
data class Gorevler (
                     @PrimaryKey(autoGenerate = true)
                     @ColumnInfo(name = "id") @NotNull var gorev_id:Int,
                     @ColumnInfo(name = "name") @NotNull var gorev_ad:String) : Serializable {
}