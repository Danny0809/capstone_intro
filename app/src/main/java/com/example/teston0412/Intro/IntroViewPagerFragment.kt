package com.example.teston0412.Intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.teston0412.Intro.ImageOnboarding.FirstIntroImageFragment
import com.example.teston0412.Intro.ImageOnboarding.SecondIntroImageFragment
import com.example.teston0412.Intro.ImageOnboarding.ThirdIntroImageFragment
import com.example.teston0412.Intro.Register.screens.FirstRegisterFragment
import com.example.teston0412.Intro.Register.screens.SecondRegisterFragment
import com.example.teston0412.Intro.Register.screens.ThirdRegisterFragment
import com.example.teston0412.R
import com.example.teston0412.ViewPagerAdapter

class IntroViewPagerFragment : Fragment() {

    lateinit var viewPager: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_intro_view_pager, container, false)

        viewPager = view.findViewById(R.id.vp_introViewPager)

        // 프래그먼트 리스트
        val fragmentList = arrayListOf<Fragment>(
            FirstIntroImageFragment(),
            SecondIntroImageFragment(),
            ThirdIntroImageFragment()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        viewPager.adapter = adapter

        return view
    }
}