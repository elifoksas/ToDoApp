package com.elifoksas.todoapp.di

import com.elifoksas.todoapp.data.datasource.GorevlerDataSource
import com.elifoksas.todoapp.data.repo.GorevlerRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
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
    fun provideGorevlerDataSource() : GorevlerDataSource{
        return GorevlerDataSource()
    }

}