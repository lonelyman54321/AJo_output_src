/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
package com.google.android.material.chip;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.resources.TextAppearanceFontCallback;

class Chip$1
extends TextAppearanceFontCallback {
    final /* synthetic */ Chip this$0;

    public Chip$1(Chip chip) {
        this.this$0 = chip;
    }

    public void onFontRetrievalFailed(int n3) {
    }

    public void onFontRetrieved(Typeface object, boolean bl2) {
        object = this.this$0;
        Object object2 = Chip.access$000((Chip)object);
        bl2 = ((ChipDrawable)object2).shouldDrawText();
        object2 = bl2 ? Chip.access$000(this.this$0).getText() : this.this$0.getText();
        object.setText((CharSequence)object2);
        this.this$0.requestLayout();
        this.this$0.invalidate();
    }
}

