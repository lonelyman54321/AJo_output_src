/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package com.google.android.material.internal;

import android.graphics.Typeface;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.resources.CancelableFontCallback$ApplyFont;

class CollapsingTextHelper$2
implements CancelableFontCallback$ApplyFont {
    final /* synthetic */ CollapsingTextHelper this$0;

    public CollapsingTextHelper$2(CollapsingTextHelper collapsingTextHelper) {
        this.this$0 = collapsingTextHelper;
    }

    public void apply(Typeface typeface) {
        this.this$0.setExpandedTypeface(typeface);
    }
}

