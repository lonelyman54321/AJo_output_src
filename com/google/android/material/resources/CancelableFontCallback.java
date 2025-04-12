/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package com.google.android.material.resources;

import android.graphics.Typeface;
import com.google.android.material.resources.CancelableFontCallback$ApplyFont;
import com.google.android.material.resources.TextAppearanceFontCallback;

public final class CancelableFontCallback
extends TextAppearanceFontCallback {
    private final CancelableFontCallback$ApplyFont applyFont;
    private boolean cancelled;
    private final Typeface fallbackFont;

    public CancelableFontCallback(CancelableFontCallback$ApplyFont cancelableFontCallback$ApplyFont, Typeface typeface) {
        this.fallbackFont = typeface;
        this.applyFont = cancelableFontCallback$ApplyFont;
    }

    private void updateIfNotCancelled(Typeface typeface) {
        boolean bl2 = this.cancelled;
        if (!bl2) {
            CancelableFontCallback$ApplyFont cancelableFontCallback$ApplyFont = this.applyFont;
            cancelableFontCallback$ApplyFont.apply(typeface);
        }
    }

    public void cancel() {
        this.cancelled = true;
    }

    public void onFontRetrievalFailed(int n3) {
        Typeface typeface = this.fallbackFont;
        this.updateIfNotCancelled(typeface);
    }

    public void onFontRetrieved(Typeface typeface, boolean bl2) {
        this.updateIfNotCancelled(typeface);
    }
}

