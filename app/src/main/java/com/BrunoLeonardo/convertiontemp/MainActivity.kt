package com.BrunoLeonardo.convertiontemp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun actionConvertion(view: View) {
        // chercher le valeur de tempC
        var tempC = findViewById<EditText>(R.id.tempC)
        var tc = tempC.text.toString().toDouble()
        Log.v("test_valeur", "valeur tc $tc")

        // Convertir
        var tF = tc * 9 / 5 + 32
        // afficher le resultat dans txtTempF
        var tempF = findViewById<TextView>(R.id.txtViewTempF)
        tempF.text = tF.toString() + " °F"


    }
}