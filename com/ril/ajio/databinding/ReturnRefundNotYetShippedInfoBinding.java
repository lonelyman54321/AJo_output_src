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

public final class ReturnRefundNotYetShippedInfoBinding
implements BC3 {
    public final AjioTextView lblNotShippedYet;
    public final AjioTextView lblShippingAddress;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final AjioTextView tvPhoneNumber;
    public final AjioTextView tvShippingAddress;

    private ReturnRefundNotYetShippedInfoBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RecyclerView recyclerView, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = constraintLayout;
        this.lblNotShippedYet = ajioTextView;
        this.lblShippingAddress = ajioTextView2;
        this.recyclerView = recyclerView;
        this.tvPhoneNumber = ajioTextView3;
        this.tvShippingAddress = ajioTextView4;
    }

    public static ReturnRefundNotYetShippedInfoBinding bind(View object) {
        View view;
        int n3 = R$id.lbl_not_shipped_yet;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.lbl_shipping_address;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.recycler_view;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.tv_phone_number;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.tv_shipping_address;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            Object object7 = object;
                            object7 = (ConstraintLayout)((Object)object);
                            ReturnRefundNotYetShippedInfoBinding returnRefundNotYetShippedInfoBinding = new ReturnRefundNotYetShippedInfoBinding((ConstraintLayout)((Object)object7), (AjioTextView)object2, (AjioTextView)object3, (RecyclerView)object4, (AjioTextView)object5, (AjioTextView)object6);
                            return returnRefundNotYetShippedInfoBinding;
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

    public static ReturnRefundNotYetShippedInfoBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundNotYetShippedInfoBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundNotYetShippedInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_not_yet_shipped_info;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundNotYetShippedInfoBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

