/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 */
package com.google.android.material.floatingactionbutton;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size;

class ExtendedFloatingActionButton$3
implements ExtendedFloatingActionButton$Size {
    final /* synthetic */ ExtendedFloatingActionButton this$0;
    final /* synthetic */ ExtendedFloatingActionButton$Size val$wrapContentSize;

    public ExtendedFloatingActionButton$3(ExtendedFloatingActionButton extendedFloatingActionButton, ExtendedFloatingActionButton$Size extendedFloatingActionButton$Size) {
        this.this$0 = extendedFloatingActionButton;
        this.val$wrapContentSize = extendedFloatingActionButton$Size;
    }

    public int getHeight() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n3 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton);
        int n4 = -1;
        int n7 = -2;
        if (n3 == n4) {
            int n8;
            extendedFloatingActionButton = this.this$0.getParent();
            n3 = extendedFloatingActionButton instanceof View;
            if (n3 == 0) {
                return this.val$wrapContentSize.getHeight();
            }
            extendedFloatingActionButton = (View)this.this$0.getParent();
            ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
            if (layoutParams != null && (n4 = layoutParams.height) == n7) {
                return this.val$wrapContentSize.getHeight();
            }
            n4 = extendedFloatingActionButton.getPaddingTop();
            n7 = extendedFloatingActionButton.getPaddingBottom() + n4;
            layoutParams = this.this$0.getLayoutParams();
            n4 = layoutParams instanceof ViewGroup.MarginLayoutParams;
            if (n4 != 0 && (layoutParams = (ViewGroup.MarginLayoutParams)this.this$0.getLayoutParams()) != null) {
                n8 = layoutParams.topMargin;
                n4 = layoutParams.bottomMargin;
                n8 += n4;
            } else {
                n8 = 0;
            }
            return extendedFloatingActionButton.getHeight() - n8 - n7;
        }
        extendedFloatingActionButton = this.this$0;
        n3 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton);
        if (n3 != 0 && (n3 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton = this.this$0)) != n7) {
            return ExtendedFloatingActionButton.access$200(this.this$0);
        }
        return this.val$wrapContentSize.getHeight();
    }

    public ViewGroup.LayoutParams getLayoutParams() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n3 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton);
        if (n3 == 0) {
            n3 = -2;
        } else {
            extendedFloatingActionButton = this.this$0;
            n3 = ExtendedFloatingActionButton.access$200(extendedFloatingActionButton);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, n3);
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
        int n4;
        int n7;
        ViewParent viewParent = this.this$0.getParent();
        boolean bl2 = viewParent instanceof View;
        if (!bl2) {
            return this.val$wrapContentSize.getWidth();
        }
        viewParent = (View)this.this$0.getParent();
        ViewGroup.LayoutParams layoutParams = viewParent.getLayoutParams();
        if (layoutParams != null && (n7 = layoutParams.width) == (n4 = -2)) {
            return this.val$wrapContentSize.getWidth();
        }
        n7 = viewParent.getPaddingLeft();
        n4 = viewParent.getPaddingRight() + n7;
        layoutParams = this.this$0.getLayoutParams();
        n7 = layoutParams instanceof ViewGroup.MarginLayoutParams;
        if (n7 != 0 && (layoutParams = (ViewGroup.MarginLayoutParams)this.this$0.getLayoutParams()) != null) {
            n3 = layoutParams.leftMargin;
            n7 = layoutParams.rightMargin;
            n3 += n7;
        } else {
            n3 = 0;
        }
        return viewParent.getWidth() - n3 - n4;
    }
}

