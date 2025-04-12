/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.progressindicator.DrawableWithAnimatedVisibilityChange;

class DrawableWithAnimatedVisibilityChange$2
extends AnimatorListenerAdapter {
    final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

    public DrawableWithAnimatedVisibilityChange$2(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.this$0 = drawableWithAnimatedVisibilityChange;
    }

    public void onAnimationEnd(Animator animator2) {
        super.onAnimationEnd(animator2);
        DrawableWithAnimatedVisibilityChange.access$101(this.this$0, false, false);
        DrawableWithAnimatedVisibilityChange.access$200(this.this$0);
    }
}

