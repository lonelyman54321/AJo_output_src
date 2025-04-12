/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.jio.jioads.interstitial;

import android.view.animation.Animation;
import com.jio.jioads.interstitial.InterstitialActivity;
import kotlin.jvm.internal.Intrinsics;

public final class p
implements Animation.AnimationListener {
    public final /* synthetic */ InterstitialActivity a;

    public p(InterstitialActivity interstitialActivity) {
        this.a = interstitialActivity;
    }

    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.a.finish();
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}

