package com.infinity.wetivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        supportActionBar?.hide()

        val signup = findViewById<TextView>(R.id.signup)

        signup.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        val forget = findViewById<TextView>(R.id.forgetpassword)

        forget.setOnClickListener {
            val intent = Intent(this,  ForgotPassword::class.java)
            startActivity(intent)
        }
    }
}