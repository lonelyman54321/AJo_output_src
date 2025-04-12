/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.Drawable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.shadow.ShadowViewDelegate;

class FloatingActionButton$ShadowDelegateImpl
implements ShadowViewDelegate {
    final /* synthetic */ FloatingActionButton this$0;

    public FloatingActionButton$ShadowDelegateImpl(FloatingActionButton floatingActionButton) {
        this.this$0 = floatingActionButton;
    }

    public float getRadius() {
        return (float)this.this$0.getSizeDimension() / 2.0f;
    }

    public boolean isCompatPaddingEnabled() {
        return this.this$0.compatPadding;
    }

    public void setBackgroundDrawable(Drawable drawable2) {
        if (drawable2 != null) {
            FloatingActionButton floatingActionButton = this.this$0;
            FloatingActionButton.access$101(floatingActionButton, drawable2);
        }
    }

    public void setShadowPadding(int n3, int n4, int n7, int n8) {
        this.this$0.shadowPadding.set(n3, n4, n7, n8);
        FloatingActionButton floatingActionButton = this.this$0;
        int n10 = FloatingActionButton.access$000(floatingActionButton) + n3;
        n3 = FloatingActionButton.access$000(this.this$0) + n4;
        n4 = FloatingActionButton.access$000(this.this$0) + n7;
        n7 = FloatingActionButton.access$000(this.this$0) + n8;
        floatingActionButton.setPadding(n10, n3, n4, n7);
    }
}

