package uk.co.jakelee.daggerexperiments.proandroiddev

import dagger.Component
import javax.inject.Singleton


@Singleton // `MyExample` is a singleton, so this component has to be too
@Component(modules = [MyModule::class]) // `MyExample` will be coming from `MyModule`
interface MyComponent {

    fun inject(activity: ProAndroidDevActivity)

}