/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.A$b;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$o;

public final class RecyclerView$o$a
implements A$b {
    public final /* synthetic */ RecyclerView$o a;

    public RecyclerView$o$a(RecyclerView$o recyclerView$o) {
        this.a = recyclerView$o;
    }

    public final int a(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.a.getDecoratedLeft(view);
        int n4 = recyclerView$LayoutParams.leftMargin;
        return n3 - n4;
    }

    public final int b() {
        return this.a.getPaddingLeft();
    }

    public final int c() {
        RecyclerView$o recyclerView$o = this.a;
        int n3 = recyclerView$o.getWidth();
        int n4 = recyclerView$o.getPaddingRight();
        return n3 - n4;
    }

    public final int d(View view) {
        RecyclerView$LayoutParams recyclerView$LayoutParams = (RecyclerView$LayoutParams)view.getLayoutParams();
        int n3 = this.a.getDecoratedRight(view);
        int n4 = recyclerView$LayoutParams.rightMargin;
        return n3 + n4;
    }

    public final View getChildAt(int n3) {
        return this.a.getChildAt(n3);
    }
}

