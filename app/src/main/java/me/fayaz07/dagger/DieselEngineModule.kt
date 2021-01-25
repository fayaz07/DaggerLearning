package me.fayaz07.dagger

import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(dieselEngine: DieselEngine): Engine
}