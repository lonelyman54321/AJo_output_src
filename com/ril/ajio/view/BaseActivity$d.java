/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TimeInterpolator
 *  android.view.View
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.view;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

public final class BaseActivity$d
implements Animation.AnimationListener {
    public final /* synthetic */ TabLayout a;
    public final /* synthetic */ BaseActivity b;
    public final /* synthetic */ int c;

    public BaseActivity$d(TabLayout tabLayout, BaseActivity baseActivity, int n3) {
        this.a = tabLayout;
        this.b = baseActivity;
        this.c = n3;
    }

    public final void onAnimationEnd(Animation object) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a;
        int n3 = 8;
        object.setVisibility(n3);
        object = this.b;
        View view = object.t0;
        if (view != null) {
            view.setVisibility(n3);
        }
        object.x0 = false;
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation object) {
        Intrinsics.checkNotNullParameter(object, "animation");
        object = this.a;
        float f5 = 0.0f;
        AccelerateInterpolator accelerateInterpolator = null;
        object.setVisibility(0);
        View view = this.b.t0;
        if (view != null) {
            view.setVisibility(0);
        }
        object = object.animate();
        f5 = this.c;
        object = object.translationY(f5);
        accelerateInterpolator = new AccelerateInterpolator(2.0f);
        object.setInterpolator((TimeInterpolator)accelerateInterpolator).start();
    }
}

