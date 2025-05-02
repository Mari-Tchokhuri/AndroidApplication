package com.example.androidapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.androidapplication.fragments.ApprovedFragment
import com.example.androidapplication.fragments.ReviewFragment
import com.example.androidapplication.fragments.RejectedFragment

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