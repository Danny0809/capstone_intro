package com.example.teston0412.Intro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.teston0412.R
import com.example.teston0412.Intro.Register.RegisterActivity

class IntroActivity : AppCompatActivity() {

    lateinit var btn_goRegister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_intro)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btn_goRegister = findViewById(R.id.btn_intro_goRegister)

        //회원가입 버튼 리스너
        btn_goRegister.setOnClickListener{
            goRegister()
        }
    }

    fun goRegister(){
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }
}