/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

public interface VisibilityAnimatorProvider {
    public Animator createAppear(ViewGroup var1, View var2);

    public Animator createDisappear(ViewGroup var1, View var2);
}

