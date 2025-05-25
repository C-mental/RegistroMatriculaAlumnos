package com.example.registromatriculaalumnos

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val etCodigo = findViewById<EditText>(R.id.etCodigo)
        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etCorreo = findViewById<EditText>(R.id.etCorreo)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val btnRegistrar = findViewById<Button>(R.id.btnRegistrar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnRegistrar.setOnClickListener {
            val codigo = etCodigo.text.toString().trim()
            val nombre = etNombre.text.toString().trim()
            val correo = etCorreo.text.toString().trim()
            val direccion = etDireccion.text.toString().trim()

            val resultado = "Alumno registrado:\nCódigo: $codigo\nNombre: $nombre\nCorreo: $correo\nDirección: $direccion"
            tvResultado.text = resultado
        }
    }
}