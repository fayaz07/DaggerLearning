package me.fayaz07.dagger

import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims() = Rims()

    @Provides
    fun provideTyres(): Tyres {
        var tyres: Tyres = Tyres()
        tyres.inflate()
        return tyres
    }

    @Provides
    fun provideWheels(rims: Rims, tyres: Tyres) = Wheels(rims, tyres)
}