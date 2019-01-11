package com.dani.aplicacionmasterdetails

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Preguntamos la orientación en la que estamos
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            toast("Estás en landscape")

        } else{
            toast("Estás en vertical")
        }

        activity2.setOnClickListener {
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                toast("¡HOLA!")
            } else{
                //Lanzar otra Activity con Anko
                startActivity<SegundaActivity>(
                    //Le enviamos un valor a la Activity que lanzamos
                    "id" to 5
                )
            }
        }

        marca.setOnClickListener {
            //Abrir url en el navegador
            browse("https://www.marca.com")
        }
    }
}
