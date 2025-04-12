/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.View
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.Intrinsics;

public final class CCAttachmentHistoryViewHolder$1
extends RecyclerView$n {
    final /* synthetic */ int $verticalSpace;

    public CCAttachmentHistoryViewHolder$1(int n3) {
        this.$verticalSpace = n3;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView$y recyclerView$y) {
        Intrinsics.checkNotNullParameter(rect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(recyclerView, "parent");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(recyclerView$y, string2);
        super.getItemOffsets(rect, view, recyclerView, recyclerView$y);
        int n3 = recyclerView.getChildAdapterPosition(view);
        if (n3 > 0) {
            rect.top = n3 = this.$verticalSpace;
        }
    }
}

