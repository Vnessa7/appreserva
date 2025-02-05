package com.example.appreserva.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.appreserva.R
import com.example.appreserva.admin.AdminActivity
import com.example.appreserva.client.ClientActivity



class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val usernameEditText: EditText = findViewById(R.id.editTextUsername)
        val passwordEditText: EditText = findViewById(R.id.editTextPassword)
        val loginButton: Button = findViewById(R.id.buttonLogin)
        val registerText: TextView = findViewById(R.id.textRegister)
        val forgotPasswordText: TextView = findViewById(R.id.buttonChangePassword)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Por favor, ingresa tus credenciales", Toast.LENGTH_SHORT).show()
            } else {
                // Aquí puedes agregar la lógica de autenticación
                // Verificar las credenciales ingresadas y redirigir a la pantalla correspondiente

                if (username == "admin" && password == "admin123") {
                    // Ejemplo de redirección a la actividad de administrador
                    val intent = Intent(this, AdminActivity::class.java)
                    startActivity(intent)
                    finish()
                } else {
                    // Ejemplo de redirección a la actividad de cliente
                    val intent = Intent(this, ClientActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }

        registerText.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        forgotPasswordText.setOnClickListener {
            // Aquí puedes implementar la lógica para la recuperación de contraseña
            Toast.makeText(this, "Funcionalidad de recuperación de contraseña aún no implementada", Toast.LENGTH_SHORT).show()
        }
    }
}
