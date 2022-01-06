package com.gmail.pavlovsv93.whattosee.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.gmail.pavlovsv93.whattosee.R
import com.gmail.pavlovsv93.whattosee.connect.MoviesLib
import com.gmail.pavlovsv93.whattosee.domain.MovieRepository

class MainActivity : AppCompatActivity(), View.OnClickListener {

    companion object {
        const val TAG = "MAIN_ACTIVITY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1: TextView = findViewById(R.id.text_view_1)
        val textView2: TextView = findViewById(R.id.text_view_2)
        val textView3: TextView = findViewById(R.id.text_view_3)
        val btnInfo: Button = findViewById(R.id.button_info)
        val btnCopy: Button = findViewById(R.id.btn_copy)

        val repo = MovieRepository()

        repo.addNewMovie(1, "Мстители", "омырлфтмсчлрмифолывм")
        repo.addNewMovie(2, "Один дома", "ewfjkdshk;fhasdklfhjkadslhl")
        repo.addNewMovie(3, "Ирония судьбы", "вждалпмоыващшрщавфшзпоашщфы")
        btnInfo.setOnClickListener(View.OnClickListener {
            //Toast.makeText(this@MainActivity, "1 кнопка", Toast.LENGTH_SHORT).show()
            var id: Int = (0 until 3).random()
            if (id >= 0 && id < 3) {
                var movie = repo.getMovie(id)
                var t = if (movie == repo.getMovie(2)) {
                    "совпадение"
                } else {
                    "совпадения НЕТ"
                }
                textView1.setText(movie.nameMovie + "\n" + movie.brieflyTell + "\n" + t)
                for (i in 1..25 step 2) {
                    Log.d(MainActivity.TAG, i.toString())
                }
            }

        })

        textView2.setText(repo.getMovie(2).nameMovie + "\n" + repo.getMovie(2).brieflyTell)

        btnCopy.setOnClickListener(View.OnClickListener {
            Toast.makeText(this@MainActivity, "2 кнопка", Toast.LENGTH_SHORT).show()
            val movie = MoviesLib.getMovie().copy(nameMovie = "Один дома 3")
            textView3.setText(movie.nameMovie + "\n" + movie.brieflyTell)
            for (i in 5 downTo -10 step 3) {
                Log.d(MainActivity.TAG, i.toString())
            }
        })

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_copy -> {
                for (i in 1..25 step 2) {
                    Log.d(MainActivity.TAG, i.toString())
                }
            }
            else -> {
                for (i in 5 downTo -10 step 3) {
                    Log.d(MainActivity.TAG, i.toString())
                }
            }
        }
    }
}