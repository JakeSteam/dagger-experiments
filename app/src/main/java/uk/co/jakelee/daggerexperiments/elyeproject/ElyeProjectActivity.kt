package uk.co.jakelee.daggerexperiments.elyeproject;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.Component
import kotlinx.android.synthetic.main.activity_elye_project.*
import uk.co.jakelee.daggerexperiments.R
import javax.inject.Inject

class ElyeProjectActivity : AppCompatActivity() {

    @Inject lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elye_project)
        DaggerMagicBox.create().poke(this)
        text_view.text = info.text
    }
}

class Info(val text: String)

@Component(modules = [Bag::class])
interface MagicBox {
    fun poke(app: ElyeProjectActivity)
}