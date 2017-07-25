package com.example.guoxw.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method
        val tv = findViewById(R.id.sample_text) as TextView
        tv.text = stringFromJNI()

        val parent:Parent = Parent("GXW",12)

        parent.eat("hot dog")
        parent.work("mapbar")

        val child:Child = Child("Mike",11)
        child.eat("hamburger")
        child.gotoSchool("北京四中")

        val teamChild :Team<Child> = Team("childTeam",child)
        teamChild.teamWork("play PSP")

        val teamParent : Team<Parent> = Team("parentTeam",parent)
        teamParent.teamWork("play roboto")

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
