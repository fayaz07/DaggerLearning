package me.fayaz07.dagger.car

import android.util.Log
import me.fayaz07.dagger.dagger.Engine
import javax.inject.Inject

class Car @Inject constructor(
    private val engine: Engine,
    private val wheels: Wheels
) {

    private val TAG: String = "Car"

    fun drive() {
        engine.start()
        Log.d(TAG, "driving...")
    }

    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }
}