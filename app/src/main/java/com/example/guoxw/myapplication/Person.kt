package com.example.guoxw.myapplication

import android.util.Log

/**
 * Created by guoxw on 2017/7/25 0025.
 * @auther guoxw
 * @date 2017/7/25 0025
 * @desciption
 * @package com.example.guoxw.myapplication
 */
open class Person(val name:String,val age:Int) :PersonInterface{


    override fun eat(food: String) {

        Log.i("MainActivity",name.plus(" eat ").plus(food))

    }
}