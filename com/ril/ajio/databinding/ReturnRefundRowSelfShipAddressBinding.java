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

public final class ReturnRefundRowSelfShipAddressBinding
implements BC3 {
    public final AjioTextView lblSelfShipAddress;
    private final ConstraintLayout rootView;
    public final AjioTextView tvPhoneNumber;
    public final AjioTextView tvShippingAddress;

    private ReturnRefundRowSelfShipAddressBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.lblSelfShipAddress = ajioTextView;
        this.tvPhoneNumber = ajioTextView2;
        this.tvShippingAddress = ajioTextView3;
    }

    public static ReturnRefundRowSelfShipAddressBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.lbl_self_ship_address;
        AjioTextView ajioTextView3 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView3 != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.tv_phone_number, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_shipping_address, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ReturnRefundRowSelfShipAddressBinding returnRefundRowSelfShipAddressBinding = new ReturnRefundRowSelfShipAddressBinding((ConstraintLayout)((Object)object), ajioTextView3, ajioTextView2, ajioTextView);
            return returnRefundRowSelfShipAddressBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ReturnRefundRowSelfShipAddressBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundRowSelfShipAddressBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundRowSelfShipAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_row_self_ship_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundRowSelfShipAddressBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

