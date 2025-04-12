/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  android.graphics.Rect
 */
package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

public class RectEvaluator
implements TypeEvaluator {
    private final Rect rect;

    public RectEvaluator(Rect rect) {
        this.rect = rect;
    }

    public Rect evaluate(float f5, Rect rect, Rect rect2) {
        int n3 = rect.left;
        int n4 = (int)((float)(rect2.left - n3) * f5);
        n3 += n4;
        n4 = rect.top;
        int n7 = (int)((float)(rect2.top - n4) * f5);
        n4 += n7;
        n7 = rect.right;
        int n8 = (int)((float)(rect2.right - n7) * f5);
        int n10 = rect.bottom;
        int n14 = (int)((float)(rect2.bottom - n10) * f5);
        this.rect.set(n3, n4, n7 += n8, n10 += n14);
        return this.rect;
    }
}

