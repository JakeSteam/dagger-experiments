package uk.co.jakelee.daggerexperiments.dzone;

import javax.inject.Inject;

public class Body {
    @Inject // Tells dagger the body has blood, which can be injected (literally...)
    Blood blood;

    @Inject
    public Body(){}
}