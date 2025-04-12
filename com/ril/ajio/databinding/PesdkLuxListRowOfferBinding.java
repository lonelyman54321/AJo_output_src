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

public final class PesdkLuxListRowOfferBinding
implements BC3 {
    public final ImageView imgOffer;
    public final AjioTextView offerTextSubvalue;
    private final LinearLayout rootView;
    public final AjioTextView tvOfferDesc;

    private PesdkLuxListRowOfferBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.imgOffer = imageView;
        this.offerTextSubvalue = ajioTextView;
        this.tvOfferDesc = ajioTextView2;
    }

    public static PesdkLuxListRowOfferBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.img_offer;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.offer_text_subvalue, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_offer_desc, object)) != null) {
            object = (LinearLayout)object;
            PesdkLuxListRowOfferBinding pesdkLuxListRowOfferBinding = new PesdkLuxListRowOfferBinding((LinearLayout)object, imageView, ajioTextView2, ajioTextView);
            return pesdkLuxListRowOfferBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxListRowOfferBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxListRowOfferBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxListRowOfferBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_list_row_offer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxListRowOfferBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

