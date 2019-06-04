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

class Info @Inject constructor() {
    val text = "Hello Dagger 2"
}

@Component
interface MagicBox {
    fun poke(app: ElyeProjectActivity)
}