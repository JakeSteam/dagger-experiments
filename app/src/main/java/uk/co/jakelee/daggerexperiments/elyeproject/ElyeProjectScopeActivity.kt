package uk.co.jakelee.daggerexperiments.elyeproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.Component
import kotlinx.android.synthetic.main.activity_elye_project_scope.*
import uk.co.jakelee.daggerexperiments.R
import javax.inject.Inject
import javax.inject.Scope

class ElyeProjectScopeActivity : AppCompatActivity() {

    private lateinit var magicBox: MagicBox2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elye_project)
        magicBox = DaggerMagicBox2.create()

        btn_create.setOnClickListener {
            val storage = Storage()
            magicBox.poke(storage)
            text_view.text = "Unique ${storage.uniqueMagic.count}" + "\nNormal ${storage.normalMagic.count} "
        }
    }
}

@MagicScope
@Component
interface MagicBox2 {
    fun poke(storage: Storage)
}

class Storage {
    @Inject lateinit var uniqueMagic: UniqueMagic
    @Inject lateinit var normalMagic: NormalMagic
}

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class MagicScope

var staticCounter = 0

@MagicScope
class UniqueMagic @Inject constructor() {
    val count = staticCounter++
}

class NormalMagic @Inject constructor() {
    val count = staticCounter++
}