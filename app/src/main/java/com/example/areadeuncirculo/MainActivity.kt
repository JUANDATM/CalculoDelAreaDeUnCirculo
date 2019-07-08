package com.example.areadeuncirculo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import kotlin.math.PI

class MainActivity : AppCompatActivity() {
    var radio: Double = 0.0
    var resultado: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular() {
        if (etRadio.text.isEmpty()) {
            Toast.makeText(this, "Falta la Base", Toast.LENGTH_LONG).show()
            etRadio.requestFocus()
        }else {
            radio = etRadio.text.toString().toDouble()
            resultado = pow((PI * radio), 2.0)
        }
    }
    fun Enviar (v: View){
        this.calcular()
        val enviar = Intent (this,MainActivityResultadoArea::class.java)
        enviar.putExtra(MainActivityResultadoArea.ENTRA_RADIO,radio)
        enviar.putExtra(MainActivityResultadoArea.ENTRA_RESULTADO,resultado)
        startActivity(enviar)
    }
}
