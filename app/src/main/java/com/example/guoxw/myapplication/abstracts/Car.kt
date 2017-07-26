package com.example.guoxw.myapplication.abstracts

import android.util.Log

/**
 * Created by guoxw on 2017/7/26 0026.
 * @auther guoxw
 * @date 2017/7/26 0026
 * @desciption
 * @package com.example.guoxw.myapplication.abstracts
 */
abstract class Car(val type: Int,val brand: String) {

    abstract fun drive()

    /**
     * 加油
     */
    fun addOil(){

        Log.d("Car",brand.plus(" is completely adding oil"))

        drive()
    }

    fun stopWhenRed(carListener: MycarStopListener  ){}

    interface MycarStopListener{
        fun onStop()
        fun onSart()
    }

}