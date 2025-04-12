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

class FadeTabIndicatorInterpolator
extends TabIndicatorInterpolator {
    private static final float FADE_THRESHOLD = 0.5f;

    public void updateIndicatorForOffset(TabLayout tabLayout, View view, View view2, float f5, Drawable drawable2) {
        int n3 = 0x3F000000;
        float f6 = 0.5f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
        if (object >= 0) {
            view = view2;
        }
        tabLayout = TabIndicatorInterpolator.calculateIndicatorWidthForTab(tabLayout, view);
        float f8 = 0.0f;
        view = null;
        int n4 = 1065353216;
        float f11 = 1.0f;
        f8 = object < 0 ? AnimationUtils.lerp(f11, 0.0f, 0.0f, f6, f5) : AnimationUtils.lerp(0.0f, f11, f6, f11, f5);
        n4 = (int)((RectF)tabLayout).left;
        int n7 = drawable2.getBounds().top;
        int n8 = (int)((RectF)tabLayout).right;
        n3 = drawable2.getBounds().bottom;
        drawable2.setBounds(n4, n7, n8, n3);
        n8 = (int)(f8 * 255.0f);
        drawable2.setAlpha(n8);
    }
}

