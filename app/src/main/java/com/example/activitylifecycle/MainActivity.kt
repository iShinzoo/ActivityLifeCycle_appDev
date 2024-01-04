package com.example.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener() {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        Log.i("my message", "Activity Created->onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("my message", "Activity Restarted->onRestart")

    }

    override fun onStart() {
        super.onStart()
        Log.i("my message", "Activity started->onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("my message", "Activity Resumed->onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("my message", "Activity Paused->onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("my message", "Activity stoped ->onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("my message", "Activity destroyed ->onDestroy")
    }
}