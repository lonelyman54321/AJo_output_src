/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$y;

public abstract class RecyclerView$n {
    public void getItemOffsets(Rect rect, int n3, RecyclerView recyclerView) {
        rect.set(0, 0, 0, 0);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        int n3 = ((RecyclerView$LayoutParams)view.getLayoutParams()).getViewLayoutPosition();
        this.getItemOffsets(rect, n3, recyclerView);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView) {
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        this.onDraw(canvas, recyclerView);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        this.onDrawOver(canvas, recyclerView);
    }
}

