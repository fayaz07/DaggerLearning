package me.fayaz07.dagger.car

import android.util.Log
import me.fayaz07.dagger.dagger.Engine
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {

    private val TAG: String = "Car"

    override fun start() {
        Log.d(TAG, "Diesel engine started")
    }
}