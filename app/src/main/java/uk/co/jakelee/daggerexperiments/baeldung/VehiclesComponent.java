package uk.co.jakelee.daggerexperiments.baeldung;

import dagger.Component;

import javax.inject.Singleton;

@Singleton // Since module provides a singleton (brand), our component must be a single ton too
@Component(modules = VehiclesModule.class) // Tells dagger the dependencies should come from `VehiclesModule`
public interface VehiclesComponent {
    Car buildCar();
}
