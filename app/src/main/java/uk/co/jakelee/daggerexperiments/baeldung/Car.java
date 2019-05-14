package uk.co.jakelee.daggerexperiments.baeldung;

import javax.inject.Inject;

public class Car {
    private String url;
    private Engine engine;
    private Brand brand;

    @Inject // Telling dagger `Car` is injectable
    public Car(String url, Engine engine, Brand brand) {
        this.url = url;
        this.engine = engine;
        this.brand = brand;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
