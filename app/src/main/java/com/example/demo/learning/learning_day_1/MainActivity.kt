package com.example.demo.learning.learning_day_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = findViewById<Button>(R.id.Button1)
        x.setOnClickListener{
            Toast.makeText(this@MainActivity,"Login In", Toast.LENGTH_LONG).show() //here show is use to show to user
        }
        var y = findViewById<Button>(R.id.Button5)
        y.setOnClickListener{
            Toast.makeText(this@MainActivity,"Sign In", Toast.LENGTH_LONG).show() //here show is use to show to user
        }
    }
}