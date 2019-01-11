package com.dani.aplicacionmasterdetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*
import org.jetbrains.anko.startActivity

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        volver.setOnClickListener {
            //Lanzar otra Activity con Anko
            startActivity<MainActivity>()
        }

    }
}
