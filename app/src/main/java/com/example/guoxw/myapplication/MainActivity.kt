package com.example.guoxw.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.TextView
import com.example.guoxw.myapplication.abstracts.Benz
import com.example.guoxw.myapplication.abstracts.Car
import com.example.guoxw.myapplication.bean.Child
import com.example.guoxw.myapplication.bean.Parent
import com.example.guoxw.myapplication.bean.Person
import com.example.guoxw.myapplication.bean.Team
import com.example.guoxw.myapplication.bean.events.WalkEvent
import com.example.guoxw.myapplication.interfaces.listeners.WalkListenerInterface

class MainActivity : AppCompatActivity(), WalkListenerInterface<Person> {

    val TAG = MainActivity::class.java.simpleName.toString()

    override fun walkOntheWay(walkEvent: WalkEvent<Person>) {
        Log.i(TAG, walkEvent.person.name.plus(" is walking on the road!"))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        val tv = findViewById(R.id.sample_text) as TextView
        tv.text = stringFromJNI()

        tv.setOnClickListener(View.OnClickListener {

        })

        val parent: Parent = Parent("GXW", 12)
        parent.walkLintener = this
        parent.eat("hot dog")
        parent.work("mapbar")
        parent.walk()

        val child: Child = Child("Mike", 11)
        child.walkListenerInterface = this
        child.eat("hamburger")
        child.gotoSchool("北京四中")
        child.walk()

        parent.walk()

        val teamChild: Team<Child> = Team("childTeam", child)
        teamChild.teamWork("play PSP")

        val teamParent: Team<Parent> = Team("parentTeam", parent)
        teamParent.teamWork("play roboto")

        val cooper: Benz = Benz(1, "MiniCooper")
        cooper.addOil()
        /**
         * 写法是这样的
         * 我TM的都忘了
         */
        cooper.stopWhenRed(object : Car.MycarStopListener {
            override fun onStop() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onSart() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
//        cooper.stopWhenRed(Car.MycarStopListener)


    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {

        // Used to load the 'native-lib' library on application startup.
        init {
            System.loadLibrary("native-lib")
        }
    }

}
