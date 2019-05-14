package uk.co.jakelee.daggerexperiments.codeproject

import android.util.Log
import uk.co.jakelee.daggerexperiments.BuildConfig

class EventLogWriter : INotificationAction {
    override fun ActOnNotification(message: String) {
        Log.d(BuildConfig.VERSION_NAME, message)
    }
}