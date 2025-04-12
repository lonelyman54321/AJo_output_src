/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 */
package com.ril.ajio.customviews;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import kotlin.jvm.internal.Intrinsics;

public final class RecyclerViewUtil {
    public static final void setDivider(RecyclerView recyclerView, int n3) {
        Intrinsics.checkNotNullParameter(recyclerView, "<this>");
        Context context = recyclerView.getContext();
        int n4 = 1;
        l l2 = new l(context, n4);
        context = recyclerView.getContext();
        Drawable drawable2 = t70.getDrawable(context, n3);
        if (drawable2 != null) {
            l2.a = drawable2;
            recyclerView.addItemDecoration(l2);
        }
    }
}

