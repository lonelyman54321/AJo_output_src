/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout$LayoutParams
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.ondemand.customercare.view.common.UiCCComponent;
import kotlin.jvm.internal.Intrinsics;

public final class DividerViewHolder
extends uv_2 {
    private final View divider;

    public DividerViewHolder(View view, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view, i82_02);
        int n3 = R$id.row_cc_divider;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, "findViewById(...)");
        this.divider = view;
    }

    private final void setDividerHeight(View view, UiCCComponent uiCCComponent) {
        int n3;
        int n4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        layoutParams = (FrameLayout.LayoutParams)layoutParams;
        layoutParams.height = n4 = mz3_0.d(uiCCComponent.getHeight());
        layoutParams.leftMargin = n4 = mz3_0.d(uiCCComponent.getLeftMargin());
        layoutParams.rightMargin = n3 = mz3_0.d(uiCCComponent.getRightMargin());
        view.setLayoutParams(layoutParams);
        view.invalidate();
    }

    public void setData(Object object, int n3) {
        n3 = object instanceof UiCCComponent;
        if (n3 != 0) {
            object = (UiCCComponent)object;
            View view = this.divider;
            this.setDividerHeight(view, (UiCCComponent)object);
        }
    }
}

