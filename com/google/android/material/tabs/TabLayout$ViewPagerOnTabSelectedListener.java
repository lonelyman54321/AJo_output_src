/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;

public class TabLayout$ViewPagerOnTabSelectedListener
implements TabLayout$OnTabSelectedListener {
    private final ViewPager viewPager;

    public TabLayout$ViewPagerOnTabSelectedListener(ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    public void onTabReselected(TabLayout$Tab tabLayout$Tab) {
    }

    public void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        ViewPager viewPager = this.viewPager;
        int n3 = tabLayout$Tab.getPosition();
        viewPager.setCurrentItem(n3);
    }

    public void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
    }
}

