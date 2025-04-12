/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.TabIndicatorInterpolator;
import com.google.android.material.tabs.TabLayout;

class ElasticTabIndicatorInterpolator
extends TabIndicatorInterpolator {
    private static float accInterp(float f5) {
        double d2 = Math.cos((double)f5 * Math.PI / 2.0);
        return (float)(1.0 - d2);
    }

    private static float decInterp(float f5) {
        return (float)Math.sin((double)f5 * Math.PI / 2.0);
    }

    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable2) {
        view = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        tabLayout = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view2);
        float f6 = view.left;
        float f7 = ((RectF)tabLayout).left;
        float f8 = f6 - f7;
        Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
        if (object < 0) {
            f6 = ElasticTabIndicatorInterpolator.accInterp(f5);
            f5 = ElasticTabIndicatorInterpolator.decInterp(f5);
        } else {
            f6 = ElasticTabIndicatorInterpolator.decInterp(f5);
            f5 = ElasticTabIndicatorInterpolator.accInterp(f5);
        }
        int n3 = (int)view.left;
        int n4 = (int)((RectF)tabLayout).left;
        object = AnimationUtils.lerp(n3, n4, f6);
        n3 = drawable2.getBounds().top;
        int n7 = (int)view.right;
        int n8 = (int)((RectF)tabLayout).right;
        n8 = AnimationUtils.lerp(n7, n8, f5);
        n7 = drawable2.getBounds().bottom;
        drawable2.setBounds((int)object, n3, n8, n7);
    }
}

