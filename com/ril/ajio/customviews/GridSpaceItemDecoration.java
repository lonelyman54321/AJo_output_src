/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package com.ril.ajio.customviews;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.Intrinsics;

public final class GridSpaceItemDecoration
extends RecyclerView$n {
    public static final int $stable;
    private final double space;

    public GridSpaceItemDecoration(double d2) {
        this.space = d2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        int n3 = recyclerView.getChildLayoutPosition(view) % 2;
        if (n3 == 0) {
            double d2 = this.space;
            rect.right = n3 = (int)d2;
        } else {
            double d5 = this.space;
            rect.left = n3 = (int)d5;
        }
    }
}

