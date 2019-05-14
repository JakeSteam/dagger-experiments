package uk.co.jakelee.daggerexperiments.baeldung

import org.junit.Assert
import org.junit.Test

class BaeldungTests {
    @Test
    fun givenGeneratedComponent_whenBuildingCar_thenDependenciesInjected() {
        // Dagger's implementation of the `VehiclesComponent` interface (a car factory!)
        val component = DaggerVehiclesComponent.create()

        // Assert car 1 exists
        val carOne = component.buildCar()
        Assert.assertNotNull(carOne)
        Assert.assertNotNull(carOne.url)
        Assert.assertNotNull(carOne.engine)
        Assert.assertNotNull(carOne.brand)

        // Assert car 2 exists
        val carTwo = component.buildCar()
        Assert.assertNotNull(carTwo)
        Assert.assertNotNull(carTwo.url)
        Assert.assertNotNull(carTwo.engine)
        Assert.assertNotNull(carTwo.brand)

        // Non-singleton objects are different, singleton objects are the same
        Assert.assertEquals(carOne.url, carTwo.url)
        Assert.assertEquals(carOne.brand, carTwo.brand)
        Assert.assertNotEquals(carOne.engine, carTwo.engine)
    }
}
