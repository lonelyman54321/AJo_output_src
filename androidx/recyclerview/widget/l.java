/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;

public final class l
extends RecyclerView$n {
    public static final int[] d = new int[]{16843284};
    public Drawable a;
    public final int b;
    public final Rect c;

    public l(Context object, int n3) {
        int n4;
        Object object2;
        this.c = object2 = new Rect();
        object2 = d;
        object = object.obtainStyledAttributes((int[])object2);
        object2 = object.getDrawable(0);
        this.a = object2;
        object.recycle();
        if (n3 != 0 && n3 != (n4 = 1)) {
            super("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
            throw object;
        }
        this.b = n3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        view = this.a;
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        int n3 = this.b;
        int n4 = 1;
        if (n3 == n4) {
            int n7 = view.getIntrinsicHeight();
            rect.set(0, 0, 0, n7);
        } else {
            int n8 = view.getIntrinsicWidth();
            rect.set(0, 0, n8, 0);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y object) {
        object = recyclerView.getLayoutManager();
        if (object != null && (object = this.a) != null) {
            int n3 = this.b;
            Rect rect = this.c;
            int n4 = 0;
            int n7 = 1;
            if (n3 == n7) {
                int n8;
                int n10;
                int n14;
                canvas.save();
                n3 = (int)(recyclerView.getClipToPadding() ? 1 : 0);
                if (n3 != 0) {
                    n3 = recyclerView.getPaddingLeft();
                    n7 = recyclerView.getWidth();
                    n14 = recyclerView.getPaddingRight();
                    n7 -= n14;
                    n14 = recyclerView.getPaddingTop();
                    n10 = recyclerView.getHeight();
                    n8 = recyclerView.getPaddingBottom();
                    canvas.clipRect(n3, n14, n7, n10 -= n8);
                } else {
                    n7 = recyclerView.getWidth();
                    n3 = 0;
                    object = null;
                }
                n14 = recyclerView.getChildCount();
                while (n4 < n14) {
                    View view = recyclerView.getChildAt(n4);
                    recyclerView.getDecoratedBoundsWithMargins(view, rect);
                    n8 = rect.bottom;
                    float f5 = view.getTranslationY();
                    n10 = Math.round(f5) + n8;
                    Drawable drawable2 = this.a;
                    n8 = drawable2.getIntrinsicHeight();
                    n8 = n10 - n8;
                    Drawable drawable3 = this.a;
                    drawable3.setBounds(n3, n8, n7, n10);
                    view = this.a;
                    view.draw(canvas);
                    ++n4;
                }
                canvas.restore();
            } else {
                int n15;
                int n16;
                int n17;
                canvas.save();
                n3 = (int)(recyclerView.getClipToPadding() ? 1 : 0);
                if (n3 != 0) {
                    n3 = recyclerView.getPaddingTop();
                    n7 = recyclerView.getHeight();
                    n17 = recyclerView.getPaddingBottom();
                    n7 -= n17;
                    n17 = recyclerView.getPaddingLeft();
                    n16 = recyclerView.getWidth();
                    n15 = recyclerView.getPaddingRight();
                    canvas.clipRect(n17, n3, n16 -= n15, n7);
                } else {
                    n7 = recyclerView.getHeight();
                    n3 = 0;
                    object = null;
                }
                n17 = recyclerView.getChildCount();
                while (n4 < n17) {
                    View view = recyclerView.getChildAt(n4);
                    recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(view, rect);
                    n15 = rect.right;
                    float f6 = view.getTranslationX();
                    n16 = Math.round(f6) + n15;
                    Drawable drawable4 = this.a;
                    n15 = drawable4.getIntrinsicWidth();
                    n15 = n16 - n15;
                    Drawable drawable5 = this.a;
                    drawable5.setBounds(n15, n3, n16, n7);
                    view = this.a;
                    view.draw(canvas);
                    ++n4;
                }
                canvas.restore();
            }
        }
    }
}

