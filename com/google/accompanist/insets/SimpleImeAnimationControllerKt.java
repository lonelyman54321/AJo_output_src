/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.LinearInterpolator
 */
package com.google.accompanist.insets;

import android.view.animation.LinearInterpolator;

public final class SimpleImeAnimationControllerKt {
    private static final float SCROLL_THRESHOLD = 0.15f;
    private static final LinearInterpolator linearInterpolator;

    static {
        LinearInterpolator linearInterpolator;
        SimpleImeAnimationControllerKt.linearInterpolator = linearInterpolator = new LinearInterpolator();
    }

    public static final /* synthetic */ LinearInterpolator access$getLinearInterpolator$p() {
        return linearInterpolator;
    }
}

