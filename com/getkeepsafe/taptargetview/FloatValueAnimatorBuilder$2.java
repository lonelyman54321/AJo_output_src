/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.getkeepsafe.taptargetview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder;

class FloatValueAnimatorBuilder$2
extends AnimatorListenerAdapter {
    final /* synthetic */ FloatValueAnimatorBuilder this$0;

    public FloatValueAnimatorBuilder$2(FloatValueAnimatorBuilder floatValueAnimatorBuilder) {
        this.this$0 = floatValueAnimatorBuilder;
    }

    public void onAnimationEnd(Animator animator2) {
        this.this$0.endListener.onEnd();
    }
}

