/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowPdpPriceDetailBinding
implements BC3 {
    public final TextView pdpPriceInfo;
    public final TextView pdpPriceNew;
    public final TextView pdpPriceOld;
    public final TextView pdpPriceTitle;
    private final ConstraintLayout rootView;

    private RowPdpPriceDetailBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.pdpPriceInfo = textView;
        this.pdpPriceNew = textView2;
        this.pdpPriceOld = textView3;
        this.pdpPriceTitle = textView4;
    }

    public static RowPdpPriceDetailBinding bind(View object) {
        View view;
        int n3 = R$id.pdp_price_info;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.pdp_price_new;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.pdp_price_old;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.pdp_price_title;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        RowPdpPriceDetailBinding rowPdpPriceDetailBinding = new RowPdpPriceDetailBinding((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return rowPdpPriceDetailBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowPdpPriceDetailBinding inflate(LayoutInflater layoutInflater) {
        return RowPdpPriceDetailBinding.inflate(layoutInflater, null, false);
    }

    public static RowPdpPriceDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pdp_price_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPdpPriceDetailBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

