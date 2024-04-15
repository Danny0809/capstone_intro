package com.example.teston0412.Intro.Register.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.viewpager2.widget.ViewPager2
import com.example.teston0412.R

class FirstRegisterFragment : Fragment() {

    private lateinit var btn_Next: Button
    private lateinit var et_name: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_first_register, container, false)

        btn_Next = view.findViewById(R.id.btn_firstScreen_next)
        et_name = view.findViewById(R.id.et_firstScreen_name)

        // 다음 화면으로 이동하는 리스너 설정
        btn_Next.setOnClickListener {
            // ViewPager2의 현재 인덱스를 가져옴
            val viewPager = requireActivity().findViewById<ViewPager2>(R.id.vp_registerViewPager)
            val currentIndex = viewPager.currentItem

            // 다음 화면으로 이동
            viewPager.setCurrentItem(currentIndex + 1, true)
        }

        return view
    }
}