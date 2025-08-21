package com.example.idtandroid

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Your login layout XML

        val editUserId = findViewById<EditText>(R.id.editUserId)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnHeadphone = findViewById<ImageButton>(R.id.btnHeadphone)
        val btnPower = findViewById<ImageButton>(R.id.btnPower)

        btnLogin.setOnClickListener {
            val userId = editUserId.text.toString().trim()
            val password = editPassword.text.toString().trim()
            if (userId.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                // TODO: Add navigation to next screen after login
            }
        }

        btnHeadphone.setOnClickListener {
            Toast.makeText(this, "Headphone clicked!", Toast.LENGTH_SHORT).show()
        }

        btnPower.setOnClickListener {
            finish()
        }
    }
}