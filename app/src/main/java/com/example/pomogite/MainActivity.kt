package com.example.pomogite

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextSideA = findViewById<EditText>(R.id.editTextSideA)
        val editTextSideB = findViewById<EditText>(R.id.editTextSideB)
        val buttonCalculate = findViewById<Button>(R.id.button)

        buttonCalculate.setOnClickListener {
            val sideA = editTextSideA.text.toString().toDoubleOrNull()
            val sideB = editTextSideB.text.toString().toDoubleOrNull()

            if (sideA == null || sideB == null) {
                Toast.makeText(this, "Пожалуйста, введите обе стороны.", Toast.LENGTH_SHORT).show()
            } else {
                val hypotenuse = sqrt(sideA * sideA + sideB * sideB)
                Toast.makeText(this, "Гипотенуза: $hypotenuse", Toast.LENGTH_LONG).show()
            }
        }
    }
}