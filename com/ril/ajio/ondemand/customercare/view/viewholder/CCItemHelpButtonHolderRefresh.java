/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import kotlin.jvm.internal.Intrinsics;

public final class CCItemHelpButtonHolderRefresh
extends uv_2
implements View.OnClickListener {
    private final AjioButton mButton;

    public CCItemHelpButtonHolderRefresh(View object, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object, i82_02);
        int n3 = R$id.row_ccitemhelp_header_btn;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AjioButton)object;
        this.mButton = object;
        object.setOnClickListener((View.OnClickListener)this);
    }

    public void onClick(View object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "v");
        i82_0 i82_02 = this.getMOnCCClickListener();
        if (i82_02 == null) {
            return;
        }
        int n4 = object.getId();
        if (n4 == (n3 = R$id.row_ccitemhelp_header_btn)) {
            object = ((Object)((Button)object).getText()).toString();
            i82_02 = this.getMOnCCClickListener();
            if (i82_02 != null) {
                int n7 = "RAISE COMPLAINT".equalsIgnoreCase((String)object);
                n3 = 0;
                i82_02.onViewItemClick(null, n7);
            }
        }
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            object = ((UiCCComponent)object).getName();
            AjioButton ajioButton = this.mButton;
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (bl2) {
                object = "";
            }
            ajioButton.setText((CharSequence)object);
        }
    }
}

