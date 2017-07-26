package com.example.guoxw.myapplication.bean

import android.util.Log
import com.example.guoxw.myapplication.interfaces.PersonInterface

/**
 * Created by guoxw on 2017/7/25 0025.
 * @auther guoxw
 * @date 2017/7/25 0025
 * @desciption
 * @package com.example.guoxw.myapplication
 */
open class Person(val name:String,val age:Int) : PersonInterface {


    override fun eat(food: String) {

        Log.i("MainActivity",name.plus(" eat ").plus(food))

    }
}