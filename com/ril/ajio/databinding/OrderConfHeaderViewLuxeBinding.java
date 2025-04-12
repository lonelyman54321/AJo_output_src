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
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class OrderConfHeaderViewLuxeBinding
implements BC3 {
    public final TextView ochvrTvOrderId;
    public final RelativeLayout orderConfHeaderLayout;
    public final LottieAnimationView orderHeaderImg;
    public final LinearLayout orderInfoLayout;
    private final RelativeLayout rootView;

    private OrderConfHeaderViewLuxeBinding(RelativeLayout relativeLayout, TextView textView, RelativeLayout relativeLayout2, LottieAnimationView lottieAnimationView, LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.ochvrTvOrderId = textView;
        this.orderConfHeaderLayout = relativeLayout2;
        this.orderHeaderImg = lottieAnimationView;
        this.orderInfoLayout = linearLayout;
    }

    public static OrderConfHeaderViewLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.ochvrTvOrderId;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.order_conf_header_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.order_header_img;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (LottieAnimationView)view;
                if (object2 != null) {
                    n3 = R$id.order_info_layout;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (LinearLayout)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (RelativeLayout)object;
                        OrderConfHeaderViewLuxeBinding orderConfHeaderViewLuxeBinding = new OrderConfHeaderViewLuxeBinding((RelativeLayout)object3, (TextView)view2, (RelativeLayout)view3, (LottieAnimationView)((Object)object2), (LinearLayout)view4);
                        return orderConfHeaderViewLuxeBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderConfHeaderViewLuxeBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfHeaderViewLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfHeaderViewLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_conf_header_view_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfHeaderViewLuxeBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

