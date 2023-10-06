package com.elifoksas.todoapp.room

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.elifoksas.todoapp.data.entity.Gorevler

@Database(entities = [Gorevler::class], version = 1)
abstract class Database : RoomDatabase(){

    abstract fun getGorevlerDao() : GorevlerDao

}