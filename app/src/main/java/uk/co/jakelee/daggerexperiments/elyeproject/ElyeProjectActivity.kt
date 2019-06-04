package uk.co.jakelee.daggerexperiments.elyeproject;

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_elye_project.*
import uk.co.jakelee.daggerexperiments.R

class MainActivity : AppCompatActivity() {

        val info = Info()

        override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_elye_project)

                text_view.text = info.text
        }
}

class Info  {
        val text = "Hello Dagger 2"
}