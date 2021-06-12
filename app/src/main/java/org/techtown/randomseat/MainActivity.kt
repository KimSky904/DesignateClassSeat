package org.techtown.randomseat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lotteryNumbers = arrayListOf(number1,number2,number3,number4,number5,number6,number7,number8,number9,number10,number11,number12,number13,number14,number15,number16,number17,number18,number19,number20)
        startButton.setOnClickListener{
            classAni.playAnimation()
            lotteryNumbers.forEach{
                val randomNumber = (Math.random()*20 + 1).toInt() //1~45의 랜덤값
                it.text = "$randomNumber"
            }
        }


        startButton.setOnClickListener{
            if(classAni.isAnimating){
                classAni.cancelAnimation()
                //startButton.clearAnimation()
            }
            else {
                classAni.playAnimation()
            }
        }
    }
}

