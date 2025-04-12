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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowAcTBinding
implements BC3 {
    public final TextView ntAmnt;
    public final TextView ntDateInfo;
    public final View ntDivider;
    public final TextView ntHeader;
    public final AppCompatImageView ntIV;
    public final TextView ntOrderId;
    public final TextView ntViewDetails;
    private final ConstraintLayout rootView;

    private RowAcTBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, View view, TextView textView3, AppCompatImageView appCompatImageView, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.ntAmnt = textView;
        this.ntDateInfo = textView2;
        this.ntDivider = view;
        this.ntHeader = textView3;
        this.ntIV = appCompatImageView;
        this.ntOrderId = textView4;
        this.ntViewDetails = textView5;
    }

    public static RowAcTBinding bind(View object) {
        View view;
        int n3 = R$id.nt_amnt;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            View view3;
            n3 = R$id.nt_date_info;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (TextView)view;
            if (view4 != null && (view3 = dd2_2.a(n3 = R$id.nt_divider, object)) != null) {
                n3 = R$id.nt_header;
                View view5 = view = dd2_2.a(n3, object);
                view5 = (TextView)view;
                if (view5 != null) {
                    n3 = R$id.nt_IV;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AppCompatImageView)view;
                    if (object2 != null) {
                        n3 = R$id.nt_order_id;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            n3 = R$id.nt_view_details;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                Object object3 = object;
                                object3 = (ConstraintLayout)((Object)object);
                                RowAcTBinding rowAcTBinding = new RowAcTBinding((ConstraintLayout)((Object)object3), (TextView)view2, (TextView)view4, view3, (TextView)view5, (AppCompatImageView)((Object)object2), (TextView)view6, (TextView)view7);
                                return rowAcTBinding;
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

    public static RowAcTBinding inflate(LayoutInflater layoutInflater) {
        return RowAcTBinding.inflate(layoutInflater, null, false);
    }

    public static RowAcTBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_ac_t;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowAcTBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

