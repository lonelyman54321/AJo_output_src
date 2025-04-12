/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ReturnRefundViewProductCurrentOrderViewBinding
implements BC3 {
    public final LinearLayout mainLayout;
    public final TextView productCurrentOrder;
    public final RecyclerView returnProductList;
    private final LinearLayout rootView;

    private ReturnRefundViewProductCurrentOrderViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.mainLayout = linearLayout2;
        this.productCurrentOrder = textView;
        this.returnProductList = recyclerView;
    }

    public static ReturnRefundViewProductCurrentOrderViewBinding bind(View object) {
        RecyclerView recyclerView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.product_current_order;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.return_product_list, object)) != null) {
            object = new ReturnRefundViewProductCurrentOrderViewBinding((LinearLayout)object2, (LinearLayout)object2, textView, recyclerView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ReturnRefundViewProductCurrentOrderViewBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundViewProductCurrentOrderViewBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundViewProductCurrentOrderViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_view_product_current_order_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundViewProductCurrentOrderViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

