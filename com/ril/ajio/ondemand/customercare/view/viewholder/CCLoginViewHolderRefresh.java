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

public final class CCLoginViewHolderRefresh
extends uv_2
implements View.OnClickListener {
    public CCLoginViewHolderRefresh(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.row_cc_login_header_btn_login;
        view.findViewById(n3).setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View object) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.getId();
        int n4 = R$id.row_cc_login_header_btn_login;
        if (n3 == n4 && (object = this.getMOnCCClickListener()) != null) {
            n4 = 0;
            string2 = null;
            int n7 = 3;
            object.onViewItemClick(null, n7);
        }
    }

    public void setData(Object object, int n3) {
    }
}

