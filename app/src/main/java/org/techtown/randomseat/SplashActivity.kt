package org.techtown.randomseat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        animationView.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

            finish()
        }
    }
}