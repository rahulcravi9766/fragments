package com.example.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FragmentOne()
        val secondFragment = FragmentTwo()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFrameLayout, firstFragment)
            commit()
        }
            val buttonOne = findViewById<Button>(R.id.first)
            buttonOne.setOnClickListener {
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.flFrameLayout, firstFragment)
                    addToBackStack(null)
                    commit()
                }
            }
                    val buttonTwo = findViewById<Button>(R.id.second)
                    buttonTwo.setOnClickListener {
                        supportFragmentManager.beginTransaction().apply {
                            replace(R.id.flFrameLayout,secondFragment)
                            addToBackStack(null)
                            commit()
                    }
            }


}
    }
