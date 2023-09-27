package com.example.healthlarm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class EditarAlarmaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editaralarma)

        val getEditarButton: Button = findViewById(R.id.editarBtn)
        getEditarButton.setOnClickListener {
            val editar = Intent(this, AlarmasActivity::class.java)
            startActivity(editar)
        }

        val getCancelarButton: Button = findViewById(R.id.cancelarBtn)
        getCancelarButton.setOnClickListener {
            val cancelar = Intent(this, AlarmasActivity::class.java)
            startActivity(cancelar)
        }
    }
}