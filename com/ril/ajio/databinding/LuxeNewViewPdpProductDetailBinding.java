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

public final class LuxeNewViewPdpProductDetailBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView viewPdpProductDetailTvName;
    public final AjioTextView viewPdpProductDetailTvValue;

    private LuxeNewViewPdpProductDetailBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.viewPdpProductDetailTvName = ajioTextView;
        this.viewPdpProductDetailTvValue = ajioTextView2;
    }

    public static LuxeNewViewPdpProductDetailBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.view_pdp_product_detail_tv_name;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.view_pdp_product_detail_tv_value, object)) != null) {
            object = (LinearLayout)object;
            LuxeNewViewPdpProductDetailBinding luxeNewViewPdpProductDetailBinding = new LuxeNewViewPdpProductDetailBinding((LinearLayout)object, ajioTextView2, ajioTextView);
            return luxeNewViewPdpProductDetailBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeNewViewPdpProductDetailBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewViewPdpProductDetailBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewViewPdpProductDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_view_pdp_product_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewViewPdpProductDetailBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

