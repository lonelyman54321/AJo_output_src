/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.google.android.material.navigation;

import android.content.Context;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.WindowUtils;
import com.google.android.material.navigation.NavigationView;

class NavigationView$3
implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ NavigationView this$0;

    public NavigationView$3(NavigationView navigationView) {
        this.this$0 = navigationView;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void onGlobalLayout() {
        var1_1 = this.this$0;
        var2_2 = NavigationView.access$200((NavigationView)var1_1);
        var1_1.getLocationOnScreen(var2_2);
        var1_1 = NavigationView.access$200(this.this$0);
        var3_3 = true;
        var4_4 = var1_1[var3_3];
        if (var4_4 == false) {
            var4_4 = (reference)true;
        } else {
            var4_4 = (reference)false;
            var1_1 = null;
        }
        NavigationView.access$300(this.this$0).setBehindStatusBar((boolean)var4_4);
        var5_5 = this.this$0;
        if (var4_4 != false && (var4_4 = (reference)var5_5.isTopInsetScrimEnabled()) != false) {
            var4_4 = (reference)true;
        } else {
            var4_4 = (reference)false;
            var1_1 = null;
        }
        var5_5.setDrawTopInsetForeground((boolean)var4_4);
        var1_1 = NavigationView.access$200(this.this$0);
        var4_4 = var1_1[0];
        if (var4_4 == false) ** GOTO lbl-1000
        var1_1 = NavigationView.access$200(this.this$0);
        var4_4 = var1_1[0];
        var5_5 = this.this$0;
        var6_6 /* !! */  = var5_5.getWidth() + var4_4;
        if (var6_6 /* !! */  != 0) {
            var4_4 = (reference)false;
            var1_1 = null;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = (reference)true;
        }
        var5_5 = this.this$0;
        var5_5.setDrawLeftInsetForeground((boolean)var4_4);
        var1_1 = ContextUtils.getActivity(this.this$0.getContext());
        if (var1_1 != null) {
            var5_5 = WindowUtils.getCurrentWindowBounds((Context)var1_1);
            var7_7 = var5_5.height();
            var8_8 = this.this$0.getHeight();
            var9_9 /* !! */  = NavigationView.access$200(this.this$0);
            if ((var7_7 -= var8_8) == (var8_8 = var9_9 /* !! */ [var3_3])) {
                var7_7 = 1;
            } else {
                var7_7 = 0;
                var10_10 = null;
            }
            var1_1 = var1_1.getWindow();
            var4_4 = (reference)Color.alpha((int)var1_1.getNavigationBarColor());
            if (var4_4 != false) {
                var4_4 = (reference)true;
            } else {
                var4_4 = (reference)false;
                var1_1 = null;
            }
            var9_9 /* !! */  = (int[])this.this$0;
            if (var7_7 != 0 && var4_4 != false && (var4_4 = (reference)var9_9 /* !! */ .isBottomInsetScrimEnabled()) != false) {
                var4_4 = (reference)true;
            } else {
                var4_4 = (reference)false;
                var1_1 = null;
            }
            var9_9 /* !! */ .setDrawBottomInsetForeground((boolean)var4_4);
            var4_4 = (reference)var5_5.width();
            var10_10 = NavigationView.access$200(this.this$0);
            var7_7 = var10_10[0];
            if (var4_4 != var7_7) {
                var4_4 = (reference)var5_5.width();
                var6_6 /* !! */  = this.this$0.getWidth();
                var5_5 = NavigationView.access$200(this.this$0);
                if ((var4_4 -= var6_6 /* !! */ ) != (var6_6 /* !! */  = (int)var5_5[0])) {
                    var3_3 = false;
                    var2_2 = null;
                }
            }
            var1_1 = this.this$0;
            var1_1.setDrawRightInsetForeground(var3_3);
        }
    }
}

