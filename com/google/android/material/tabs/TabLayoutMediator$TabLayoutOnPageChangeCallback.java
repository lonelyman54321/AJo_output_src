/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import androidx.viewpager2.widget.ViewPager2$g;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$Tab;
import java.lang.ref.WeakReference;

class TabLayoutMediator$TabLayoutOnPageChangeCallback
extends ViewPager2$g {
    private int previousScrollState;
    private int scrollState;
    private final WeakReference tabLayoutRef;

    public TabLayoutMediator$TabLayoutOnPageChangeCallback(TabLayout tabLayout) {
        WeakReference<TabLayout> weakReference;
        this.tabLayoutRef = weakReference = new WeakReference<TabLayout>(tabLayout);
        this.reset();
    }

    public void onPageScrollStateChanged(int n3) {
        int n4;
        this.previousScrollState = n4 = this.scrollState;
        this.scrollState = n3;
        TabLayout tabLayout = (TabLayout)((Object)this.tabLayoutRef.get());
        if (tabLayout != null) {
            n4 = this.scrollState;
            tabLayout.updateViewPagerScrollState(n4);
        }
    }

    public void onPageScrolled(int n3, float f5, int bl2) {
        Object t3 = this.tabLayoutRef.get();
        Object object = t3;
        object = (TabLayout)((Object)t3);
        if (object != null) {
            boolean bl3;
            bl2 = this.scrollState;
            boolean bl4 = 2 != 0;
            boolean bl5 = true;
            bl3 = bl2 != bl4 || (bl3 = this.previousScrollState) == bl5;
            if (bl2 == bl4 && !(bl2 = this.previousScrollState)) {
                bl2 = false;
                float f6 = 0.0f;
                t3 = null;
            } else {
                bl2 = true;
                float f7 = Float.MIN_VALUE;
            }
            bl5 = bl3;
            bl3 = bl2;
            ((TabLayout)((Object)object)).setScrollPosition(n3, f5, bl5, bl2, false);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void onPageSelected(int n3) {
        int n4;
        int n42;
        TabLayout tabLayout = (TabLayout)((Object)this.tabLayoutRef.get());
        if (tabLayout != null && (n42 = tabLayout.getSelectedTabPosition()) != n3 && n3 < (n4 = tabLayout.getTabCount())) {
            void var3_9;
            int n7;
            int n8;
            int n10 = this.scrollState;
            if (n10 != 0 && (n10 != (n8 = 2) || (n7 = this.previousScrollState) != 0)) {
                boolean bl2 = false;
            } else {
                boolean bl3 = true;
            }
            TabLayout$Tab tabLayout$Tab = tabLayout.getTabAt(n3);
            tabLayout.selectTab(tabLayout$Tab, (boolean)var3_9);
        }
    }

    public void reset() {
        this.scrollState = 0;
        this.previousScrollState = 0;
    }
}

