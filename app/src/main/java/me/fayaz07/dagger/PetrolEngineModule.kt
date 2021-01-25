package me.fayaz07.dagger

import dagger.Module
import dagger.Provides

@Module
class PetrolEngineModule {

    @Provides
    fun providePetrolEngine(petrolEngine: PetrolEngine) : Engine  {
        return petrolEngine
    }
}