package com.br.danilosouza.androidcubos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
// import android.widget.ImageView

// imporatção da lib Picasso para usar imagens da internet
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "PASSEI AQUI START", Toast.LENGTH_LONG).show()
//        Picasso
//            .get()
//            .load("https://cdn.discordapp.com/attachments/610975487845597234/629415172641128464/aulas_Mapas.png")
//            .into(eu)
//            // eu.setImageResource(R.drawable.eu)
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "PASSEI AQUI RESUME", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "PASSEI AQUI PAUSE", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "PASSEI AQUI DESTROY", Toast.LENGTH_LONG).show()
    }

}
