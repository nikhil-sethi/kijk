package com.example.kijk

import android.os.Bundle
//import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity

import androidx.activity.enableEdgeToEdge
import selfupdate.SelfUpdate
import android.util.Log
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        Log.d("CREATION", "and then the world was created")
        SelfUpdate.checkUpdate(this, "nikhil-sethi", "kijk")
    }
}
