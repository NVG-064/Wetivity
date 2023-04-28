package com.infinity.wetivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class forgetpass2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpass2)

        supportActionBar?.hide()

        val bcklogin = findViewById<TextView>(R.id.backsign)

        bcklogin.setOnClickListener{
            val intent = Intent(this, sign_in::class.java)
            startActivity(intent)
        }
    }
}