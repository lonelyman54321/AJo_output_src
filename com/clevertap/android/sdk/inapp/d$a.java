/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.TranslateAnimation
 */
package com.clevertap.android.sdk.inapp;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.clevertap.android.sdk.inapp.c;
import com.clevertap.android.sdk.inapp.d;

public final class d$a
extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ d a;

    public d$a(d d2) {
        this.a = d2;
    }

    public final void a(boolean bl2) {
        Object object;
        boolean bl3 = true;
        AnimationSet animationSet = new AnimationSet(bl3);
        int n3 = 50;
        float f5 = 7.0E-44f;
        d d2 = this.a;
        if (bl2) {
            n3 = d2.Sa(n3);
            f5 = n3;
            object = new TranslateAnimation(0.0f, f5, 0.0f, 0.0f);
        } else {
            n3 = -d2.Sa(n3);
            f5 = n3;
            object = new TranslateAnimation(0.0f, f5, 0.0f, 0.0f);
        }
        animationSet.addAnimation((Animation)object);
        object = new AlphaAnimation(1.0f, 0.0f);
        animationSet.addAnimation((Animation)object);
        animationSet.setDuration(300L);
        animationSet.setFillAfter(bl3);
        animationSet.setFillEnabled(bl3);
        object = new c(this);
        animationSet.setAnimationListener((Animation.AnimationListener)object);
        d2.k.startAnimation((Animation)animationSet);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6) {
        float f7;
        float f8;
        f6 = motionEvent.getX();
        float f11 = motionEvent2.getX();
        f6 -= f11;
        f11 = 0.0f;
        float f12 = 200.0f;
        boolean bl2 = true;
        float f14 = 120.0f;
        float f15 = f6 - f14;
        Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (object > 0 && (object = (f8 = (f6 = Math.abs(f5)) - f12) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) > 0) {
            this.a(false);
            return bl2;
        }
        float f16 = motionEvent2.getX();
        float f17 = motionEvent.getX();
        float f18 = (f16 -= f17) - f14;
        Object object2 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
        if (object2 > 0 && (object2 = (f7 = (f17 = Math.abs(f5)) - f12) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            this.a(bl2);
            return bl2;
        }
        return false;
    }
}

