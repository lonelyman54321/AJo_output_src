/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.ValueAnimator
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Visibility;

public final class Hold
extends Visibility {
    public Animator onAppear(ViewGroup object, View view, Or3 or3, Or3 or32) {
        object = new float[1];
        object[0] = (ViewGroup)0.0f;
        return ValueAnimator.ofFloat((float[])object);
    }

    public Animator onDisappear(ViewGroup object, View view, Or3 or3, Or3 or32) {
        object = new float[1];
        object[0] = (ViewGroup)0.0f;
        return ValueAnimator.ofFloat((float[])object);
    }
}

