package com.example.lr1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var textsVisible = true
    private var imageVisible = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameText = findViewById<TextView>(R.id.nameText)
        val groupText = findViewById<TextView>(R.id.groupText)
        val centerImage = findViewById<ImageView>(R.id.centerImage)
        val toggleTextsButton = findViewById<Button>(R.id.toggleTextsButton)
        val toggleImageButton = findViewById<ImageButton>(R.id.toggleImageButton)

        toggleTextsButton.setOnClickListener {
            textsVisible = !textsVisible
            val visibility = if (textsVisible) View.VISIBLE else View.GONE
            nameText.visibility = visibility
            groupText.visibility = visibility
            toggleTextsButton.setText(
                if (textsVisible) R.string.hide_texts else R.string.show_texts
            )
        }

        toggleImageButton.setOnClickListener {
            imageVisible = !imageVisible
            centerImage.visibility = if (imageVisible) View.VISIBLE else View.GONE
        }
    }
}
