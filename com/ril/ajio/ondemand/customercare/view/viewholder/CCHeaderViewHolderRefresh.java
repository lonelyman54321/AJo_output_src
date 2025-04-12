/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.adapter.CCProductAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CCHeaderViewHolderRefresh
extends uv_2 {
    private ArrayList cartOrderList;
    private final RecyclerView recyclerView;

    public CCHeaderViewHolderRefresh(View object, i82_0 object2) {
        String string2 = "itemView";
        Intrinsics.checkNotNullParameter(object, string2);
        super((View)object, (i82_0)object2);
        int n3 = R$id.row_cc_header_rv;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (RecyclerView)object;
        this.recyclerView = object;
        object2 = this.getMOnCCClickListener();
        n3 = object2 instanceof Fragment;
        if (n3 != 0) {
            object2 = this.getMOnCCClickListener();
            Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            object2 = (Fragment)object2;
            ((RecyclerView)object).setHasFixedSize(true);
            string2 = null;
            ((RecyclerView)object).setNestedScrollingEnabled(false);
            object2 = ((Fragment)object2).requireActivity();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager((Context)object2, 0, false);
            ((RecyclerView)object).setLayoutManager(linearLayoutManager);
        }
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof ArrayList;
        if (n3 != 0) {
            this.cartOrderList = object = (ArrayList)object;
        }
        if ((object = this.cartOrderList) != null) {
            RecyclerView recyclerView = this.recyclerView;
            i82_0 i82_02 = this.getMOnCCClickListener();
            CCProductAdapter cCProductAdapter = new CCProductAdapter((List)object, i82_02);
            recyclerView.setAdapter(cCProductAdapter);
        }
    }
}

