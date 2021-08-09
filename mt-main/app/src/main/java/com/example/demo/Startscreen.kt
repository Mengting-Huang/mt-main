package com.example.demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Startscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startscreen)

        Handler().postDelayed({
            val intent = Intent(this@Startscreen,MainActivity::class.java)
            startActivity(intent)
        },3000)
    }
}