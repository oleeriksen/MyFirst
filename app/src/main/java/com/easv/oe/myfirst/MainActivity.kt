package com.easv.oe.myfirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val mGreetings = Greetings()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /* The following declarations are done by the
        import of kotlinx.android.synthetic.main.activity_main.*

        val tvHeader = findViewById<TextView>(R.id.tvHeader)
        val btnOK = findViewById<Button>(R.id.btnOK)
        val etName = findViewById<EditText>(R.id.etName)
        */
        btnOK.setOnClickListener { v -> onClickOK() }
    }

    fun onClickOK(){
        val gr = mGreetings.get()
        val name = etName.text.toString()
        tvHeader.text = "$gr $name"
    }
}
