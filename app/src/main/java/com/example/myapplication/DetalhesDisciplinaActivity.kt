package com.example.myapplication // Mantenha o seu pacote original

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetalhesDisciplinaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes_disciplina)

        // Botão de voltar
        val btnVoltar = findViewById<Button>(R.id.btnVoltarDetalhes)
        btnVoltar.setOnClickListener { finish() }

        // RECEBENDO A INFORMAÇÃO
        val nomeRecebido = intent.getStringExtra("NOME_MATERIA") ?: "Disciplina Desconhecida"

        val txtNome = findViewById<TextView>(R.id.txtNomeDisciplina)
        val txtCargaHoraria = findViewById<TextView>(R.id.txtCargaHoraria)
        val txtNivel = findViewById<TextView>(R.id.txtNivel)
        val txtPreRequisito = findViewById<TextView>(R.id.txtPreRequisito)
        val txtDescricao = findViewById<TextView>(R.id.txtDescricao)

        txtNome.text = nomeRecebido

        when (nomeRecebido) {
            "Desenvolvimento Mobile" -> {
                txtCargaHoraria.text = "Carga horária: 80 horas"
                txtNivel.text = "Nível: Intermediário"
                txtPreRequisito.text = "Pré-requisito: Programação"
                txtDescricao.text = "Nesta disciplina são estudados conceitos relacionados ao desenvolvimento de aplicativos para Android."
            }
            "Programação" -> {
                txtCargaHoraria.text = "Carga horária: 120 horas"
                txtNivel.text = "Nível: Básico"
                txtPreRequisito.text = "Pré-requisito: Nenhum"
                txtDescricao.text = "Introdução à lógica de programação, estruturas de repetição e algoritmos fundamentais."
            }
            "Inteligência Artificial" -> {
                txtCargaHoraria.text = "Carga horária: 60 horas"
                txtNivel.text = "Nível: Avançado"
                txtPreRequisito.text = "Pré-requisito: Banco de Dados e Programação"
                txtDescricao.text = "Estudo de machine learning, redes neurais e processamento de linguagem natural."
            }
            else -> {
                txtCargaHoraria.text = "Carga horária: 60 horas"
                txtNivel.text = "Nível: Intermediário"
                txtPreRequisito.text = "Pré-requisito: Programação"
                txtDescricao.text = "Estudos e práticas avançadas referentes aos conceitos de $nomeRecebido."
            }
        }

        // ==========================================
        // MÁGICA DA OPÇÃO B: BOTÃO COMPARTILHAR
        // ==========================================
        val btnCompartilhar = findViewById<Button>(R.id.btnCompartilhar)

        btnCompartilhar.setOnClickListener {
            // 1. Preparamos o texto que será enviado pro WhatsApp, E-mail, etc.
            val textoParaEnviar = "Dá uma olhada nessa disciplina: $nomeRecebido! O nível é incrível."

            // 2. Criamos uma Intent Implícita com a ação de ENVIAR (ACTION_SEND)
            val intentCompartilhar = Intent(Intent.ACTION_SEND)
            intentCompartilhar.type = "text/plain" // Dizendo que estamos enviando apenas texto
            intentCompartilhar.putExtra(Intent.EXTRA_TEXT, textoParaEnviar)

            // 3. O createChooser abre a gaveta do Android perguntando qual aplicativo usar
            startActivity(Intent.createChooser(intentCompartilhar, "Compartilhar disciplina via..."))
        }
    }
}