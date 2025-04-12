/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.ondemand.customercare.faq;

import com.ril.ajio.ondemand.customercare.view.adapter.CCBaseAdapter;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCFaqAdapter
extends CCBaseAdapter {
    public CCFaqAdapter(List list, i82_0 i82_02) {
        super(list, i82_02);
    }

    public int getItemViewType(int n3) {
        Object object = this.mItemList;
        Intrinsics.checkNotNull(object);
        object = object.get(n3);
        boolean bl2 = object instanceof UiCCComponent;
        if (bl2) {
            object = this.mItemList;
            Intrinsics.checkNotNull(object);
            Object object2 = object.get(n3);
            object = "null cannot be cast to non-null type com.ril.ajio.ondemand.customercare.view.common.UiCCComponent";
            Intrinsics.checkNotNull(object2, (String)object);
            object2 = (UiCCComponent)object2;
            n3 = ((UiCCComponent)object2).getType();
        } else {
            n3 = 3;
        }
        return n3;
    }
}

