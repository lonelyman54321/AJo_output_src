/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpProductRowOddBinding
implements BC3 {
    public final TextView descTv;
    public final LinearLayout llMainView;
    public final LinearLayout llOdd;
    public final RelativeLayout noProductAvailableRl;
    private final LinearLayout rootView;
    public final TextView titleTv;

    private PlpProductRowOddBinding(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout, TextView textView2) {
        this.rootView = linearLayout;
        this.descTv = textView;
        this.llMainView = linearLayout2;
        this.llOdd = linearLayout3;
        this.noProductAvailableRl = relativeLayout;
        this.titleTv = textView2;
    }

    public static PlpProductRowOddBinding bind(View object) {
        View view;
        int n3 = R$id.desc_tv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.ll_main_view;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                Object object2 = object;
                object2 = (LinearLayout)object;
                n3 = R$id.no_product_available_rl;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (RelativeLayout)view;
                if (view4 != null) {
                    n3 = R$id.title_tv;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        object = new PlpProductRowOddBinding((LinearLayout)object2, (TextView)view2, (LinearLayout)view3, (LinearLayout)object2, (RelativeLayout)view4, (TextView)view5);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpProductRowOddBinding inflate(LayoutInflater layoutInflater) {
        return PlpProductRowOddBinding.inflate(layoutInflater, null, false);
    }

    public static PlpProductRowOddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_product_row_odd;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpProductRowOddBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

