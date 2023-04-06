package com.example.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.extras?.getString("NAME", "")
        val email = intent.extras?.getString("EMAIL", "")
        val password = intent.extras?.getString("PASSWORD", "")
        val phone = intent.extras?.getString("PHONE", "")

    }
}