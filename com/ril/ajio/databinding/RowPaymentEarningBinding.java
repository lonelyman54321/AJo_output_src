/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowPaymentEarningBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final RelativeLayout rowPaymentEarning;
    public final AjioTextView rowPaymentEarningLblMoreinfo;
    public final AjioTextView rowPaymentEarningTvInfo;

    private RowPaymentEarningBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = relativeLayout;
        this.rowPaymentEarning = relativeLayout2;
        this.rowPaymentEarningLblMoreinfo = ajioTextView;
        this.rowPaymentEarningTvInfo = ajioTextView2;
    }

    public static RowPaymentEarningBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (RelativeLayout)object;
        int n3 = R$id.row_payment_earning_lbl_moreinfo;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.row_payment_earning_tv_info, object)) != null) {
            object = new RowPaymentEarningBinding((RelativeLayout)object2, (RelativeLayout)object2, ajioTextView2, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowPaymentEarningBinding inflate(LayoutInflater layoutInflater) {
        return RowPaymentEarningBinding.inflate(layoutInflater, null, false);
    }

    public static RowPaymentEarningBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_payment_earning;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPaymentEarningBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

