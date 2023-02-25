package com.example.androidkotlinfundamentals2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// AppCompatActivityActivityは、古いバージョンの Android との下位互換性を提供しながら、
// すべての最新の Android 機能をサポートする のサブクラスです。
// できるだけ多くのデバイスとユーザーがアプリを利用できるようにするには、
// 常にAppCompatActivityを使用してください。
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
        val randomInt: Int = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }
}