package uk.co.jakelee.daggerexperiments.proandroiddev

import java.util.*


class MyExampleImpl : MyExample {

    private val mDate: Long = Date().time

    override fun getDate(): Long {
        return mDate
    }

}