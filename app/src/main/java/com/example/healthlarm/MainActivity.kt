package com.example.healthlarm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStartButton: Button = findViewById(R.id.iniciarBtn)
        getStartButton.setOnClickListener {
            val empieza = Intent(this, AgregarActivity::class.java)
            startActivity(empieza)
        }
    }
}