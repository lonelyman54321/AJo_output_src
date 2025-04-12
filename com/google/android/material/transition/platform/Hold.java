/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.ValueAnimator
 *  android.transition.TransitionValues
 *  android.transition.Visibility
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;

public final class Hold
extends Visibility {
    public Animator onAppear(ViewGroup object, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        object = new float[1];
        object[0] = (ViewGroup)0.0f;
        return ValueAnimator.ofFloat((float[])object);
    }

    public Animator onDisappear(ViewGroup object, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        object = new float[1];
        object[0] = (ViewGroup)0.0f;
        return ValueAnimator.ofFloat((float[])object);
    }
}

