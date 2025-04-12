/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.TranslateAnimation
 */
package com.ril.ajio.myaccount.order;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity;
import com.ril.ajio.myaccount.order.MarkDeliveredActivity$2$a;

class MarkDeliveredActivity$2
implements Runnable {
    public final /* synthetic */ long a;
    public final /* synthetic */ MarkDeliveredActivity b;

    public MarkDeliveredActivity$2(MarkDeliveredActivity markDeliveredActivity, long l2) {
        this.b = markDeliveredActivity;
        this.a = l2;
    }

    public final void run() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -100.0f);
        long l2 = this.a;
        translateAnimation.setDuration(l2);
        MarkDeliveredActivity$2$a markDeliveredActivity$2$a = new MarkDeliveredActivity$2$a(this);
        translateAnimation.setAnimationListener((Animation.AnimationListener)markDeliveredActivity$2$a);
        this.b.z0.startAnimation((Animation)translateAnimation);
    }
}

