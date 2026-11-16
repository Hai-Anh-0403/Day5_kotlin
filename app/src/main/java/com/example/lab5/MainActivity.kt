package com.example.lab5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val wordList = listOf(
            Word("class", "lớp học"),
            Word("object", "đối tượng"),
            Word("function", "hàm"),
            Word("pen", "bút")
        )

        // 2. Ánh xạ RecyclerView
        val rvWords = findViewById<RecyclerView>(R.id.rvWords)

        // 3. Tạo Adapter
        val adapter = WordAdapter(wordList)

        // 4. Gắn Adapter vào RecyclerView
        rvWords.adapter = adapter
    }
}