/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package com.google.android.material.resources;

import android.graphics.Typeface;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;

class TextAppearance$1
extends WK2$d {
    final /* synthetic */ TextAppearance this$0;
    final /* synthetic */ TextAppearanceFontCallback val$callback;

    public TextAppearance$1(TextAppearance textAppearance, TextAppearanceFontCallback textAppearanceFontCallback) {
        this.this$0 = textAppearance;
        this.val$callback = textAppearanceFontCallback;
    }

    public void onFontRetrievalFailed(int n3) {
        TextAppearance.access$102(this.this$0, true);
        this.val$callback.onFontRetrievalFailed(n3);
    }

    public void onFontRetrieved(Typeface object) {
        TextAppearance textAppearance = this.this$0;
        int n3 = textAppearance.textStyle;
        object = Typeface.create((Typeface)object, (int)n3);
        TextAppearance.access$002(textAppearance, (Typeface)object);
        TextAppearance.access$102(this.this$0, true);
        object = this.val$callback;
        textAppearance = TextAppearance.access$000(this.this$0);
        ((TextAppearanceFontCallback)object).onFontRetrieved((Typeface)textAppearance, false);
    }
}

