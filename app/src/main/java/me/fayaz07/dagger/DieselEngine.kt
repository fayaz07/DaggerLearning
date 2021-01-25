package me.fayaz07.dagger

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor(): Engine {

    private val TAG: String = "Car"

    override fun start() {
        Log.d(TAG, "Diesel engine started")
    }
}