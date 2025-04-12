/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowAcNtBinding
implements BC3 {
    public final TextView ntAmnt;
    public final TextView ntDateInfo1;
    public final TextView ntDateInfo2;
    public final View ntDivider;
    public final View ntFadedLayer;
    public final TextView ntHeader;
    public final ImageView ntIV;
    public final TextView ntOrderId;
    public final TextView ntReferralTv;
    private final ConstraintLayout rootView;

    private RowAcNtBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, View view, View view2, TextView textView4, ImageView imageView, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.ntAmnt = textView;
        this.ntDateInfo1 = textView2;
        this.ntDateInfo2 = textView3;
        this.ntDivider = view;
        this.ntFadedLayer = view2;
        this.ntHeader = textView4;
        this.ntIV = imageView;
        this.ntOrderId = textView5;
        this.ntReferralTv = textView6;
    }

    public static RowAcNtBinding bind(View object) {
        View view;
        int n3 = R$id.nt_amnt;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.nt_date_info_1;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                View view4;
                View view5;
                n3 = R$id.nt_date_info_2;
                View view6 = view = dd2_2.a(n3, object);
                view6 = (TextView)view;
                if (view6 != null && (view5 = dd2_2.a(n3 = R$id.nt_divider, object)) != null && (view4 = dd2_2.a(n3 = R$id.nt_faded_layer, object)) != null) {
                    n3 = R$id.nt_header;
                    View view7 = view = dd2_2.a(n3, object);
                    view7 = (TextView)view;
                    if (view7 != null) {
                        n3 = R$id.nt_IV;
                        View view8 = view = dd2_2.a(n3, object);
                        view8 = (ImageView)view;
                        if (view8 != null) {
                            n3 = R$id.nt_order_id;
                            View view9 = view = dd2_2.a(n3, object);
                            view9 = (TextView)view;
                            if (view9 != null) {
                                n3 = R$id.nt_referral_tv;
                                View view10 = view = dd2_2.a(n3, object);
                                view10 = (TextView)view;
                                if (view10 != null) {
                                    Object object2 = object;
                                    object2 = (ConstraintLayout)((Object)object);
                                    RowAcNtBinding rowAcNtBinding = new RowAcNtBinding((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view6, view5, view4, (TextView)view7, (ImageView)view8, (TextView)view9, (TextView)view10);
                                    return rowAcNtBinding;
                                }
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

    public static RowAcNtBinding inflate(LayoutInflater layoutInflater) {
        return RowAcNtBinding.inflate(layoutInflater, null, false);
    }

    public static RowAcNtBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_ac_nt;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAcNtBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

