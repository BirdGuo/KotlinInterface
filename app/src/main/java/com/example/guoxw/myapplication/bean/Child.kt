package com.example.guoxw.myapplication.bean

import android.util.Log
import com.example.guoxw.myapplication.bean.events.WalkEvent
import com.example.guoxw.myapplication.interfaces.ChildInterface
import com.example.guoxw.myapplication.interfaces.listeners.WalkListenerInterface

/**
 * Created by guoxw on 2017/7/25 0025.
 * @auther guoxw
 * @date 2017/7/25 0025
 * @desciption
 * @package com.example.guoxw.myapplication
 */
class Child(name: String, age: Int) : Person(name, age), ChildInterface {

    var walkListenerInterface: WalkListenerInterface<Person>? = null

    override fun gotoSchool(school: String) {
        Log.i("MainActivity", "Child name is".plus(name).plus(" is go to").plus(school))
    }

    private val TAG: String = Child::class.java.name.toString()

    override fun eat(food: String) {
        super.eat(food)
        Log.i("MainActivity", "Child name is".plus(name).plus(" is eating").plus(food))
    }

    fun walk(){
        Log.i("MainActivity", "Child name is".plus(name).plus(" is walk"))
        walkListenerInterface!!.walkOntheWay(WalkEvent(this))

    }

}