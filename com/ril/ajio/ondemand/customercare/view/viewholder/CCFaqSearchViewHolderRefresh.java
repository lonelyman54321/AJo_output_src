/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.view.View;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class CCFaqSearchViewHolderRefresh
extends uv_2
implements View.OnClickListener {
    private final View faqSearchView;
    private final i82_0 onCCClickListener;

    public CCFaqSearchViewHolderRefresh(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        this.onCCClickListener = i82_02;
        int n3 = R$id.searchbar_layout;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        this.faqSearchView = view;
    }

    public final i82_0 getOnCCClickListener() {
        return this.onCCClickListener;
    }

    public void onClick(View object) {
        int n3;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.searchbar_layout;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4 && (object = this.getMOnCCClickListener()) != null) {
            n4 = 26;
            object.onViewItemClick(null, n4);
        }
    }

    public void setData(Object object, int n3) {
        this.faqSearchView.setOnClickListener((View.OnClickListener)this);
    }
}

