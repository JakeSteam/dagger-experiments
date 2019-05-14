package uk.co.jakelee.daggerexperiments.codeproject

import android.util.Log
import uk.co.jakelee.daggerexperiments.BuildConfig

class EventLogWriter {
    fun Write(message: String) {
        Log.d(BuildConfig.VERSION_NAME, message)
    }
}