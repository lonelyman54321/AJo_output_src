/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.view.adapter;

import com.ril.ajio.ondemand.customercare.view.adapter.CCBaseAdapter;
import java.util.List;

public final class CCProductAdapter
extends CCBaseAdapter {
    public CCProductAdapter(List list, i82_0 i82_02) {
        super(list, i82_02);
    }

    public int getItemCount() {
        int n3;
        List list = this.mItemList;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public int getItemViewType(int n3) {
        int n4 = 9;
        n3 = n3 == n4 ? 17 : 16;
        return n3;
    }
}

