/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.view;

import android.view.View;
import android.view.animation.Animation;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.jvm.internal.Intrinsics;

public final class BaseSplitActivity$a
implements Animation.AnimationListener {
    public final /* synthetic */ BaseSplitActivity a;
    public final /* synthetic */ View b;

    public BaseSplitActivity$a(BaseSplitActivity baseSplitActivity, View view) {
        this.a = baseSplitActivity;
        this.b = view;
    }

    public final void onAnimationEnd(Animation object) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a;
        boolean bl2 = BaseSplitActivity.access$isActivityFinishing((BaseSplitActivity)object);
        if (bl2) {
            return;
        }
        this.b.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}

