package com.example.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonLib = findViewById<Button>(R.id.library_button_main)
        buttonLib.setOnClickListener {
            Toast.makeText(this@MainActivity, "No library provided!", Toast.LENGTH_SHORT).show()
        }
        val buttonSearch =findViewById<Button>(R.id.search_button_main)
        val buttonClickListener: View.OnClickListener = object: View.OnClickListener{
            override fun onClick(p0: View?) {
                Toast.makeText(this@MainActivity, "It`s no use" +
                        " searching in nothing!", Toast.LENGTH_SHORT).show()
            }
        }
        buttonSearch.setOnClickListener(buttonClickListener)
        val buttonSettings = findViewById<Button>(R.id.settings_button_main)
        buttonSettings.setOnClickListener{
            Toast.makeText(this@MainActivity, "Settings page can`t be shown due to the creator`s lack of skills!", Toast.LENGTH_LONG).show()
        }

    }
}