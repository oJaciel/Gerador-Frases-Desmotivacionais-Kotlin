package com.example.frasesdesmotivacionais

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Captando o botão do layout
        val actionButton = findViewById<Button>(R.id.actionButton)

        actionButton.setOnClickListener() {
            showPhrase()
        }

    }

    fun showPhrase () {

        //Captando a text view das frases
        var mainText = findViewById<TextView>(R.id.mainText)

        //Captando a lista de frases
        val motivacionalPhrases = resources.getStringArray(R.array.motivacionalPhrases)

        //Captando a lista de cores de fundo
        val bgColorsArray = resources.getIntArray(R.array.background_colors)



            //Gerando um índice para a lista de cores de fundo
            val randomColorIndex = Random.nextInt(bgColorsArray.size)

            //Captando uma cor baseado no índice gerado acima
            val randomColor = bgColorsArray[randomColorIndex]

            //Definindo a nova cor de fundo
            val newBgColor = findViewById<TextView>(R.id.mainText).setBackgroundColor(randomColor)

            //Definindo uma frase aleatória
            //O sistema seleciona uma frase aleatória, desde o index 0 até o nº de elementos do array
            val randomPhraseIndex = Random.nextInt(0, motivacionalPhrases.size)
            val randomPhrase = motivacionalPhrases[randomPhraseIndex]

            //Definindo a nova frase
            mainText.text = randomPhrase







    }


}