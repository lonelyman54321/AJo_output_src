/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition.platform;

class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    public FitModeResult(float f5, float f6, float f7, float f8, float f11, float f12) {
        this.startScale = f5;
        this.endScale = f6;
        this.currentStartWidth = f7;
        this.currentStartHeight = f8;
        this.currentEndWidth = f11;
        this.currentEndHeight = f12;
    }
}

