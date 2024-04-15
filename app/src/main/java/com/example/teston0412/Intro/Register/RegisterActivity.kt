package com.example.teston0412.Intro.Register

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.teston0412.R
import com.example.teston0412.Intro.Register.screens.FirstRegisterFragment

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onBackPressed() {
        val viewPager = findViewById<ViewPager2>(R.id.vp_registerViewPager)
        val currentIndex = viewPager.currentItem

        // 현재 Fragment가 FirstRegisterFragment일 때만 이전 페이지로 이동하도록 처리
        val currentFragment = supportFragmentManager.fragments[currentIndex]
        if (currentFragment is FirstRegisterFragment) {
            // 현재 페이지가 첫 번째 페이지이고 더 이상 뒤로 갈 수 없는 경우, 기본 동작을 수행
            if (currentIndex == 0) {

            } else {
                viewPager.setCurrentItem(currentIndex - 1, true)
            }
        } else {
            // 현재 Fragment가 FirstRegisterFragment인 경우 액티비티 종료
            finish()
        }
    }
}