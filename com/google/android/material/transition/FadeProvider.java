/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.transition.FadeProvider$1;
import com.google.android.material.transition.FadeProvider$2;
import com.google.android.material.transition.VisibilityAnimatorProvider;

public final class FadeProvider
implements VisibilityAnimatorProvider {
    private float incomingEndThreshold = 1.0f;

    private static Animator createFadeAnimator(View view, float f5, float f6, float f7, float f8, float f11) {
        Object object = new float[]{0.0f, 1.0f};
        object = ValueAnimator.ofFloat((float[])object);
        FadeProvider$1 fadeProvider$1 = new FadeProvider$1(view, f5, f6, f7, f8);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)fadeProvider$1);
        FadeProvider$2 fadeProvider$2 = new FadeProvider$2(view, f11);
        object.addListener((Animator.AnimatorListener)fadeProvider$2);
        return object;
    }

    public Animator createAppear(ViewGroup viewGroup, View view) {
        float f5;
        float f6 = view.getAlpha();
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            object = 1065353216;
            f6 = 1.0f;
            f5 = 1.0f;
        } else {
            f5 = f6 = view.getAlpha();
        }
        float f8 = this.incomingEndThreshold;
        return FadeProvider.createFadeAnimator(view, 0.0f, f5, 0.0f, f8, f5);
    }

    public Animator createDisappear(ViewGroup viewGroup, View view) {
        float f5;
        float f6 = view.getAlpha();
        float f7 = f6 - 0.0f;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            object = 1065353216;
            f6 = 1.0f;
            f5 = 1.0f;
        } else {
            f5 = f6 = view.getAlpha();
        }
        return FadeProvider.createFadeAnimator(view, f5, 0.0f, 0.0f, 1.0f, f5);
    }

    public float getIncomingEndThreshold() {
        return this.incomingEndThreshold;
    }

    public void setIncomingEndThreshold(float f5) {
        this.incomingEndThreshold = f5;
    }
}

