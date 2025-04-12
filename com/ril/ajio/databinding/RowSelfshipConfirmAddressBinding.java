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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowSelfshipConfirmAddressBinding
implements BC3 {
    public final ConstraintLayout clMode;
    public final LinearLayout exchangeConfirmLayoutAddressSelfship;
    public final AjioTextView exchangeConfirmTvInfo;
    public final AjioTextView lblMode;
    private final LinearLayout rootView;
    public final AjioTextView tvMode;
    public final AjioTextView tvTotalRefundAmount;

    private RowSelfshipConfirmAddressBinding(LinearLayout linearLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = linearLayout;
        this.clMode = constraintLayout;
        this.exchangeConfirmLayoutAddressSelfship = linearLayout2;
        this.exchangeConfirmTvInfo = ajioTextView;
        this.lblMode = ajioTextView2;
        this.tvMode = ajioTextView3;
        this.tvTotalRefundAmount = ajioTextView4;
    }

    public static RowSelfshipConfirmAddressBinding bind(View object) {
        View view;
        int n3 = R$id.cl_mode;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.exchange_confirm_layout_address_selfship;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.exchange_confirm_tv_info;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.lbl_mode;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.tv_mode;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.tv_total_refund_amount;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                Object object7 = object;
                                object7 = (LinearLayout)object;
                                RowSelfshipConfirmAddressBinding rowSelfshipConfirmAddressBinding = new RowSelfshipConfirmAddressBinding((LinearLayout)object7, (ConstraintLayout)((Object)object2), (LinearLayout)view2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                                return rowSelfshipConfirmAddressBinding;
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowSelfshipConfirmAddressBinding inflate(LayoutInflater layoutInflater) {
        return RowSelfshipConfirmAddressBinding.inflate(layoutInflater, null, false);
    }

    public static RowSelfshipConfirmAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_selfship_confirm_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSelfshipConfirmAddressBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

