/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.ril.ajio.customviews.widgets.managers;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;

public final class CustomScrollLinearLayoutManager
extends LinearLayoutManager {
    public static final int $stable = 8;
    private boolean isScrollEnabled;

    public CustomScrollLinearLayoutManager(Context context) {
        Intrinsics.checkNotNull(context);
        super(context);
        this.isScrollEnabled = true;
    }

    public boolean canScrollVertically() {
        boolean bl2 = this.isScrollEnabled;
        bl2 = bl2 && (bl2 = super.canScrollVertically());
        return bl2;
    }

    public final void setScrollEnabled(boolean bl2) {
        this.isScrollEnabled = bl2;
    }
}

