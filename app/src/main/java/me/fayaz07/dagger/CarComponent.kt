package me.fayaz07.dagger

import dagger.Component

@Component
interface CarComponent {

    fun getCar(): Car;

    fun inject(mainActivity: MainActivity)

}