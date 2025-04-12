/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.internal.CollapsingTextHelper2;
import com.google.android.material.resources.CancelableFontCallback$ApplyFont;

class CollapsingTextHelper2$1
implements CancelableFontCallback$ApplyFont {
    final /* synthetic */ CollapsingTextHelper2 this$0;

    public CollapsingTextHelper2$1(CollapsingTextHelper2 collapsingTextHelper2) {
        this.this$0 = collapsingTextHelper2;
    }

    public void apply(Typeface typeface) {
        this.this$0.setCollapsedTypeface(typeface);
    }
}

