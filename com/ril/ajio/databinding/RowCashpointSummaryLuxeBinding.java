/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCashpointSummaryLuxeBinding
implements BC3 {
    public final TextView ajioWalletInfoTv;
    public final TextView ajioWalletTv;
    public final TextView knowMore;
    private final LinearLayout rootView;
    public final View savingDivider;
    public final ImageView walletImage;

    private RowCashpointSummaryLuxeBinding(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, View view, ImageView imageView) {
        this.rootView = linearLayout;
        this.ajioWalletInfoTv = textView;
        this.ajioWalletTv = textView2;
        this.knowMore = textView3;
        this.savingDivider = view;
        this.walletImage = imageView;
    }

    public static RowCashpointSummaryLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.ajioWalletInfoTv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.ajioWalletTv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                View view4;
                n3 = R$id.knowMore;
                View view5 = view = dd2_2.a(n3, object);
                view5 = (TextView)view;
                if (view5 != null && (view4 = dd2_2.a(n3 = R$id.savingDivider, object)) != null) {
                    n3 = R$id.walletImage;
                    View view6 = view = dd2_2.a(n3, object);
                    view6 = (ImageView)view;
                    if (view6 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        RowCashpointSummaryLuxeBinding rowCashpointSummaryLuxeBinding = new RowCashpointSummaryLuxeBinding((LinearLayout)object2, (TextView)view2, (TextView)view3, (TextView)view5, view4, (ImageView)view6);
                        return rowCashpointSummaryLuxeBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCashpointSummaryLuxeBinding inflate(LayoutInflater layoutInflater) {
        return RowCashpointSummaryLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static RowCashpointSummaryLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cashpoint_summary_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCashpointSummaryLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

