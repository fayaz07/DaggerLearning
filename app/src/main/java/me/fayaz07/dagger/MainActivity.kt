package me.fayaz07.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.fayaz07.dagger.car.Car
import me.fayaz07.dagger.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var car: Car;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var carComponent = DaggerCarComponent.create()
        carComponent.inject(this)
//        car = carComponent.getCar()

        car.drive()
    }
}