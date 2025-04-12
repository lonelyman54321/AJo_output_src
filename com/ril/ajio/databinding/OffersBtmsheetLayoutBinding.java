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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class OffersBtmsheetLayoutBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final RecyclerView offerList;
    private final LinearLayout rootView;

    private OffersBtmsheetLayoutBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.offerList = recyclerView;
    }

    public static OffersBtmsheetLayoutBinding bind(View object) {
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        int n3 = R$id.cancelBtn;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.cancelContainer, object)) != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.offer_list, object)) != null) {
            object = (LinearLayout)object;
            OffersBtmsheetLayoutBinding offersBtmsheetLayoutBinding = new OffersBtmsheetLayoutBinding((LinearLayout)object, imageView, frameLayout, recyclerView);
            return offersBtmsheetLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OffersBtmsheetLayoutBinding inflate(LayoutInflater layoutInflater) {
        return OffersBtmsheetLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static OffersBtmsheetLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.offers_btmsheet_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OffersBtmsheetLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

