package com.example.victor_vallecillos_uf1_act9

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val buttonToMenu = findViewById<Button>(R.id.layoutButton2)

        buttonToMenu.setOnClickListener {
            finish()
        }
    }
}