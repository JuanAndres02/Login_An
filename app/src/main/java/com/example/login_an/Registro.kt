package com.example.login_an

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Registro : AppCompatActivity() {

    lateinit var BotonRegistrarse: Button
    lateinit var BotonIniciarSesion: Button

    //Para el campo Nombre:
    lateinit var TxtNombre:EditText

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        //Capturar el campo nombre:
        TxtNombre = findViewById(R.id.TxtNombre)

        BotonRegistrarse = findViewById(R.id.BotonRegistrar)
        BotonIniciarSesion = findViewById(R.id.BotonYaTengoUnaCuent)

        BotonIniciarSesion.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }

        BotonRegistrarse.setOnClickListener {

            //Texto del campo nombre:
            var nombre = TxtNombre.toString().trim()

            //Validaciones:

            //Si el nombre esta vacio pongo un error
            if (nombre == ""){
                TxtNombre.setError("Campo requerido")
            }

            else{
                startActivity(Intent(applicationContext, InicioPefil::class.java))
            }
        }
    }
}