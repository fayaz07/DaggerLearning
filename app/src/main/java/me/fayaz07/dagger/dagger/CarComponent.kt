package me.fayaz07.dagger.dagger

import dagger.Component
import me.fayaz07.dagger.MainActivity
import me.fayaz07.dagger.car.Car

@Component(modules = [WheelsModule::class, DieselEngineModule::class])
interface CarComponent {

    fun getCar(): Car;

    fun inject(mainActivity: MainActivity)

}