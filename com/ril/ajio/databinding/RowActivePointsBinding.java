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

public final class RowActivePointsBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final TextView rowApAmnt;
    public final TextView rowApDateInfo;
    public final TextView rowApDateInfo2;
    public final TextView rowApDesc;
    public final View rowApDivider;
    public final View rowApFadedLayer;
    public final TextView rowApHeader;
    public final ImageView rowApIV;

    private RowActivePointsBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, View view2, TextView textView5, ImageView imageView) {
        this.rootView = constraintLayout;
        this.rowApAmnt = textView;
        this.rowApDateInfo = textView2;
        this.rowApDateInfo2 = textView3;
        this.rowApDesc = textView4;
        this.rowApDivider = view;
        this.rowApFadedLayer = view2;
        this.rowApHeader = textView5;
        this.rowApIV = imageView;
    }

    public static RowActivePointsBinding bind(View object) {
        View view;
        int n3 = R$id.row_ap_amnt;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.row_ap_date_info;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.row_ap_date_info_2;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    View view5;
                    View view6;
                    n3 = R$id.row_ap_desc;
                    View view7 = view = dd2_2.a(n3, object);
                    view7 = (TextView)view;
                    if (view7 != null && (view6 = dd2_2.a(n3 = R$id.row_ap_divider, object)) != null && (view5 = dd2_2.a(n3 = R$id.row_ap_faded_layer, object)) != null) {
                        n3 = R$id.row_ap_header;
                        View view8 = view = dd2_2.a(n3, object);
                        view8 = (TextView)view;
                        if (view8 != null) {
                            n3 = R$id.row_ap_IV;
                            View view9 = view = dd2_2.a(n3, object);
                            view9 = (ImageView)view;
                            if (view9 != null) {
                                Object object2 = object;
                                object2 = (ConstraintLayout)((Object)object);
                                RowActivePointsBinding rowActivePointsBinding = new RowActivePointsBinding((ConstraintLayout)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view7, view6, view5, (TextView)view8, (ImageView)view9);
                                return rowActivePointsBinding;
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

    public static RowActivePointsBinding inflate(LayoutInflater layoutInflater) {
        return RowActivePointsBinding.inflate(layoutInflater, null, false);
    }

    public static RowActivePointsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_active_points;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowActivePointsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

