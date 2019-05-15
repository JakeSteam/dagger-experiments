package uk.co.jakelee.daggerexperiments.proandroiddev.mocks

import dagger.Module
import dagger.Provides
import uk.co.jakelee.daggerexperiments.proandroiddev.MyExample
import javax.inject.Singleton


@Module
class MyModuleMock {

    @Provides
    @Singleton
    internal fun provideMyExample(): MyExample {
        return MyExampleImplMock()
    }

}