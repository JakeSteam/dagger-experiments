package uk.co.jakelee.daggerexperiments.baeldung;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = VehiclesModule.class) // Tells dagger the dependencies should come from `Vehicles Module`
public interface VehiclesComponent {
    Car buildCar();
}
