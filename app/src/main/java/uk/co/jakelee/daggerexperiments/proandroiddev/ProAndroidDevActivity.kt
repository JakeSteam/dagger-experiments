package uk.co.jakelee.daggerexperiments.proandroiddev

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_pro_android_dev.*
import uk.co.jakelee.daggerexperiments.R
import java.util.*
import javax.inject.Inject

class ProAndroidDevActivity : AppCompatActivity() {

    @set:Inject
    var myExample: MyExample? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pro_android_dev)
        (application as MyApplication)
            .myComponent!!
            .inject(this@ProAndroidDevActivity)
        tvDate.text = Date(myExample!!.getDate()).toGMTString()
    }
}
