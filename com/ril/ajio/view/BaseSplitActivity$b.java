/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.view;

import android.view.animation.Animation;
import com.ril.ajio.view.BaseSplitActivity;
import kotlin.jvm.internal.Intrinsics;

public final class BaseSplitActivity$b
implements Animation.AnimationListener {
    public final /* synthetic */ BaseSplitActivity a;

    public BaseSplitActivity$b(BaseSplitActivity baseSplitActivity) {
        this.a = baseSplitActivity;
    }

    public final void onAnimationEnd(Animation object) {
        String string2 = "animation";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a;
        int n3 = BaseSplitActivity.access$isActivityFinishing((BaseSplitActivity)object);
        if (n3 != 0) {
            return;
        }
        if ((object = BaseSplitActivity.access$getNotificationView$p((BaseSplitActivity)object)) != null) {
            n3 = 8;
            object.setVisibility(n3);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}

