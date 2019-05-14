package uk.co.jakelee.daggerexperiments.dzone;

import dagger.Module;
import dagger.Provides;

import java.util.Random;

@Module
public class RandomInjectionModule {

    private static Blood blood;

    public RandomInjectionModule() { }

    @Provides // Tells dagger this function provides the `Blood`
    static Blood provideBlood(){
        if(blood != null) {
            return blood;
        }

        Random rnd = new Random();
        int rndNumber = rnd.nextInt(3);

        switch (rndNumber){
            case 0: blood = new A_Blood(); break;
            case 1: blood = new B_Blood(); break;
            case 2: blood = new AB_Blood(); break;
            case 4: blood = new O_Blood(); break;
            default: blood = new A_Blood();
        }

        return blood;
    }
}