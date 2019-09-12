package com.capstone.mygallery

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import java.util.ArrayList

class MyPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    private val items = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return items[position]
    }

    override fun getCount(): Int {
        return items.size
    }

    // 아이템 갱신
    fun updateFragments(items: ArrayList<Fragment>) {
        this.items.addAll(items)
    }

}