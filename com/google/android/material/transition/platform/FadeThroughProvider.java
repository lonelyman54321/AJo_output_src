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
package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.transition.platform.FadeThroughProvider$1;
import com.google.android.material.transition.platform.FadeThroughProvider$2;
import com.google.android.material.transition.platform.VisibilityAnimatorProvider;

public final class FadeThroughProvider
implements VisibilityAnimatorProvider {
    static final float FADE_THROUGH_THRESHOLD = 0.35f;
    private float progressThreshold = 0.35f;

    private static Animator createFadeThroughAnimator(View view, float f5, float f6, float f7, float f8, float f11) {
        Object object = new float[]{0.0f, 1.0f};
        object = ValueAnimator.ofFloat((float[])object);
        FadeThroughProvider$1 fadeThroughProvider$1 = new FadeThroughProvider$1(view, f5, f6, f7, f8);
        object.addUpdateListener((ValueAnimator.AnimatorUpdateListener)fadeThroughProvider$1);
        FadeThroughProvider$2 fadeThroughProvider$2 = new FadeThroughProvider$2(view, f11);
        object.addListener((Animator.AnimatorListener)fadeThroughProvider$2);
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
        float f8 = this.progressThreshold;
        return FadeThroughProvider.createFadeThroughAnimator(view, 0.0f, f5, f8, 1.0f, f5);
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
        float f8 = this.progressThreshold;
        return FadeThroughProvider.createFadeThroughAnimator(view, f5, 0.0f, 0.0f, f8, f5);
    }

    public float getProgressThreshold() {
        return this.progressThreshold;
    }

    public void setProgressThreshold(float f5) {
        this.progressThreshold = f5;
    }
}

