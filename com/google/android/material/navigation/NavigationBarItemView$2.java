/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.navigation;

import com.google.android.material.navigation.NavigationBarItemView;

class NavigationBarItemView$2
implements Runnable {
    final /* synthetic */ NavigationBarItemView this$0;
    final /* synthetic */ int val$width;

    public NavigationBarItemView$2(NavigationBarItemView navigationBarItemView, int n3) {
        this.this$0 = navigationBarItemView;
        this.val$width = n3;
    }

    public void run() {
        NavigationBarItemView navigationBarItemView = this.this$0;
        int n3 = this.val$width;
        NavigationBarItemView.access$400(navigationBarItemView, n3);
    }
}

