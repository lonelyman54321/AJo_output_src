/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutReturnAtStoreInfoBinding
implements BC3 {
    private final LinearLayout rootView;
    public final ImageView rppIvRas;
    public final LinearLayout rppLayoutRas;
    public final AjioTextView rppTvRasInfo;

    private LayoutReturnAtStoreInfoBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.rppIvRas = imageView;
        this.rppLayoutRas = linearLayout2;
        this.rppTvRasInfo = ajioTextView;
    }

    public static LayoutReturnAtStoreInfoBinding bind(View object) {
        Object object2;
        int n3 = R$id.rpp_iv_ras;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object2 = object;
            object2 = (LinearLayout)object;
            int n4 = R$id.rpp_tv_ras_info;
            AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n4, object);
            if (ajioTextView != null) {
                object = new LayoutReturnAtStoreInfoBinding((LinearLayout)object2, imageView, (LinearLayout)object2, ajioTextView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutReturnAtStoreInfoBinding inflate(LayoutInflater layoutInflater) {
        return LayoutReturnAtStoreInfoBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutReturnAtStoreInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_return_at_store_info;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutReturnAtStoreInfoBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

