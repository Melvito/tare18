package com.example.tare18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpaguer.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (position == 0) {
                    txtcreador.isVisible = true
                    btnmapp.isVisible = false
                    viewpaguer.setBackgroundResource(R.drawable.fondo1)
                }
                if (position == 1) {
                    txtcreador.isVisible = false
                    btnmapp.isVisible = true
                    viewpaguer.setBackgroundResource(R.drawable.fondo22__1_)
                }
                super.onPageSelected(position)
            }
        })
       btnmapp.setOnClickListener {
           val maps = Intent(this, MapsActivity::class.java)
           startActivity(maps)
       }
        ViewPager()
    }
private fun ViewPager(){
    val list: MutableList<String> = ArrayList()
    list.add("Melvin Adiel Vasquez Mejia")
    list.add("Abrir Mapa de la UGB")



    viewpaguer.adapter = newclass(this, list)
}
}