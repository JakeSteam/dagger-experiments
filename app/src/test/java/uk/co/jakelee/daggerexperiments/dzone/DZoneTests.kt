package uk.co.jakelee.daggerexperiments.dzone

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.anyOf
import org.junit.Assert
import org.junit.Test


class DZoneTests {
    @Test
    fun givenGeneratedComponent_whenInjectingBlood_thenDependenciesInjected() {
        // Dagger's implementation of the `DoctorComponent` interface
        val component = DaggerDoctorComponent.create()

        // Create first body
        val bodyOne = component.injectBlood()
        Assert.assertNotNull(bodyOne)
        Assert.assertNotNull(bodyOne.blood)
        Assert.assertThat(bodyOne.blood.kindOfBlood, anyOf(`is`("A"), `is`("B"), `is`("AB"), `is`("O")))

        // Create second body
        val bodyTwo = component.injectBlood()
        Assert.assertNotNull(bodyTwo)
        Assert.assertNotNull(bodyTwo.blood)
        Assert.assertThat(bodyTwo.blood.kindOfBlood, anyOf(`is`("A"), `is`("B"), `is`("AB"), `is`("O")))

        // Check the two body objects are different
        Assert.assertNotEquals(bodyOne, bodyTwo)
    }
}
