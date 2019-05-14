package uk.co.jakelee.daggerexperiments.codeproject

class AppPoolWatcher {

    var action: INotificationAction? = null

    fun Notify(action: INotificationAction, message: String) {
        this.action = action
        action.ActOnNotification(message)
    }
}