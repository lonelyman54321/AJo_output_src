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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReturnRefundRowOdAddressBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView rowOdLblStore;
    public final AjioTextView rowOdTvAddress;
    public final AjioTextView rowOdTvDelivertype;
    public final AjioTextView rowOdTvDeliveryInfo;
    public final AjioTextView rowOdTvName;
    public final AjioTextView rowOdTvPhone;

    private ReturnRefundRowOdAddressBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6) {
        this.rootView = linearLayout;
        this.rowOdLblStore = ajioTextView;
        this.rowOdTvAddress = ajioTextView2;
        this.rowOdTvDelivertype = ajioTextView3;
        this.rowOdTvDeliveryInfo = ajioTextView4;
        this.rowOdTvName = ajioTextView5;
        this.rowOdTvPhone = ajioTextView6;
    }

    public static ReturnRefundRowOdAddressBinding bind(View object) {
        View view;
        int n3 = R$id.row_od_lbl_store;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.row_od_tv_address;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.row_od_tv_delivertype;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.row_od_tv_deliveryInfo;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.row_od_tv_name;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.row_od_tv_phone;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                Object object8 = object;
                                object8 = (LinearLayout)object;
                                ReturnRefundRowOdAddressBinding returnRefundRowOdAddressBinding = new ReturnRefundRowOdAddressBinding((LinearLayout)object8, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7);
                                return returnRefundRowOdAddressBinding;
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

    public static ReturnRefundRowOdAddressBinding inflate(LayoutInflater layoutInflater) {
        return ReturnRefundRowOdAddressBinding.inflate(layoutInflater, null, false);
    }

    public static ReturnRefundRowOdAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.return_refund_row_od_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReturnRefundRowOdAddressBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

