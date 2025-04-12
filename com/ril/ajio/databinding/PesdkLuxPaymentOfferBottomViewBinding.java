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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkLuxPaymentOfferBottomViewBinding
implements BC3 {
    public final ImageView offerClose;
    public final RecyclerView offerListView;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;

    private PesdkLuxPaymentOfferBottomViewBinding(LinearLayout linearLayout, ImageView imageView, RecyclerView recyclerView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.offerClose = imageView;
        this.offerListView = recyclerView;
        this.parentLayout = linearLayout2;
    }

    public static PesdkLuxPaymentOfferBottomViewBinding bind(View object) {
        LinearLayout linearLayout;
        RecyclerView recyclerView;
        int n3 = R$id.offer_close;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.offer_list_view, object)) != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.parent_layout, object)) != null) {
            object = (LinearLayout)object;
            PesdkLuxPaymentOfferBottomViewBinding pesdkLuxPaymentOfferBottomViewBinding = new PesdkLuxPaymentOfferBottomViewBinding((LinearLayout)object, imageView, recyclerView, linearLayout);
            return pesdkLuxPaymentOfferBottomViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxPaymentOfferBottomViewBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxPaymentOfferBottomViewBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxPaymentOfferBottomViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_payment_offer_bottom_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxPaymentOfferBottomViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

