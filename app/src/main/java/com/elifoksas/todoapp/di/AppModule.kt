package com.elifoksas.todoapp.di

import android.content.Context
import androidx.room.Room
import com.elifoksas.todoapp.data.datasource.GorevlerDataSource
import com.elifoksas.todoapp.data.repo.GorevlerRepository
import com.elifoksas.todoapp.room.Database
import com.elifoksas.todoapp.room.GorevlerDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule  {

    @Provides
    @Singleton
    fun provideGorevlerRepository(gds: GorevlerDataSource) : GorevlerRepository{
        return GorevlerRepository(gds)
    }

    @Provides
    @Singleton
    fun provideGorevlerDataSource(gdao : GorevlerDao) : GorevlerDataSource{
        return GorevlerDataSource(gdao)
    }

    @Provides
    @Singleton
    fun provideGorevlerDao(@ApplicationContext context: Context) : GorevlerDao{
        val db = Room.databaseBuilder(context,Database::class.java,"toDos.sqlite")
            .createFromAsset("toDos.sqlite").build()
        return db.getGorevlerDao()
    }

}