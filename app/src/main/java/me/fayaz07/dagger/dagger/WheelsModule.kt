package me.fayaz07.dagger.dagger

import dagger.Module
import dagger.Provides
import me.fayaz07.dagger.car.Rims
import me.fayaz07.dagger.car.Tyres
import me.fayaz07.dagger.car.Wheels

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