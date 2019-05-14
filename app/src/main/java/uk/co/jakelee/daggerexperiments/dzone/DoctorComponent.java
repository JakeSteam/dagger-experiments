package uk.co.jakelee.daggerexperiments.dzone;

import dagger.Component;

@Component(modules = RandomInjectionModule.class) // Tells dagger where dependencies should be injected from
public interface DoctorComponent {
    Body injectBlood();
}
