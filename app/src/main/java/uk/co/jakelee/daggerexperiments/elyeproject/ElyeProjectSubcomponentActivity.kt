package uk.co.jakelee.daggerexperiments.elyeproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import dagger.Component
import dagger.Subcomponent
import kotlinx.android.synthetic.main.activity_elye_project_subcomponent.*
import uk.co.jakelee.daggerexperiments.R
import javax.inject.Inject
import javax.inject.Singleton

class ElyeProjectSubcomponentActivity : AppCompatActivity() {

    private lateinit var mainBox: SingletonBox
    private lateinit var magicBox: MagicBox3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elye_project_subcomponent)
        mainBox = DaggerSingletonBox.create()
        magicBox = mainBox.getMagicBox()

        btn_create.setOnClickListener {
            magicBox = mainBox.getMagicBox()
            useStorage()
        }
        btn_reuse.setOnClickListener {
            useStorage()
        }
    }

    private fun useStorage() {
        val storage = Storage2()
        magicBox.poke(storage)
        text_view.text =
                "\nSingletonOne ${storage.singletonOne.count} " +
                "\nUniqueMagic ${storage.uniqueMagic.count}" +
                "\nNormalMagic ${storage.normalMagic.count} "
    }
}

@Singleton
class SingletonOne @Inject constructor() {
    val count = staticCounter++
}

@MagicScope
class UniqueMagic2 @Inject constructor() {
    val count = staticCounter++
}

class NormalMagic2 @Inject constructor() {
    val count = staticCounter++
}

@Singleton
@Component
interface SingletonBox {
    fun getMagicBox(): MagicBox3
}

@MagicScope
@Subcomponent
interface MagicBox3 {
    fun poke(storage: Storage2)
}

class Storage2 {
    @Inject lateinit var singletonOne: SingletonOne
    @Inject lateinit var uniqueMagic: UniqueMagic
    @Inject lateinit var normalMagic: NormalMagic
}