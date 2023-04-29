package com.infinity.wetivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide()

        val signin = findViewById<TextView>(R.id.signin)

        signin.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        val signup = findViewById<Button>(R.id.signup)

        signup.setOnClickListener {
            val intent = Intent(this, Recommendation::class.java)
            startActivity(intent)
        }
    }
}