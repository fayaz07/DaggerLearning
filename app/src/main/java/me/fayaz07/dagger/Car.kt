package me.fayaz07.dagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels
) {

    private val TAG: String = "Car"

    public fun drive() {
        Log.d(TAG, "driving...")
    }
}