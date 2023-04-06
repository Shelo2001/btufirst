package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val passwordEditText = findViewById<EditText>(R.id.passwordEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val sendDataButton = findViewById<Button>(R.id.sendDataButton)

        sendDataButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()
            val phone = phoneEditText.text.toString()
            val intent = Intent(this, MainActivity2::class.java)

            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("PASSWORD", password)
            intent.putExtra("PHONE", phone)
            startActivity(intent)
        }
    }
}