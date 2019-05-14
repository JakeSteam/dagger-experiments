package uk.co.jakelee.daggerexperiments.proandroiddev

import android.app.Application

class MyApplication : Application() {
    var myComponent: MyComponent? = null

    override fun onCreate() {
        super.onCreate()
        myComponent = createMyComponent()
    }

    private fun createMyComponent(): MyComponent {
        return DaggerMyComponent
            .builder()
            .myModule(MyModule())
            .build()
    }

}