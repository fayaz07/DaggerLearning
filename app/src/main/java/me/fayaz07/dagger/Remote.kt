package me.fayaz07.dagger

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor() {

    private val TAG: String = "Car"
    
    fun setListener(car: Car) {
        Log.d(TAG, "Remote connected")
    }

}
