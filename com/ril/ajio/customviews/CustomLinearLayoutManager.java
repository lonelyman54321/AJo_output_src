/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.customviews;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$y;
import kotlin.jvm.internal.Intrinsics;

public final class CustomLinearLayoutManager
extends LinearLayoutManager {
    public static final int $stable;

    public CustomLinearLayoutManager(Context context, int n3, boolean bl2) {
        Intrinsics.checkNotNull(context);
        super(context, n3, bl2);
    }

    public void onLayoutChildren(RecyclerView$u object, RecyclerView$y objectArray) {
        Intrinsics.checkNotNullParameter(object, "recycler");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(objectArray, string2);
        try {
            super.onLayoutChildren((RecyclerView$u)object, (RecyclerView$y)objectArray);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            object = yn3_0.a;
            int n3 = 1;
            objectArray = new Object[n3];
            objectArray[0] = "Inconsistency detected";
            string2 = "CustomLinearLayoutManager";
            ((yn3$a)object).d(string2, objectArray);
        }
    }

    public boolean supportsPredictiveItemAnimations() {
        return false;
    }
}

