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

public final class RowShippingShimmerBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final View view10;
    public final View view11;
    public final View view12;
    public final View view13;
    public final View view9;

    private RowShippingShimmerBinding(RelativeLayout relativeLayout, View view, View view2, View view3, View view4, View view5) {
        this.rootView = relativeLayout;
        this.view10 = view;
        this.view11 = view2;
        this.view12 = view3;
        this.view13 = view4;
        this.view9 = view5;
    }

    public static RowShippingShimmerBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        int n3 = R$id.view10;
        View view5 = dd2_2.a(n3, object);
        if (view5 != null && (view4 = dd2_2.a(n3 = R$id.view11, object)) != null && (view3 = dd2_2.a(n3 = R$id.view12, object)) != null && (view2 = dd2_2.a(n3 = R$id.view13, object)) != null && (view = dd2_2.a(n3 = R$id.view9, object)) != null) {
            Object object2 = object;
            object2 = (RelativeLayout)object;
            RowShippingShimmerBinding rowShippingShimmerBinding = new RowShippingShimmerBinding((RelativeLayout)object2, view5, view4, view3, view2, view);
            return rowShippingShimmerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowShippingShimmerBinding inflate(LayoutInflater layoutInflater) {
        return RowShippingShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static RowShippingShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_shipping_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowShippingShimmerBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

