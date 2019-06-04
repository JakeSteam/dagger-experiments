package uk.co.jakelee.daggerexperiments.elyeproject;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.Component
import kotlinx.android.synthetic.main.activity_elye_project.*
import uk.co.jakelee.daggerexperiments.R
import javax.inject.Inject
import javax.inject.Named

const val LOVE = "Love"
const val HELLO = "Hello"

class ElyeProjectActivity : AppCompatActivity() {

    @Inject @field:Named(LOVE) lateinit var infoLove: Info
    @Inject @field:Named(HELLO) lateinit var infoHello: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elye_project)
        DaggerMagicBox.create().poke(this)
        text_view.text = "${infoLove.text} ${infoHello.text}"
    }
}

class Info(val text: String)

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: ElyeProjectActivity)
}