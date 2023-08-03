package com.example.splashanimation

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.splashanimation.databinding.ActivitySplashScreenBinding
import java.lang.Thread.sleep

class SplashScreen : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Thread(Runnable {
            var animation = AnimationUtils.loadAnimation(this, R.anim.rotate_animation)
            binding.logoWhite.startAnimation(animation)
            sleep(5000)
            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
            finish()
        }).start()
    }
}