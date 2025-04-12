/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.ondemand.customercare.view.activity;

import android.view.animation.Animation;
import com.ril.ajio.ondemand.customercare.view.activity.CCCancelOrderActivity$1;

class CCCancelOrderActivity$1$1
implements Animation.AnimationListener {
    final /* synthetic */ CCCancelOrderActivity$1 this$1;

    public CCCancelOrderActivity$1$1(CCCancelOrderActivity$1 var1_1) {
        this.this$1 = var1_1;
    }

    public void onAnimationEnd(Animation animation) {
        this.this$1.val$mNotificationView.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}

