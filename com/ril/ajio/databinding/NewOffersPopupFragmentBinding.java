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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewOffersPopupFragmentBinding
implements BC3 {
    public final AjioTextView bankOfferTitleTv;
    public final AjioAspectRatioImageView close;
    public final RecyclerView offersRv;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;

    private NewOffersPopupFragmentBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, RecyclerView recyclerView, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.bankOfferTitleTv = ajioTextView;
        this.close = ajioAspectRatioImageView;
        this.offersRv = recyclerView;
        this.parentLayout = constraintLayout2;
    }

    public static NewOffersPopupFragmentBinding bind(View object) {
        View view;
        int n3 = R$id.bank_offer_title_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.close;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioAspectRatioImageView)view;
            if (object3 != null) {
                n3 = R$id.offers_rv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    Object object5 = object;
                    object5 = (ConstraintLayout)((Object)object);
                    object = new NewOffersPopupFragmentBinding((ConstraintLayout)((Object)object5), (AjioTextView)object2, (AjioAspectRatioImageView)((Object)object3), (RecyclerView)object4, (ConstraintLayout)((Object)object5));
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewOffersPopupFragmentBinding inflate(LayoutInflater layoutInflater) {
        return NewOffersPopupFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static NewOffersPopupFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_offers_popup_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewOffersPopupFragmentBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

