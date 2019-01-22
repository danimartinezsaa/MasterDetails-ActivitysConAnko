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

            //Si existe el botón para ir al activity2:
            if(activity2!=null){

                //Lanzamos el fragment @FragmentoDescripcion. Le mandamos 2 parámetros
                supportFragmentManager
                    .beginTransaction()
                    .add(R.id.espacio,FragmentoDescripcion.newInstance("Hola","Adios") , "espacio")
                    .commit()
            }
        } else{
            toast("Estás en vertical")
        }

        //Listener del botón. Si estamos en Horizontal dice Hola, si estamos en Vertical lanza la Activity2
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

        //Botón que abre un enlace en el navegador
        marca.setOnClickListener {
            //Abrir url en el navegador
            browse("https://www.marca.com")
        }
    }
}
