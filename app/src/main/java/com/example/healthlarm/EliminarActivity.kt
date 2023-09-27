package com.example.healthlarm

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity

class EliminarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eliminar)

        val getSiButton: Button = findViewById(R.id.siBtn)
        getSiButton.setOnClickListener {
            val siEliminado = Intent(this, AgregarActivity::class.java)
            startActivity(siEliminado)
        }

        val getNoButton: Button = findViewById(R.id.noBtn)
        getNoButton.setOnClickListener {
            val noEliminado = Intent(this, AlarmasActivity::class.java)
            startActivity(noEliminado)
        }
    }
}