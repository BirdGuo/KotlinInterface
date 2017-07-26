package com.example.guoxw.myapplication.bean

import android.util.Log

/**
 * Created by guoxw on 2017/7/25 0025.
 * @auther guoxw
 * @date 2017/7/25 0025
 * @desciption
 * @package com.example.guoxw.myapplication
 */
class Team<T : Person>(val teamName: String, val personT: T) {

    fun teamWork(workName: String) {
        Log.i("MainActivity", "teamName:".plus(teamName).plus("  workName:").plus(workName).plus("  ").plus(personT.name))

    }

}