/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.t;

public final class r
extends t {
    public final int b(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.a.getDecoratedRight(view);
        int n4 = recyclerView$LayoutParams.rightMargin;
        return n3 + n4;
    }

    public final int c(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.a.getDecoratedMeasuredWidth(view);
        int n4 = recyclerView$LayoutParams.leftMargin;
        int n7 = recyclerView$LayoutParams.rightMargin;
        return (n3 += n4) + n7;
    }

    public final int d(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.a.getDecoratedMeasuredHeight(view);
        int n4 = recyclerView$LayoutParams.topMargin;
        int n7 = recyclerView$LayoutParams.bottomMargin;
        return (n3 += n4) + n7;
    }

    public final int e(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.a.getDecoratedLeft(view);
        int n4 = recyclerView$LayoutParams.leftMargin;
        return n3 - n4;
    }

    public final int f() {
        return this.a.getWidth();
    }

    public final int g() {
        RecyclerView$o recyclerView$o = this.a;
        int n3 = recyclerView$o.getWidth();
        int n4 = recyclerView$o.getPaddingRight();
        return n3 - n4;
    }

    public final int h() {
        return this.a.getPaddingRight();
    }

    public final int i() {
        return this.a.getWidthMode();
    }

    public final int j() {
        return this.a.getHeightMode();
    }

    public final int k() {
        return this.a.getPaddingLeft();
    }

    public final int l() {
        RecyclerView$o recyclerView$o = this.a;
        int n3 = recyclerView$o.getWidth();
        int n4 = recyclerView$o.getPaddingLeft();
        int n7 = recyclerView$o.getPaddingRight();
        return (n3 -= n4) - n7;
    }

    public final int n(View view) {
        RecyclerView$o recyclerView$o = this.a;
        Rect rect = this.c;
        recyclerView$o.getTransformedBoundingBox(view, true, rect);
        return rect.right;
    }

    public final int o(View view) {
        RecyclerView$o recyclerView$o = this.a;
        Rect rect = this.c;
        recyclerView$o.getTransformedBoundingBox(view, true, rect);
        return rect.left;
    }

    public final void p(int n3) {
        this.a.offsetChildrenHorizontal(n3);
    }
}

