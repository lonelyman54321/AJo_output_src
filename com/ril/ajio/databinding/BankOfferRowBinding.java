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

public final class BankOfferRowBinding
implements BC3 {
    public final ImageView bankImg;
    public final AjioTextView descTv;
    public final AjioTextView offerDetailTv;
    private final ConstraintLayout rootView;

    private BankOfferRowBinding(ConstraintLayout constraintLayout, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.bankImg = imageView;
        this.descTv = ajioTextView;
        this.offerDetailTv = ajioTextView2;
    }

    public static BankOfferRowBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.bank_img;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.desc_tv, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.offer_detail_tv, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            BankOfferRowBinding bankOfferRowBinding = new BankOfferRowBinding((ConstraintLayout)((Object)object), imageView, ajioTextView2, ajioTextView);
            return bankOfferRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static BankOfferRowBinding inflate(LayoutInflater layoutInflater) {
        return BankOfferRowBinding.inflate(layoutInflater, null, false);
    }

    public static BankOfferRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.bank_offer_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BankOfferRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

