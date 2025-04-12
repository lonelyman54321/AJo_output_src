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

class ExtendedFloatingActionButton$4
implements ExtendedFloatingActionButton$Size {
    final /* synthetic */ ExtendedFloatingActionButton this$0;
    final /* synthetic */ ExtendedFloatingActionButton$Size val$matchParentSize;
    final /* synthetic */ ExtendedFloatingActionButton$Size val$wrapContentSize;

    public ExtendedFloatingActionButton$4(ExtendedFloatingActionButton extendedFloatingActionButton, ExtendedFloatingActionButton$Size extendedFloatingActionButton$Size, ExtendedFloatingActionButton$Size extendedFloatingActionButton$Size2) {
        this.this$0 = extendedFloatingActionButton;
        this.val$matchParentSize = extendedFloatingActionButton$Size;
        this.val$wrapContentSize = extendedFloatingActionButton$Size2;
    }

    public int getHeight() {
        int n3;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n4 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton);
        if (n4 == (n3 = -1)) {
            return this.val$matchParentSize.getHeight();
        }
        extendedFloatingActionButton = this.this$0;
        n4 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton);
        if (n4 != 0 && (n4 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton = this.this$0)) != (n3 = -2)) {
            return ExtendedFloatingActionButton.access$200(this.this$0);
        }
        return this.val$wrapContentSize.getHeight();
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n3 = ExtendedFloatingActionButton.access$300(extendedFloatingActionButton);
        int n4 = -2;
        if (n3 == 0) {
            n3 = -2;
        } else {
            extendedFloatingActionButton = this.this$0;
            n3 = ExtendedFloatingActionButton.access$300(extendedFloatingActionButton);
        }
        ExtendedFloatingActionButton extendedFloatingActionButton2 = this.this$0;
        int n7 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton2);
        if (n7 != 0) {
            ExtendedFloatingActionButton extendedFloatingActionButton3 = this.this$0;
            n4 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton3);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(n3, n4);
        return layoutParams;
    }

    public int getPaddingEnd() {
        return ExtendedFloatingActionButton.access$100(this.this$0);
    }

    public int getPaddingStart() {
        return ExtendedFloatingActionButton.access$000(this.this$0);
    }

    public int getWidth() {
        int n3;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n4 = ExtendedFloatingActionButton.access$300(extendedFloatingActionButton);
        if (n4 == (n3 = -1)) {
            return this.val$matchParentSize.getWidth();
        }
        extendedFloatingActionButton = this.this$0;
        n4 = ExtendedFloatingActionButton.access$300(extendedFloatingActionButton);
        if (n4 != 0 && (n4 = ExtendedFloatingActionButton.access$300(extendedFloatingActionButton = this.this$0)) != (n3 = -2)) {
            return ExtendedFloatingActionButton.access$300(this.this$0);
        }
        return this.val$wrapContentSize.getWidth();
    }
}

