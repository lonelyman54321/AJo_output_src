/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.customviews.widgets;

import android.view.animation.Animation;
import com.ril.ajio.customviews.widgets.AjioWrappingViewPager;

class AjioWrappingViewPager$2
implements Animation.AnimationListener {
    final /* synthetic */ AjioWrappingViewPager this$0;

    public AjioWrappingViewPager$2(AjioWrappingViewPager ajioWrappingViewPager) {
        this.this$0 = ajioWrappingViewPager;
    }

    public void onAnimationEnd(Animation object) {
        object = this.this$0;
        Boolean bl2 = Boolean.FALSE;
        AjioWrappingViewPager.a((AjioWrappingViewPager)((Object)object), bl2);
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation object) {
        object = this.this$0;
        Boolean bl2 = Boolean.TRUE;
        AjioWrappingViewPager.a((AjioWrappingViewPager)((Object)object), bl2);
    }
}

