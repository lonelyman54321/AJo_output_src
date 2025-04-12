/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition.platform;

class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int n3, int n4, boolean bl2) {
        this.startAlpha = n3;
        this.endAlpha = n4;
        this.endOnTop = bl2;
    }

    public static FadeModeResult endOnTop(int n3, int n4) {
        FadeModeResult fadeModeResult = new FadeModeResult(n3, n4, true);
        return fadeModeResult;
    }

    public static FadeModeResult startOnTop(int n3, int n4) {
        FadeModeResult fadeModeResult = new FadeModeResult(n3, n4, false);
        return fadeModeResult;
    }
}

