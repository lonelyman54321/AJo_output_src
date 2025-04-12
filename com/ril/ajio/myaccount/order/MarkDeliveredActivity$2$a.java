/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.myaccount.order;

import android.view.animation.Animation;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity$2;

public final class MarkDeliveredActivity$2$a
implements Animation.AnimationListener {
    public final /* synthetic */ MarkDeliveredActivity$2 a;

    public MarkDeliveredActivity$2$a(MarkDeliveredActivity$2 var1_1) {
        this.a = var1_1;
    }

    public final void onAnimationEnd(Animation object) {
        object = this.a;
        MarkDeliveredActivity markDeliveredActivity = object.b;
        boolean bl2 = markDeliveredActivity.isFinishing();
        if (bl2) {
            return;
        }
        object.b.z0.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

