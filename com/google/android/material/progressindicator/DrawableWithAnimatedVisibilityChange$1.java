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

class DrawableWithAnimatedVisibilityChange$1
extends AnimatorListenerAdapter {
    final /* synthetic */ DrawableWithAnimatedVisibilityChange this$0;

    public DrawableWithAnimatedVisibilityChange$1(DrawableWithAnimatedVisibilityChange drawableWithAnimatedVisibilityChange) {
        this.this$0 = drawableWithAnimatedVisibilityChange;
    }

    public void onAnimationStart(Animator animator2) {
        super.onAnimationStart(animator2);
        DrawableWithAnimatedVisibilityChange.access$000(this.this$0);
    }
}

