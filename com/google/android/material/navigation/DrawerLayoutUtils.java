/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Color
 *  android.view.View
 */
package com.google.android.material.navigation;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.navigation.DrawerLayoutUtils$1;

public class DrawerLayoutUtils {
    private static final int DEFAULT_SCRIM_ALPHA = 0;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;

    static {
        DEFAULT_SCRIM_ALPHA = Color.alpha((int)-1728053248);
    }

    private DrawerLayoutUtils() {
    }

    public static /* synthetic */ void a(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        DrawerLayoutUtils.lambda$getScrimCloseAnimatorUpdateListener$0(drawerLayout, valueAnimator);
    }

    public static Animator.AnimatorListener getScrimCloseAnimatorListener(DrawerLayout drawerLayout, View view) {
        DrawerLayoutUtils$1 drawerLayoutUtils$1 = new DrawerLayoutUtils$1(drawerLayout, view);
        return drawerLayoutUtils$1;
    }

    public static ValueAnimator.AnimatorUpdateListener getScrimCloseAnimatorUpdateListener(DrawerLayout drawerLayout) {
        vu0_2 vu0_22 = new vu0_2(drawerLayout);
        return vu0_22;
    }

    private static /* synthetic */ void lambda$getScrimCloseAnimatorUpdateListener$0(DrawerLayout drawerLayout, ValueAnimator valueAnimator) {
        int n3 = DEFAULT_SCRIM_ALPHA;
        float f5 = valueAnimator.getAnimatedFraction();
        int n4 = AnimationUtils.lerp(n3, 0, f5);
        n4 = hZ.i(-1728053248, n4);
        drawerLayout.setScrimColor(n4);
    }
}

