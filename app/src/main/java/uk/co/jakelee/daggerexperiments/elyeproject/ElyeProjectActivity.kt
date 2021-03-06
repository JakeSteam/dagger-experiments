package uk.co.jakelee.daggerexperiments.elyeproject;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.Component
import dagger.Module
import dagger.Provides
import kotlinx.android.synthetic.main.activity_elye_project.*
import uk.co.jakelee.daggerexperiments.R
import javax.inject.Inject
import javax.inject.Qualifier

const val LOVE = "Love"
const val HELLO = "Hello"

class ElyeProjectActivity : AppCompatActivity() {

    @Inject @field:Choose(LOVE) lateinit var infoLove: Info
    @Inject @field:Choose(HELLO) lateinit var infoHello: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elye_project)
        DaggerMagicBox.create().poke(this)
        text_view.text = "${infoLove.text} ${infoHello.text}"
    }
}

@Module
open class Bag {
    @Provides
    @Choose(LOVE)
    open fun sayLoveDagger2(): Info {
        return Info("Love Dagger 2")
    }

    @Provides
    @Choose(HELLO)
    open fun sayHelloDagger2(): Info {
        return Info("Hello Dagger 2")
    }
}

class Info(val text: String)

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: ElyeProjectActivity)
}

@Qualifier
@MustBeDocumented
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class Choose(val value: String = "")