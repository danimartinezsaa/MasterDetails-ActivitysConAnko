package com.dani.aplicacionmasterdetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*
import android.content.res.Configuration


class SegundaActivity : AppCompatActivity() {

    //Guardamos el fragmento que vamos a instanciar
    val mifragmento=FragmentoDescripcion.newInstance("Hola","Adios")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.espacio, mifragmento, "espacio")
                .commit()
        }

        var mostrar=mifragmento.param1

        devuelto.setText("Devuelto del fragment: $mostrar")


        //Recogemos el vamor que nos manda la Activity que lanza a esta.
        var message = intent.getIntExtra("id",5)

        numeroid.setText(message.toString())

    }
}
