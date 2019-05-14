package uk.co.jakelee.daggerexperiments.dzone;

import dagger.Component;

@Component( modules = RandomInjectionModule.class )
public interface DoctorComponent {
    Body injectBlood();
}
