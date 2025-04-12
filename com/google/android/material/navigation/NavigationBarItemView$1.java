/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 *  android.widget.ImageView
 */
package com.google.android.material.navigation;

import android.view.View;
import android.widget.ImageView;
import com.google.android.material.navigation.NavigationBarItemView;

class NavigationBarItemView$1
implements View.OnLayoutChangeListener {
    final /* synthetic */ NavigationBarItemView this$0;

    public NavigationBarItemView$1(NavigationBarItemView navigationBarItemView) {
        this.this$0 = navigationBarItemView;
    }

    public void onLayoutChange(View object, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        object = NavigationBarItemView.access$200(this.this$0);
        int n17 = object.getVisibility();
        if (n17 == 0) {
            object = this.this$0;
            ImageView imageView = NavigationBarItemView.access$200((NavigationBarItemView)object);
            NavigationBarItemView.access$300((NavigationBarItemView)object, (View)imageView);
        }
    }
}

