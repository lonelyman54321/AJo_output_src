/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.view.adapter;

import com.ril.ajio.ondemand.customercare.view.adapter.CCBaseAdapter;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintAdapter
extends CCBaseAdapter {
    public CCComplaintAdapter(List list, i82_0 i82_02) {
        Intrinsics.checkNotNull(i82_02);
        super(list, i82_02);
    }

    public int getItemViewType(int n3) {
        return 20;
    }
}

