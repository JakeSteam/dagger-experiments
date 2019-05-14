package uk.co.jakelee.daggerexperiments.baeldung;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class VehiclesModule {
    @Provides // Tells dagger this function provides the `Url`
    public String provideUrl() {
        return "https://www.baeldung.com/dagger-2";
    }

    @Provides
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    @Singleton // There can only be one `Brand` (and therefore `VehiclesComponent`)
    public Brand provideBrand() {
        return new Brand("Example");
    }
}
