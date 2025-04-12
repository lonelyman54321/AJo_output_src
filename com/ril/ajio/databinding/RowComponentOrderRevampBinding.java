/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowComponentOrderRevampBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout rowComponentOrder;
    public final FrameLayout rowComponentOrderClick;
    public final ImageView rowComponentOrderImvProduct;
    public final AjioTextView rowComponentOrderTvInfo;
    public final AjioTextView rowComponentOrderTvStatus;

    private RowComponentOrderRevampBinding(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.rowComponentOrder = linearLayout2;
        this.rowComponentOrderClick = frameLayout;
        this.rowComponentOrderImvProduct = imageView;
        this.rowComponentOrderTvInfo = ajioTextView;
        this.rowComponentOrderTvStatus = ajioTextView2;
    }

    public static RowComponentOrderRevampBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (LinearLayout)object;
        int n3 = R$id.row_component_order_click;
        View view3 = view = dd2_2.a(n3, object);
        view3 = (FrameLayout)view;
        if (view3 != null) {
            n3 = R$id.row_component_order_imv_product;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (ImageView)view;
            if (view4 != null) {
                n3 = R$id.row_component_order_tv_info;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.row_component_order_tv_status;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        Object object4 = object;
                        view = view2;
                        object = new RowComponentOrderRevampBinding((LinearLayout)view2, (LinearLayout)view2, (FrameLayout)view3, (ImageView)view4, (AjioTextView)object2, (AjioTextView)object3);
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

    public static RowComponentOrderRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowComponentOrderRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowComponentOrderRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_component_order_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowComponentOrderRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

