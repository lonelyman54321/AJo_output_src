/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutDeliveryAddressOrderDetailBinding
implements BC3 {
    public final ImageView imvPickfromstore;
    public final AjioTextView ldaodTvAddress;
    public final AjioTextView ldaodTvName;
    public final AjioTextView ldaodTvTitle;
    private final ConstraintLayout rootView;

    private LayoutDeliveryAddressOrderDetailBinding(ConstraintLayout constraintLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.imvPickfromstore = imageView;
        this.ldaodTvAddress = ajioTextView;
        this.ldaodTvName = ajioTextView2;
        this.ldaodTvTitle = ajioTextView3;
    }

    public static LayoutDeliveryAddressOrderDetailBinding bind(View object) {
        View view;
        int n3 = R$id.imv_pickfromstore;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.ldaod_tv_address;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.ldaod_tv_name;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.ldaod_tv_title;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        LayoutDeliveryAddressOrderDetailBinding layoutDeliveryAddressOrderDetailBinding = new LayoutDeliveryAddressOrderDetailBinding((ConstraintLayout)((Object)object5), (ImageView)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4);
                        return layoutDeliveryAddressOrderDetailBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutDeliveryAddressOrderDetailBinding inflate(LayoutInflater layoutInflater) {
        return LayoutDeliveryAddressOrderDetailBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutDeliveryAddressOrderDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_delivery_address_order_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutDeliveryAddressOrderDetailBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

