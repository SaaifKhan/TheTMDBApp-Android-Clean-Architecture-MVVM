package com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.splashActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.saifkhan.mvvmcleanarch.thetmdpapp.R
import com.saifkhan.mvvmcleanarch.thetmdpapp.presentation.HomeActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, HomeActivity::class.java))
            finish()
        }, 300)
    }
}