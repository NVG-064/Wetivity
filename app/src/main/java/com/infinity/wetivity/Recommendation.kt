package com.infinity.wetivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Recommendation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommendation)

        supportActionBar?.hide()
    }
}