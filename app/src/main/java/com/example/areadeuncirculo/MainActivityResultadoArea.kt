package com.example.areadeuncirculo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_resultado_area.*

class MainActivityResultadoArea : AppCompatActivity() {
    companion object{
        var radio: Double = 0.0
        var resultado : Double = 0.0

        val ENTRA_RADIO = "altura"
        val ENTRA_RESULTADO = "resultado"
        private val DEFAULT_DOUBLE=-1.0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado_area)
        val recibir = intent
        radio = recibir.getDoubleExtra(ENTRA_RADIO, DEFAULT_DOUBLE)
        resultado = recibir.getDoubleExtra(ENTRA_RESULTADO, DEFAULT_DOUBLE)
        tvRadio.setText("El Radio es :" + radio.toString())
        tvResultado.setText("Su Area Es :" + resultado.toString())
    }
}
