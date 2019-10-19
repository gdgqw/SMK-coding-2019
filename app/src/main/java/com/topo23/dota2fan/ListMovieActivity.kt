package com.topo23.dota2fan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_list_movie.*
import org.jetbrains.anko.adapterViewFlipper
import org.jetbrains.anko.support.v4.viewPager
import org.jetbrains.anko.themedAdapterViewFlipper

class ListMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_movie)

        viewpager.adapter =
            TabLayoutAdapter(supportFragmentManager, this)
        tablayout.setupWithViewPager(viewpager)
    }
}
