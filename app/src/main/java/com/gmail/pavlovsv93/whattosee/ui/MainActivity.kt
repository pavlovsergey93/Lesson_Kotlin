package com.gmail.pavlovsv93.whattosee.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.gmail.pavlovsv93.whattosee.R
import com.gmail.pavlovsv93.whattosee.domain.Movie
import com.gmail.pavlovsv93.whattosee.domain.MovieRepository

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1: TextView = findViewById(R.id.text_view_1)
        val textView2: TextView = findViewById(R.id.text_view_2)
        val textView3: TextView = findViewById(R.id.text_view_3)
        val btnInfo: Button = findViewById(R.id.button_info)
        val btnCopy: Button = findViewById(R.id.btn_coty)

        val repo = MovieRepository()

        repo.addNewMovie(1, "Мстители", "омырлфтмсчлрмифолывм")
        repo.addNewMovie(2, "Один дома", "ewfjkdshk;fhasdklfhjkadslhl")
        repo.addNewMovie(3, "Ирония судьбы", "вждалпмоыващшрщавфшзпоашщфы")
        btnInfo.setOnClickListener(View.OnClickListener {
            repo.getMovie(1)
        })

        btnCopy.setOnClickListener(View.OnClickListener {

        })

    }
}