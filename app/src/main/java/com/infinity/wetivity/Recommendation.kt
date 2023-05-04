package com.infinity.wetivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Recommendation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        supportActionBar?.hide()

        val signup = findViewById<Button>(R.id.btn_next)

        signup.setOnClickListener{
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
    }
}