package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Guess(v: View) {
        var result: TextView = findViewById(R.id.txvResult)

        var User: Int = 0  //玩家出拳
        var Phone: Int = (0..2).random()  //手機出拳
        if(v.id == R.id.imageS){
            User = 0
        }else if(v.id == R.id.imageR){
            User = 1
        }else if(v.id == R.id.imageP){
            User = 2
        }
        result.text = "玩家出"+ GuessType(User)
    }

    fun GuessType(x:Int):String{
        return  when(x){
            0 -> "剪刀"
            1 -> "石頭"
            else -> "布"
        }
    }
}