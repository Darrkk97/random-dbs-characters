package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dbsCharacters = mutableListOf("trunks","bardock","beerus","krillin","perfect_cell")
        val button = findViewById<Button>(R.id.button1)
        val textview = findViewById<TextView>(R.id.textView1)



        //Defining a function here
        fun get_random_Dbz_character(){

        }


       /* val randomdbsimage = when(randomdbz) {
            "trunks" -> R.drawable.trunks
            "bardock" -> R.drawable.bardock
            "beerus"  -> R.drawable.beerus
            "krillin" -> R.drawable.krillin
            else -> R.drawable.perfect_cell
        }*/
        button.setOnClickListener {
            val image = findViewById<ImageView>(R.id.imageView2)
            val randomval = dbsCharacters.random()
            val randomdbz: String= randomval
            textview.text = randomval
            val randomdbsimage = when(randomdbz) {
                "trunks" -> R.drawable.trunks
                "bardock" -> R.drawable.bardock
                "beerus"  -> R.drawable.beerus
                "krillin" -> R.drawable.krillin
                else -> R.drawable.perfect_cell
            }

            image.setImageResource(randomdbsimage)





        }


        //When ever the button is clicked we get a random charecter in the textview



    }
}