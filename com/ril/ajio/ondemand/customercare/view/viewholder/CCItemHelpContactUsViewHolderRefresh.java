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

public final class CCItemHelpContactUsViewHolderRefresh
extends uv_2
implements View.OnClickListener {
    public CCItemHelpContactUsViewHolderRefresh(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.row_ccitemhelp_contact_lbl;
        view.findViewById(n3).setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "view");
        i82_0 i82_02 = this.getMOnCCClickListener();
        if (i82_02 == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 == (n3 = R$id.row_ccitemhelp_contact_lbl)) {
            object = this.getMOnCCClickListener();
            Intrinsics.checkNotNull(object);
            n3 = 0;
            i82_02 = null;
            int n7 = 9;
            object.onViewItemClick(null, n7);
        }
    }

    public void setData(Object object, int n3) {
    }
}

