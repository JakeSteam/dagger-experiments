package uk.co.jakelee.daggerexperiments.codeproject

class AppPoolWatcher(val action: INotificationAction) {
    
    fun Notify(message: String) {
        action.ActOnNotification(message)
    }
}