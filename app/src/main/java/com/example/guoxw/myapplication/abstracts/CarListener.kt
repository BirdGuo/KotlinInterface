package com.example.guoxw.myapplication.abstracts

/**
 * Created by guoxw on 2017/7/26 0026.
 * @auther guoxw
 * @createTime 2017/7/26 0026 13:29
 * @packageName com.example.guoxw.myapplication.abstracts
 */
open class CarListener {

    interface onCarStopListener {

        fun onStop()

        fun onStart()
    }

}