/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;

class TabLayoutMediator$ViewPagerOnTabSelectedListener
implements TabLayout$OnTabSelectedListener {
    private final boolean smoothScroll;
    private final ViewPager2 viewPager;

    public TabLayoutMediator$ViewPagerOnTabSelectedListener(ViewPager2 viewPager2, boolean bl2) {
        this.viewPager = viewPager2;
        this.smoothScroll = bl2;
    }

    public void onTabReselected(TabLayout$Tab tabLayout$Tab) {
    }

    public void onTabSelected(TabLayout$Tab tabLayout$Tab) {
        ViewPager2 viewPager2 = this.viewPager;
        int n3 = tabLayout$Tab.getPosition();
        boolean bl2 = this.smoothScroll;
        viewPager2.setCurrentItem(n3, bl2);
    }

    public void onTabUnselected(TabLayout$Tab tabLayout$Tab) {
    }
}

