/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.ondemand.customercare.itemdetail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$layout;
import com.ril.ajio.ondemand.customercare.view.adapter.CCBaseAdapter;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import com.ril.ajio.ondemand.customercare.view.viewholder.CCItemDetailHeaderViewHolderRefresh;
import com.ril.ajio.services.data.CustomerCare.itemstatus.CCCartEntryStatus;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCItemDetailAdapter
extends CCBaseAdapter {
    private final CCCartEntryStatus mCartEntryStatus;

    public CCItemDetailAdapter(List list, i82_0 i82_02, CCCartEntryStatus cCCartEntryStatus) {
        Intrinsics.checkNotNullParameter(cCCartEntryStatus, "mCartEntryStatus");
        super(list, i82_02);
        this.mCartEntryStatus = cCCartEntryStatus;
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
            n3 = 13;
        }
        return n3;
    }

    public uv_2 onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 13;
        if (n3 == n4) {
            Object object2 = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.row_cc_item_detail_header_refresh;
            viewGroup = object2.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object = this.getMOnCCClickListener();
            CCCartEntryStatus cCCartEntryStatus = this.mCartEntryStatus;
            object2 = new CCItemDetailHeaderViewHolderRefresh((View)viewGroup, (i82_0)object, cCCartEntryStatus);
            return object2;
        }
        return super.onCreateViewHolder(viewGroup, n3);
    }
}

