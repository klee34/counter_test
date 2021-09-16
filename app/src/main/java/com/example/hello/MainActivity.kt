package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun add(v: View) {
        val counterTV = findViewById<TextView>(R.id.counterTV)
        counter = counter + 1
        counterTV.text = counter.toString()
    }

    fun minus(v:View) {

    }
}