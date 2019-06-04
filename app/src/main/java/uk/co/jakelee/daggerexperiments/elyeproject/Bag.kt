package uk.co.jakelee.daggerexperiments.elyeproject

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class Bag {
    @Provides @Named(LOVE)
    open fun sayLoveDagger2(): Info {
        return Info("Love Dagger 2")
    }

    @Provides @Named(HELLO)
    open fun sayHelloDagger2(): Info {
        return Info("Hello Dagger 2")
    }
}