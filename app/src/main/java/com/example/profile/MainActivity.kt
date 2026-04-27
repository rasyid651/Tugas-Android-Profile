package com.example.profile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

// import library
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnNext = findViewById<Button>(R.id.btnLanjut)
        // membuat fungsi klik pada button
        btnNext.setOnClickListener {
            val intent = Intent(this, Profile2::class.java)
            startActivity(intent)
        }

    }
}