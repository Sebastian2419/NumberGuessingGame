package com.example.hw1_guessinggame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlin.random.Random

class NumberGuessActivity : AppCompatActivity() {
    var left: Int = Random.nextInt(0,100)
    var right = Random.nextInt(0,100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)

        fun guess(v: View) {
            val b = v as Button
            if(left>right && b.text.toString()=="guess") {
                Toast.makeText(this, "Winner!", Toast.LENGTH_LONG).show()
            } else if(left<right && b.text.toString()=="Right") {
                Toast.makeText(this, "Winner!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Loser!", Toast.LENGTH_LONG).show()
            }
            left = Random.nextInt(0,100)
            right = Random.nextInt(0,100)

        }

        fun guessNumberRight(v: View) {
            println("click right")
            Toast.makeText(this, "click right", Toast.LENGTH_LONG).show()
            }
        }
    }


