package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //onCreate creates an activity and sets the layout
        //super.onCreate: tells Android to also run the code in the parents class(AppCompatActivity)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        //This sets the user interface layout for the XML activity Which is activity_spalsh
        //Intent from splash to another activity
        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()

            }, 2000
            //This block introduces 2 seciond delay (2000 milliseconds) before moving to the main part of the app
        )

    }
}
//Intent:Lets you move from one activity to another
//Bundel:Caries data betwen activities or store UI state
//Handler and looper:used for introducing delay
//App compact Activity:base class of activities using modern features