package com.example.aulaactivityfragment

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private const val TAG: String = "DetalhesActivity"

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar: Button
    lateinit var txtDetalhes: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById( R.id.btnFechar)
        txtDetalhes = findViewById( R.id.tv_detalhes)

        val bundle = intent.extras
        if (bundle != null) {
            val filme = bundle.getString("Filme")
            val classificacao = bundle.getInt("Classificação")
            val avaliacao = bundle.getDouble("Avaliações")

            val resultado = "Filme: $filme - Classificação: $classificacao - Avaliação: $avaliacao"
            txtDetalhes.text = resultado
        }

        buttonFechar.setOnClickListener {
            finish()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.i(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }
}