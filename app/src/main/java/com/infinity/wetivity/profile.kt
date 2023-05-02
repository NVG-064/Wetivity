package com.infinity.wetivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.hide()

        val logout = findViewById<Button>(R.id.btnKeluarAkun)

        logout.setOnClickListener{
            val intent = Intent(this, SplashScreen::class.java)
            startActivity(intent)
        }
    }
}