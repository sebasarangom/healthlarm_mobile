package com.example.healthlarm

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class AlarmasActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarmas)

        val getEditarButton: ImageButton = findViewById(R.id.editarId)
        getEditarButton.setOnClickListener {
            val editar = Intent(this, NuevaAlarmaActivity::class.java)
            startActivity(editar)
        }

        val getEliminarButton: ImageButton = findViewById(R.id.eliminarId)
        getEliminarButton.setOnClickListener {
            val eliminar = Intent(this, EliminarActivity::class.java)
            startActivity(eliminar)
        }
    }
}