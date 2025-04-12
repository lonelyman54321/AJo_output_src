/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutOrderDateChangeBinding
implements BC3 {
    public final ImageView filterIv;
    public final RelativeLayout lodcCvChangeOrderDateRange;
    public final TextView lodcTvChangeOrderDateRange;
    public final TextView lodcTvOrderDateRange;
    private final RelativeLayout rootView;

    private LayoutOrderDateChangeBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.filterIv = imageView;
        this.lodcCvChangeOrderDateRange = relativeLayout2;
        this.lodcTvChangeOrderDateRange = textView;
        this.lodcTvOrderDateRange = textView2;
    }

    public static LayoutOrderDateChangeBinding bind(View object) {
        View view;
        int n3 = R$id.filter_iv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.lodcCvChangeOrderDateRange;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.lodcTvChangeOrderDateRange;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.lodcTvOrderDateRange;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (RelativeLayout)object;
                        LayoutOrderDateChangeBinding layoutOrderDateChangeBinding = new LayoutOrderDateChangeBinding((RelativeLayout)object2, (ImageView)view2, (RelativeLayout)view3, (TextView)view4, (TextView)view5);
                        return layoutOrderDateChangeBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutOrderDateChangeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutOrderDateChangeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutOrderDateChangeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_order_date_change;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutOrderDateChangeBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

