/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioOrderSummaryView;

public final class OrderConfirmSummaryViewBinding
implements BC3 {
    public final AjioOrderSummaryView orderconfirmBillview;
    private final LinearLayout rootView;

    private OrderConfirmSummaryViewBinding(LinearLayout linearLayout, AjioOrderSummaryView ajioOrderSummaryView) {
        this.rootView = linearLayout;
        this.orderconfirmBillview = ajioOrderSummaryView;
    }

    public static OrderConfirmSummaryViewBinding bind(View object) {
        int n3 = R$id.orderconfirm_billview;
        AjioOrderSummaryView ajioOrderSummaryView = (AjioOrderSummaryView)dd2_2.a(n3, object);
        if (ajioOrderSummaryView != null) {
            object = (LinearLayout)object;
            OrderConfirmSummaryViewBinding orderConfirmSummaryViewBinding = new OrderConfirmSummaryViewBinding((LinearLayout)object, ajioOrderSummaryView);
            return orderConfirmSummaryViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderConfirmSummaryViewBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfirmSummaryViewBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfirmSummaryViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_confirm_summary_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfirmSummaryViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

