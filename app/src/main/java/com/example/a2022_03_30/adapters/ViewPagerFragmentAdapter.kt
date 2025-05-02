package com.example.a2022_03_30.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.a2022_03_30.fragments.ApprovedFragment
import com.example.a2022_03_30.fragments.ReviewFragment
import com.example.a2022_03_30.fragments.RejectedFragment

class ViewPagerFragmentAdapter(activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ReviewFragment()
            1 -> ApprovedFragment()
            else -> RejectedFragment()
        }
    }

}