package me.fayaz07.dagger

import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine
}