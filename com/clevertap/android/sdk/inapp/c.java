/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.clevertap.android.sdk.inapp;

import android.view.animation.Animation;
import com.clevertap.android.sdk.inapp.d$a;

public final class c
implements Animation.AnimationListener {
    public final /* synthetic */ d$a a;

    public c(d$a a2) {
        this.a = a2;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.a.Pa(null);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

