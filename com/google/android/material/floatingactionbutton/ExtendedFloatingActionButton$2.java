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

class ExtendedFloatingActionButton$2
implements ExtendedFloatingActionButton$Size {
    final /* synthetic */ ExtendedFloatingActionButton this$0;

    public ExtendedFloatingActionButton$2(ExtendedFloatingActionButton extendedFloatingActionButton) {
        this.this$0 = extendedFloatingActionButton;
    }

    public int getHeight() {
        return this.this$0.getMeasuredHeight();
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        int n3 = -2;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n3, n3);
        return layoutParams;
    }

    public int getPaddingEnd() {
        return ExtendedFloatingActionButton.access$100(this.this$0);
    }

    public int getPaddingStart() {
        return ExtendedFloatingActionButton.access$000(this.this$0);
    }

    public int getWidth() {
        int n3 = this.this$0.getMeasuredWidth();
        int n4 = this.this$0.getCollapsedPadding() * 2;
        n3 -= n4;
        n4 = ExtendedFloatingActionButton.access$000(this.this$0) + n3;
        return ExtendedFloatingActionButton.access$100(this.this$0) + n4;
    }
}

