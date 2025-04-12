/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PdpBankOffersPopupLayoutBinding
implements BC3 {
    public final AjioTextView bankOfferTitleTv;
    public final RecyclerView bankOffersRv;
    public final AjioAspectRatioImageView close;
    public final AjioImageView discImg;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;

    private PdpBankOffersPopupLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, RecyclerView recyclerView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioImageView ajioImageView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.bankOfferTitleTv = ajioTextView;
        this.bankOffersRv = recyclerView;
        this.close = ajioAspectRatioImageView;
        this.discImg = ajioImageView;
        this.parentLayout = constraintLayout2;
    }

    public static PdpBankOffersPopupLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.bank_offer_title_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.bank_offers_rv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null) {
                n3 = R$id.close;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioAspectRatioImageView)view;
                if (object4 != null) {
                    n3 = R$id.disc_img;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioImageView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (ConstraintLayout)((Object)object);
                        object = new PdpBankOffersPopupLayoutBinding((ConstraintLayout)((Object)object6), (AjioTextView)object2, (RecyclerView)object3, (AjioAspectRatioImageView)((Object)object4), (AjioImageView)((Object)object5), (ConstraintLayout)((Object)object6));
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpBankOffersPopupLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpBankOffersPopupLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpBankOffersPopupLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_bank_offers_popup_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpBankOffersPopupLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

