/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package com.jio.jioads.carousel.view;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.Intrinsics;

public final class e
extends RecyclerView$n {
    public final int a;

    public e() {
        this.a = 12;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        int n3 = recyclerView.getChildAdapterPosition(view);
        int n4 = this.a;
        if (n3 == 0) {
            n3 = 0;
            view = null;
        } else {
            n3 = n4;
        }
        rect.left = n3;
        rect.top = n3 = n4 + 4;
        rect.bottom = n4;
        rect.right = n4;
    }
}

