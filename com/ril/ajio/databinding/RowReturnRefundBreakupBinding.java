/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowReturnRefundBreakupBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final AjioTextView tvAmountRefund;
    public final AjioTextView tvProductName;

    private RowReturnRefundBreakupBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.tvAmountRefund = ajioTextView;
        this.tvProductName = ajioTextView2;
    }

    public static RowReturnRefundBreakupBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.tv_amount_refund;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_product_name, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            RowReturnRefundBreakupBinding rowReturnRefundBreakupBinding = new RowReturnRefundBreakupBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioTextView);
            return rowReturnRefundBreakupBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowReturnRefundBreakupBinding inflate(LayoutInflater layoutInflater) {
        return RowReturnRefundBreakupBinding.inflate(layoutInflater, null, false);
    }

    public static RowReturnRefundBreakupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_return_refund_breakup;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReturnRefundBreakupBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

