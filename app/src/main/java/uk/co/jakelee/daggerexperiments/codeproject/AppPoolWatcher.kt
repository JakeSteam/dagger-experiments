package uk.co.jakelee.daggerexperiments.codeproject

class AppPoolWatcher {

    var action: INotificationAction? = null

    fun Notify(message: String) {
        if (action == null) {
            // Here we will map the abstraction i.e. interface to concrete class
        }
        action!!.ActOnNotification(message)
    }
}