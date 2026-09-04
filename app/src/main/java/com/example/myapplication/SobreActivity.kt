package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SobreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sobre)

        // Botão para voltar
        val btnVoltar = findViewById<Button>(R.id.btnVoltarSobre)
        btnVoltar.setOnClickListener {
            // O comando 'finish()' simplesmente fecha esta tela,
            // fazendo o Android voltar para a tela anterior automaticamente (Home).
            finish()
        }

        // Botão para ir para Disciplinas
        val btnDisciplinas = findViewById<Button>(R.id.btnDisciplinasSobre)
        btnDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }
    }
}