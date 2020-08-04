package com.example.kursakademiaandroida.core.di

import androidx.room.Room
import com.example.kursakademiaandroida.features.data.RickAndMortyDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidApplication(),
            RickAndMortyDatabase::class.java,
            "database-name"
        )
            .build()
    }

}