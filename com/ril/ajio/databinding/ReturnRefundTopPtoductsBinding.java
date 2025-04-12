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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundTopPtoductsBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final RecyclerView rowTopProducts;
    public final AjioTextView title;
    public final AjioTextView viewDetails;

    private ReturnRefundTopPtoductsBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.rowTopProducts = recyclerView;
        this.title = ajioTextView;
        this.viewDetails = ajioTextView2;
    }

    public static ReturnRefundTopPtoductsBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.row_top_products;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.title, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.view_details, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ReturnRefundTopPtoductsBinding returnRefundTopPtoductsBinding = new ReturnRefundTopPtoductsBinding((ConstraintLayout)((Object)object), recyclerView, ajioTextView2, ajioTextView);
            return returnRefundTopPtoductsBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReturnRefundTopPtoductsBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundTopPtoductsBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundTopPtoductsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_top_ptoducts;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundTopPtoductsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

