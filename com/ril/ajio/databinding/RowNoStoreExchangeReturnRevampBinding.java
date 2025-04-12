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

public final class RowNoStoreExchangeReturnRevampBinding
implements BC3 {
    public final AjioTextView dnsTvFindstore;
    public final LinearLayout noStoreText;
    private final LinearLayout rootView;

    private RowNoStoreExchangeReturnRevampBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.dnsTvFindstore = ajioTextView;
        this.noStoreText = linearLayout2;
    }

    public static RowNoStoreExchangeReturnRevampBinding bind(View object) {
        LinearLayout linearLayout;
        int n3 = R$id.dns_tv_findstore;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.noStoreText, object)) != null) {
            object = (LinearLayout)object;
            RowNoStoreExchangeReturnRevampBinding rowNoStoreExchangeReturnRevampBinding = new RowNoStoreExchangeReturnRevampBinding((LinearLayout)object, ajioTextView, linearLayout);
            return rowNoStoreExchangeReturnRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowNoStoreExchangeReturnRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowNoStoreExchangeReturnRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowNoStoreExchangeReturnRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_no_store_exchange_return_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowNoStoreExchangeReturnRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

