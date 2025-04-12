/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 */
package com.ril.ajio.ondemand.customercare.view.activity;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.ril.ajio.ondemand.customercare.view.activity.CCCancelOrderActivity;
import com.ril.ajio.ondemand.customercare.view.activity.CCCancelOrderActivity$1$1;

class CCCancelOrderActivity$1
implements Runnable {
    final /* synthetic */ CCCancelOrderActivity this$0;
    final /* synthetic */ int val$anim_delay;
    final /* synthetic */ View val$mNotificationView;

    public CCCancelOrderActivity$1(CCCancelOrderActivity cCCancelOrderActivity, int n3, View view) {
        this.this$0 = cCCancelOrderActivity;
        this.val$anim_delay = n3;
        this.val$mNotificationView = view;
    }

    public void run() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -100.0f);
        long l2 = this.val$anim_delay;
        translateAnimation.setDuration(l2);
        CCCancelOrderActivity$1$1 cCCancelOrderActivity$1$1 = new CCCancelOrderActivity$1$1(this);
        translateAnimation.setAnimationListener((Animation.AnimationListener)cCCancelOrderActivity$1$1);
        this.val$mNotificationView.startAnimation((Animation)translateAnimation);
    }
}

