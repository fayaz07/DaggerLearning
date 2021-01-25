package me.fayaz07.dagger.dagger

import dagger.Binds
import dagger.Module
import me.fayaz07.dagger.car.PetrolEngine

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun bindEngine(petrolEngine: PetrolEngine): Engine
}