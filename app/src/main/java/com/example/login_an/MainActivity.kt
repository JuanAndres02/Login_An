package com.example.login_an

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var BotonIniciarSesion:Button
    lateinit var BotonRegistrarse:Button

    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BotonIniciarSesion = findViewById(R.id.BotonIniciarSesion)
        BotonRegistrarse = findViewById(R.id.BotonNoEstoyRegistrado)

        BotonIniciarSesion.setOnClickListener {
            startActivity(Intent(applicationContext, InicioPefil::class.java))
        }

        BotonRegistrarse.setOnClickListener {
            startActivity(Intent(applicationContext, Registro::class.java))
        }

    }
}