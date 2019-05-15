package uk.co.jakelee.daggerexperiments.proandroiddev

import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class MyModule {

    @Provides // Tells dagger `MyExample` is injectable
    @Singleton // Tells dagger there can only be one `MyExample` implementor
    fun provideMyExample(): MyExample {
        return MyExampleImpl()
    }

}