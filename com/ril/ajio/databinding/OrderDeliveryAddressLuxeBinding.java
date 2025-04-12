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

public final class OrderDeliveryAddressLuxeBinding
implements BC3 {
    public final ImageView odarIvImage;
    public final TextView odarTvDeliverInfo;
    public final TextView odarTvDeliverTo;
    public final TextView odarTvViewAddress;
    private final ConstraintLayout rootView;

    private OrderDeliveryAddressLuxeBinding(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.odarIvImage = imageView;
        this.odarTvDeliverInfo = textView;
        this.odarTvDeliverTo = textView2;
        this.odarTvViewAddress = textView3;
    }

    public static OrderDeliveryAddressLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.odarIvImage;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.odarTvDeliverInfo;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.odarTvDeliverTo;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.odarTvViewAddress;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        OrderDeliveryAddressLuxeBinding orderDeliveryAddressLuxeBinding = new OrderDeliveryAddressLuxeBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return orderDeliveryAddressLuxeBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderDeliveryAddressLuxeBinding inflate(LayoutInflater layoutInflater) {
        return OrderDeliveryAddressLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static OrderDeliveryAddressLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_delivery_address_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderDeliveryAddressLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

