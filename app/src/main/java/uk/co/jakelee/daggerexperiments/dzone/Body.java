package uk.co.jakelee.daggerexperiments.dzone;

import javax.inject.Inject;

public class Body {
    @Inject
    Blood blood;
    @Inject
    public Body(){}
    public Blood getBlood() {
        return blood;
    }
    public void setBlood(Blood blood) {
        this.blood = blood;
    }
}