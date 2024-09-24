package com.example.portflioapp



import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000) // 3000 milliseconds = 3 seconds delay
        val controller=WindowInsetsControllerCompat(window,window.decorView)
        controller.hide(WindowInsetsCompat.Type.statusBars())
    }
}
