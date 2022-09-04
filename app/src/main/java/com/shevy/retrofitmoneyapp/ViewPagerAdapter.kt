package com.shevy.retrofitmoneyapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.shevy.retrofitmoneyapp.screens.second.SecondFragment
import com.shevy.retrofitmoneyapp.screens.start.StartFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> StartFragment()
            else -> SecondFragment()
        }
    }
}