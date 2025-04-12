/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentShippingEddFailBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView shippingEddFailBtnGoBack;
    public final AjioTextView shippingEddFailBtnRetry;
    public final AjioTextView shippingEddFailTvMessage;

    private FragmentShippingEddFailBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.shippingEddFailBtnGoBack = ajioTextView;
        this.shippingEddFailBtnRetry = ajioTextView2;
        this.shippingEddFailTvMessage = ajioTextView3;
    }

    public static FragmentShippingEddFailBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.shipping_edd_fail_btn_goBack;
        AjioTextView ajioTextView3 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView3 != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.shipping_edd_fail_btn_retry, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.shipping_edd_fail_tv_message, object)) != null) {
            object = (LinearLayout)object;
            FragmentShippingEddFailBinding fragmentShippingEddFailBinding = new FragmentShippingEddFailBinding((LinearLayout)object, ajioTextView3, ajioTextView2, ajioTextView);
            return fragmentShippingEddFailBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentShippingEddFailBinding inflate(LayoutInflater layoutInflater) {
        return FragmentShippingEddFailBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentShippingEddFailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_shipping_edd_fail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentShippingEddFailBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

