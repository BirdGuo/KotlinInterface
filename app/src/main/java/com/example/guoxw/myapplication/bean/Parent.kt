package com.example.guoxw.myapplication.bean

import android.util.Log
import com.example.guoxw.myapplication.bean.events.WalkEvent
import com.example.guoxw.myapplication.interfaces.ParentInterface
import com.example.guoxw.myapplication.interfaces.listeners.WalkListenerInterface

/**
 * Created by guoxw on 2017/7/25 0025.
 * @auther guoxw
 * @date 2017/7/25 0025
 * @desciption
 * @package com.example.guoxw.myapplication
 */
class Parent(name: String, age: Int) : Person(name, age), ParentInterface {

    var walkLintener: WalkListenerInterface<Person> ?=null

    private val TAG: String = Parent::class.java.name.toString()

    override fun work(jobName: String) {
        Log.i("MainActivity", "Parent name is".plus(name).plus(" is doing").plus(jobName))
    }

    override fun eat(food: String) {
        super.eat(food)
        Log.i("MainActivity", "Parent name is".plus(name).plus(" is eating").plus(food))
    }

    fun walk(){
        Log.i("MainActivity", "Parent name is ".plus(name).plus(" is walk"))
        walkLintener!!.walkOntheWay(WalkEvent(this))
    }


}