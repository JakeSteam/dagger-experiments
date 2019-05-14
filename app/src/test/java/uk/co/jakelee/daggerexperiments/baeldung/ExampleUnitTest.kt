package uk.co.jakelee.daggerexperiments.baeldung

import org.junit.Assert
import org.junit.Test

class ExampleUnitTest {
    @Test
    fun givenGeneratedComponent_whenBuildingCar_thenDependenciesInjected() {
        val component = DaggerVehiclesComponent.create()

        val carOne = component.buildCar()
        val carTwo = component.buildCar()

        Assert.assertNotNull(carOne)
        Assert.assertNotNull(carTwo)
        Assert.assertNotNull(carOne.engine)
        Assert.assertNotNull(carTwo.engine)
        Assert.assertNotNull(carOne.brand)
        Assert.assertNotNull(carTwo.brand)
        Assert.assertNotEquals(carOne.engine, carTwo.engine)
        Assert.assertEquals(carOne.brand, carTwo.brand)
    }
}
