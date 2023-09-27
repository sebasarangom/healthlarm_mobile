package com.example.healthlarm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class NuevaAlarmaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuevaalarma)

        val getGuardarButton: Button = findViewById(R.id.guardarBtn)
        getGuardarButton.setOnClickListener {
            val guardar = Intent(this, AlarmasActivity::class.java)
            startActivity(guardar)
        }

        val getCancelarButton: Button = findViewById(R.id.cancelarBtn)
        getCancelarButton.setOnClickListener {
            val cancelar = Intent(this, AgregarActivity::class.java)
            startActivity(cancelar)
        }
    }
}