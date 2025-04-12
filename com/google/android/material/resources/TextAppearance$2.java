/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Typeface
 *  android.text.TextPaint
 */
package com.google.android.material.resources;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;

class TextAppearance$2
extends TextAppearanceFontCallback {
    final /* synthetic */ TextAppearance this$0;
    final /* synthetic */ TextAppearanceFontCallback val$callback;
    final /* synthetic */ Context val$context;
    final /* synthetic */ TextPaint val$textPaint;

    public TextAppearance$2(TextAppearance textAppearance, Context context, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        this.this$0 = textAppearance;
        this.val$context = context;
        this.val$textPaint = textPaint;
        this.val$callback = textAppearanceFontCallback;
    }

    public void onFontRetrievalFailed(int n3) {
        this.val$callback.onFontRetrievalFailed(n3);
    }

    public void onFontRetrieved(Typeface typeface, boolean bl2) {
        TextAppearance textAppearance = this.this$0;
        Context context = this.val$context;
        TextPaint textPaint = this.val$textPaint;
        textAppearance.updateTextPaintMeasureState(context, textPaint, typeface);
        this.val$callback.onFontRetrieved(typeface, bl2);
    }
}

