/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.cart.cartlist.util;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.RecyclerView$y;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import kotlin.jvm.internal.Intrinsics;

public class WrapperLinearLayoutManager
extends LinearLayoutManager {
    public WrapperLinearLayoutManager(Context context) {
        Intrinsics.checkNotNull(context);
        super(context);
    }

    public WrapperLinearLayoutManager(Context context, int n3) {
        Intrinsics.checkNotNull(context);
        super(context, 0, false);
    }

    public final void onLayoutChildren(RecyclerView$u recyclerView$u, RecyclerView$y object) {
        Intrinsics.checkNotNullParameter(recyclerView$u, "recycler");
        String string2 = "state";
        Intrinsics.checkNotNullParameter(object, string2);
        try {
            super.onLayoutChildren(recyclerView$u, (RecyclerView$y)object);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            yn3_0.a.e(indexOutOfBoundsException);
            object = FirebaseCrashlytics.getInstance();
            ((FirebaseCrashlytics)object).recordException(indexOutOfBoundsException);
        }
    }

    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}

