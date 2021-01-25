package me.fayaz07.dagger

import dagger.Component

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car;

    fun inject(mainActivity: MainActivity)

}