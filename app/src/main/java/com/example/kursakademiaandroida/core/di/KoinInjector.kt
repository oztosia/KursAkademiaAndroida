package com.example.kursakademiaandroida.core.di

import org.koin.core.module.Module


val koinInjector: List<Module> = listOf(
    appModule,
    databaseModule,
    networkModule
)