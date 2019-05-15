package uk.co.jakelee.daggerexperiments.proandroiddev.mocks

import dagger.Component
import uk.co.jakelee.daggerexperiments.proandroiddev.MyComponent
import javax.inject.Singleton


@Singleton
@Component(modules = [MyModuleMock::class])
interface MyComponentMock : MyComponent