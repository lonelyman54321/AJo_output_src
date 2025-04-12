/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout$TabView;

class TabLayout$TabView$1
implements View.OnLayoutChangeListener {
    final /* synthetic */ TabLayout$TabView this$1;
    final /* synthetic */ View val$view;

    public TabLayout$TabView$1(TabLayout$TabView tabLayout$TabView, View view) {
        this.this$1 = tabLayout$TabView;
        this.val$view = view;
    }

    public void onLayoutChange(View object, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        object = this.val$view;
        int n17 = object.getVisibility();
        if (n17 == 0) {
            object = this.this$1;
            View view = this.val$view;
            TabLayout$TabView.access$1400((TabLayout$TabView)((Object)object), view);
        }
    }
}

