/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.view.View
 */
package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener$Listener;

public final class d
implements MultiViewUpdateListener$Listener {
    public final void onAnimationUpdate(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.c(valueAnimator, view);
    }
}

