package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DisciplinasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        // Botão para voltar
        val btnVoltar = findViewById<Button>(R.id.btnVoltarDisciplinas)
        btnVoltar.setOnClickListener {
            // Fecha a tela de Disciplinas e volta para a que estava antes
            finish()
        }
    }
}