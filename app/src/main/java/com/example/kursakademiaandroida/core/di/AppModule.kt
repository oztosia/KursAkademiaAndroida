package com.example.kursakademiaandroida.core.di

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {

    factory {
        LinearLayoutManager(androidApplication())
    }
    factory {
        GridLayoutManager(androidApplication(), 2)
    }

    factory {
        DividerItemDecoration(androidApplication(), LinearLayoutManager.VERTICAL)
    }
}