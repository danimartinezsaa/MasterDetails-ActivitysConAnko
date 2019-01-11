package com.dani.aplicacionmasterdetails

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_segunda.*
import org.jetbrains.anko.startActivity
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.content.Intent



class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        //Recogemos el vamor que nos manda la Activity que lanza a esta.
        var message = intent.getIntExtra("id",5)

        numeroid.setText(message.toString())

    }
}
