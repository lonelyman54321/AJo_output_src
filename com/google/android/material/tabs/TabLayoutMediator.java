/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$h;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayout$OnTabSelectedListener;
import com.google.android.material.tabs.TabLayout$Tab;
import com.google.android.material.tabs.TabLayoutMediator$PagerAdapterObserver;
import com.google.android.material.tabs.TabLayoutMediator$TabConfigurationStrategy;
import com.google.android.material.tabs.TabLayoutMediator$TabLayoutOnPageChangeCallback;
import com.google.android.material.tabs.TabLayoutMediator$ViewPagerOnTabSelectedListener;

public final class TabLayoutMediator {
    private RecyclerView$f adapter;
    private boolean attached;
    private final boolean autoRefresh;
    private TabLayoutMediator$TabLayoutOnPageChangeCallback onPageChangeCallback;
    private TabLayout$OnTabSelectedListener onTabSelectedListener;
    private RecyclerView$h pagerAdapterObserver;
    private final boolean smoothScroll;
    private final TabLayoutMediator$TabConfigurationStrategy tabConfigurationStrategy;
    private final TabLayout tabLayout;
    private final ViewPager2 viewPager;

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, TabLayoutMediator$TabConfigurationStrategy tabLayoutMediator$TabConfigurationStrategy) {
        this(tabLayout, viewPager2, true, tabLayoutMediator$TabConfigurationStrategy);
    }

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, boolean bl2, TabLayoutMediator$TabConfigurationStrategy tabLayoutMediator$TabConfigurationStrategy) {
        this(tabLayout, viewPager2, bl2, true, tabLayoutMediator$TabConfigurationStrategy);
    }

    public TabLayoutMediator(TabLayout tabLayout, ViewPager2 viewPager2, boolean bl2, boolean bl3, TabLayoutMediator$TabConfigurationStrategy tabLayoutMediator$TabConfigurationStrategy) {
        this.tabLayout = tabLayout;
        this.viewPager = viewPager2;
        this.autoRefresh = bl2;
        this.smoothScroll = bl3;
        this.tabConfigurationStrategy = tabLayoutMediator$TabConfigurationStrategy;
    }

    public void attach() {
        boolean bl2 = this.attached;
        if (!bl2) {
            Object object = this.viewPager.getAdapter();
            this.adapter = object;
            if (object != null) {
                this.attached = bl2 = true;
                Object object2 = this.tabLayout;
                Object object3 = new TabLayoutMediator$TabLayoutOnPageChangeCallback((TabLayout)((Object)object2));
                this.onPageChangeCallback = object3;
                this.viewPager.f((ViewPager2$g)object3);
                object2 = this.viewPager;
                boolean bl3 = this.smoothScroll;
                this.onTabSelectedListener = object3 = new TabLayoutMediator$ViewPagerOnTabSelectedListener((ViewPager2)((Object)object2), bl3);
                object2 = this.tabLayout;
                ((TabLayout)((Object)object2)).addOnTabSelectedListener((TabLayout$OnTabSelectedListener)object3);
                boolean bl4 = this.autoRefresh;
                if (bl4) {
                    object3 = new TabLayoutMediator$PagerAdapterObserver(this);
                    this.pagerAdapterObserver = object3;
                    object2 = this.adapter;
                    ((RecyclerView$f)object2).registerAdapterDataObserver((RecyclerView$h)object3);
                }
                this.populateTabsFromPagerAdapter();
                object3 = this.tabLayout;
                int n3 = this.viewPager.getCurrentItem();
                ((TabLayout)((Object)object3)).setScrollPosition(n3, 0.0f, bl2);
                return;
            }
            object = new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
            throw object;
        }
        IllegalStateException illegalStateException = new IllegalStateException("TabLayoutMediator is already attached");
        throw illegalStateException;
    }

    public void detach() {
        Object object;
        Object object2;
        boolean bl2 = this.autoRefresh;
        if (bl2 && (object2 = this.adapter) != null) {
            object = this.pagerAdapterObserver;
            object2.unregisterAdapterDataObserver((RecyclerView$h)object);
            this.pagerAdapterObserver = null;
        }
        object2 = this.tabLayout;
        object = this.onTabSelectedListener;
        ((TabLayout)((Object)object2)).removeOnTabSelectedListener((TabLayout$OnTabSelectedListener)object);
        object2 = this.viewPager;
        object = this.onPageChangeCallback;
        ((ViewPager2)((Object)object2)).c.a.remove(object);
        this.onTabSelectedListener = null;
        this.onPageChangeCallback = null;
        this.adapter = null;
        this.attached = false;
    }

    public boolean isAttached() {
        return this.attached;
    }

    public void populateTabsFromPagerAdapter() {
        this.tabLayout.removeAllTabs();
        Object object = this.adapter;
        if (object != null) {
            int n3 = ((RecyclerView$f)object).getItemCount();
            int n4 = 0;
            TabLayout tabLayout = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                TabLayout$Tab tabLayout$Tab = this.tabLayout.newTab();
                this.tabConfigurationStrategy.onConfigureTab(tabLayout$Tab, i3);
                TabLayout tabLayout2 = this.tabLayout;
                tabLayout2.addTab(tabLayout$Tab, false);
            }
            if (n3 > 0) {
                object = this.tabLayout;
                n3 = ((TabLayout)((Object)object)).getTabCount() + -1;
                n3 = Math.min(this.viewPager.getCurrentItem(), n3);
                if (n3 != (n4 = (tabLayout = this.tabLayout).getSelectedTabPosition())) {
                    tabLayout = this.tabLayout;
                    object = tabLayout.getTabAt(n3);
                    tabLayout.selectTab((TabLayout$Tab)object);
                }
            }
        }
    }
}

