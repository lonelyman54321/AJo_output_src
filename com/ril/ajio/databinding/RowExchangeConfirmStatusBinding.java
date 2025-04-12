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

public final class RowExchangeConfirmStatusBinding
implements BC3 {
    public final AjioTextView exchangeConfirmTvName;
    public final AjioTextView exchangeConfirmTvValue;
    private final LinearLayout rootView;

    private RowExchangeConfirmStatusBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.exchangeConfirmTvName = ajioTextView;
        this.exchangeConfirmTvValue = ajioTextView2;
    }

    public static RowExchangeConfirmStatusBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.exchange_confirm_tv_name;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.exchange_confirm_tv_value, object)) != null) {
            object = (LinearLayout)object;
            RowExchangeConfirmStatusBinding rowExchangeConfirmStatusBinding = new RowExchangeConfirmStatusBinding((LinearLayout)object, ajioTextView2, ajioTextView);
            return rowExchangeConfirmStatusBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowExchangeConfirmStatusBinding inflate(LayoutInflater layoutInflater) {
        return RowExchangeConfirmStatusBinding.inflate(layoutInflater, null, false);
    }

    public static RowExchangeConfirmStatusBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_exchange_confirm_status;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowExchangeConfirmStatusBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

