package uk.co.jakelee.daggerexperiments.codeproject

class AppPoolWatcher {
    // Handle to EventLog writer to write to the logs
    var writer: EventLogWriter? = null

    fun Notify(message: String) {
        if (writer == null) {
            writer = EventLogWriter()
        }
        writer!!.Write(message)
    }
}