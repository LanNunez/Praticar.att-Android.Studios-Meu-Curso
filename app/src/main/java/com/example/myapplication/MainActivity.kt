package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Linka esta classe Kotlin com o layout XML da Home
        setContentView(R.layout.activity_main)

        // Encontra o botão "Conheça o Curso" pelo ID que demos no XML
        val btnConhecaCurso = findViewById<Button>(R.id.btnConhecaCurso)

        // Define o que acontece ao clicar nele
        btnConhecaCurso.setOnClickListener {
            // Intent: a "intenção" de ir desta tela (this) para a tela Sobre (SobreActivity)
            val intent = Intent(this, SobreActivity::class.java)
            // Inicia a nova tela
            startActivity(intent)
        }

        // Encontra o botão "Disciplinas" pelo ID
        val btnDisciplinas = findViewById<Button>(R.id.btnDisciplinas)

        // Define a ação de clique
        btnDisciplinas.setOnClickListener {
            val intent = Intent(this, DisciplinasActivity::class.java)
            startActivity(intent)
        }
    }
}