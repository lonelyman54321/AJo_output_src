/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$g;
import com.google.android.material.tabs.TabLayout;

class TabLayout$AdapterChangeListener
implements ViewPager$g {
    private boolean autoRefresh;
    final /* synthetic */ TabLayout this$0;

    public TabLayout$AdapterChangeListener(TabLayout tabLayout) {
        this.this$0 = tabLayout;
    }

    public void onAdapterChanged(ViewPager viewPager, Uk2 object, Uk2 uk2) {
        object = this.this$0;
        ViewPager viewPager2 = ((TabLayout)((Object)object)).viewPager;
        if (viewPager2 == viewPager) {
            boolean bl2 = this.autoRefresh;
            ((TabLayout)((Object)object)).setPagerAdapter(uk2, bl2);
        }
    }

    public void setAutoRefresh(boolean bl2) {
        this.autoRefresh = bl2;
    }
}

