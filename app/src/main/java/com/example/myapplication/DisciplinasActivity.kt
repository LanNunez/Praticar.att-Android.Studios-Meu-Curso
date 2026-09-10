package com.example.myapplication // Mantenha o nome do seu pacote original aqui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DisciplinasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_disciplinas)

        // Configuração do botão de voltar
        val btnVoltar = findViewById<Button>(R.id.btnVoltarDisciplinas)
        btnVoltar.setOnClickListener { finish() }

        // MÁGICA DA PARTE 3: Função para enviar o nome da disciplina para a nova Activity
        fun abrirDetalhes(nomeDaDisciplina: String) {
            val intent = Intent(this, DetalhesDisciplinaActivity::class.java)
            // putExtra coloca uma "etiqueta" na Intent.
            // O primeiro texto é a chave (identificador), o segundo é o valor (o nome da matéria)
            intent.putExtra("NOME_MATERIA", nomeDaDisciplina)
            startActivity(intent)
        }

        // Associando cada botão à nossa função de envio
        findViewById<Button>(R.id.btnProgramacao).setOnClickListener { abrirDetalhes("Programação") }
        findViewById<Button>(R.id.btnBancoDados).setOnClickListener { abrirDetalhes("Banco de Dados") }
        findViewById<Button>(R.id.btnEngSoftware).setOnClickListener { abrirDetalhes("Engenharia de Software") }
        findViewById<Button>(R.id.btnDesWeb).setOnClickListener { abrirDetalhes("Desenvolvimento Web") }
        findViewById<Button>(R.id.btnDesMobile).setOnClickListener { abrirDetalhes("Desenvolvimento Mobile") }
        findViewById<Button>(R.id.btnIA).setOnClickListener { abrirDetalhes("Inteligência Artificial") }
    }
}