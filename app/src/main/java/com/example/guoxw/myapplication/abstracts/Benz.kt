package com.example.guoxw.myapplication.abstracts

import android.util.Log

/**
 * Created by guoxw on 2017/7/26 0026.
 * @auther guoxw
 * @date 2017/7/26 0026
 * @desciption
 * @package com.example.guoxw.myapplication.abstracts
 */
class Benz(type: Int, brand: String) : Car(type, brand) {
    override fun drive() {

        Log.d("Car",brand.plus(" is driving"))

    }
}