package me.fayaz07.dagger.dagger

import dagger.Binds
import dagger.Module
import me.fayaz07.dagger.car.DieselEngine

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun bindEngine(dieselEngine: DieselEngine): Engine
}