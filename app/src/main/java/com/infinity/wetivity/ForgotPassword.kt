package com.infinity.wetivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgotpass)

        supportActionBar?.hide()

        val bcklogin = findViewById<TextView>(R.id.backsign)

        bcklogin.setOnClickListener{
            val intent = Intent(this, SignIn::class.java)
            startActivity(intent)
        }

        val verifikasi = findViewById<Button>(R.id.verifikasiforget)

        verifikasi.setOnClickListener {
            val intent = Intent(this, ForgotPassword2::class.java)
            startActivity(intent)
        }
    }
}