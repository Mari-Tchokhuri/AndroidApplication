package com.example.androidapplication

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.androidapplication.adapters.ViewPagerFragmentAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {
    private lateinit var myViewPager : ViewPager2
    private lateinit var tabBar : TabLayout
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter
    private lateinit var bottomNavigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myViewPager = findViewById(R.id.myViewPager)
        tabBar = findViewById(R.id.tabBar)
        bottomNavigation = findViewById(R.id.bottom_navigation)

        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this)

        myViewPager.adapter = viewPagerFragmentAdapter

        TabLayoutMediator(tabBar, myViewPager) { tab, position ->
            tab.text = when(position){
                0 -> "Review"
                1 -> "Approved"
                2 -> "Rejected"
                else -> "Other"
            }

        }.attach()
    }
}



