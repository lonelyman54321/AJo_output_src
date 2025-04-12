/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.TextDrawableHelper$TextDrawableDelegate;
import com.google.android.material.resources.TextAppearanceFontCallback;

class TextDrawableHelper$1
extends TextAppearanceFontCallback {
    final /* synthetic */ TextDrawableHelper this$0;

    public TextDrawableHelper$1(TextDrawableHelper textDrawableHelper) {
        this.this$0 = textDrawableHelper;
    }

    public void onFontRetrievalFailed(int n3) {
        Object object = this.this$0;
        boolean bl2 = true;
        TextDrawableHelper.access$002((TextDrawableHelper)object, bl2);
        object = (TextDrawableHelper$TextDrawableDelegate)TextDrawableHelper.access$100(this.this$0).get();
        if (object != null) {
            object.onTextSizeChange();
        }
    }

    public void onFontRetrieved(Typeface object, boolean bl2) {
        if (bl2) {
            return;
        }
        object = this.this$0;
        bl2 = true;
        TextDrawableHelper.access$002((TextDrawableHelper)object, bl2);
        object = (TextDrawableHelper$TextDrawableDelegate)TextDrawableHelper.access$100(this.this$0).get();
        if (object != null) {
            object.onTextSizeChange();
        }
    }
}

