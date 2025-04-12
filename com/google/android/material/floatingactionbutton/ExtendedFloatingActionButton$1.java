/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.floatingactionbutton;

import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size;

class ExtendedFloatingActionButton$1
implements ExtendedFloatingActionButton$Size {
    final /* synthetic */ ExtendedFloatingActionButton this$0;

    public ExtendedFloatingActionButton$1(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.this$0 = extendedFloatingActionButton;
    }

    public int getHeight() {
        return this.this$0.getCollapsedSize();
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n3, n4);
        return layoutParams;
    }

    public int getPaddingEnd() {
        return this.this$0.getCollapsedPadding();
    }

    public int getPaddingStart() {
        return this.this$0.getCollapsedPadding();
    }

    public int getWidth() {
        return this.this$0.getCollapsedSize();
    }
}

