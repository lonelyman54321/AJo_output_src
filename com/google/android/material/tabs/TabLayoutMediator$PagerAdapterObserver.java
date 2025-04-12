/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView$h;
import com.google.android.material.tabs.TabLayoutMediator;

class TabLayoutMediator$PagerAdapterObserver
extends RecyclerView$h {
    final /* synthetic */ TabLayoutMediator this$0;

    public TabLayoutMediator$PagerAdapterObserver(TabLayoutMediator tabLayoutMediator) {
        this.this$0 = tabLayoutMediator;
    }

    public void onChanged() {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeChanged(int n3, int n4) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeChanged(int n3, int n4, Object object) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeInserted(int n3, int n4) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeMoved(int n3, int n4, int n7) {
        this.this$0.populateTabsFromPagerAdapter();
    }

    public void onItemRangeRemoved(int n3, int n4) {
        this.this$0.populateTabsFromPagerAdapter();
    }
}

