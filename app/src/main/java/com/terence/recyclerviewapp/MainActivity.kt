package com.terence.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.terence.recyclerviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myMusicAdapter: MusicAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val songs:List<MusicModel> = listOf(
            MusicModel(
                "Breathe", "Sia",true
            ),
            MusicModel(
                "Work","Rihanna",false
            ),
            MusicModel(
                "stitches","Shawn Mendes" ,false
            ),
            MusicModel("Lovely","Khalid & Billie Eillish",false
            ),
            MusicModel("Saturday Nights","Khalid",false),




        )
        myMusicAdapter= MusicAdapter(songs)
        binding.recyclerView.adapter=myMusicAdapter
    }
}