package com.example.progmobbarvolume;

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Menampilkan Nama & NIM
        val tvNamaNim = findViewById<TextView>(R.id.tv_nama_nim)
        val nama = "Ida Bagus Gde Raditya Wedananta"
        val nim = "2305551102"
        tvNamaNim.text = "Nama: $nama\nNIM    : $nim"

        // Menghubungkan variabel dengan elemen XML
        val edtLength = findViewById<EditText>(R.id.edt_length)
        val edtWidth = findViewById<EditText>(R.id.edt_width)
        val edtHeight = findViewById<EditText>(R.id.edt_height)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)
        val tvResult = findViewById<TextView>(R.id.tv_result)

        // Ketika tombol ditekan, hitung volume
        btnCalculate.setOnClickListener {
            val length = edtLength.text.toString().toDoubleOrNull() ?: 0.0
            val width = edtWidth.text.toString().toDoubleOrNull() ?: 0.0
            val height = edtHeight.text.toString().toDoubleOrNull() ?: 0.0
            val volume = length * width * height

            tvResult.text = "Hasil: $volume"
        }
    }
}