/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import kotlin.jvm.internal.Intrinsics;

public final class CCTitleViewHolderRefresh
extends uv_2 {
    private final TextView titleTv;

    public CCTitleViewHolderRefresh(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.row_cc_title_tv;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        view = (TextView)view;
        this.titleTv = view;
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            object = ((UiCCComponent)object).getName();
            TextView textView = this.titleTv;
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                object = "";
            }
            textView.setText((CharSequence)object);
        }
    }
}

