package com.example.healthlarm

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class AgregarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_noalarmas)

        val getAgregarButton: ImageButton = findViewById(R.id.agregarAlarmaBtn)
        getAgregarButton.setOnClickListener {
            val nueva = Intent(this, NuevaAlarmaActivity::class.java)
            startActivity(nueva)
        }
    }
}