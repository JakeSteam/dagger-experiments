package uk.co.jakelee.daggerexperiments.proandroiddev

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import uk.co.jakelee.daggerexperiments.R.id.tvDate
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import uk.co.jakelee.daggerexperiments.R
import uk.co.jakelee.daggerexperiments.proandroiddev.mocks.DaggerMyComponentMock
import uk.co.jakelee.daggerexperiments.proandroiddev.mocks.MyModuleMock

@RunWith(AndroidJUnit4::class)
open class ProAndroidDevTests {
    @get:Rule
    var mActivityTestRule: ActivityTestRule<ProAndroidDevActivity> =
        object : ActivityTestRule<ProAndroidDevActivity>(ProAndroidDevActivity::class.java) {

            override fun beforeActivityLaunched() {
                val application = InstrumentationRegistry
                    .getInstrumentation()
                    .targetContext
                    .applicationContext as MyApplication
                val myComponent = DaggerMyComponentMock
                    .builder()
                    .myModuleMock(MyModuleMock())
                    .build()
                application.myComponent = myComponent
            }

        }

    @Test
    fun formattedDateShown() {
        onView(withId(R.id.tvDate)).check(matches(withText("1 Jan 1970 00:00:00 GMT")))
    }
}
