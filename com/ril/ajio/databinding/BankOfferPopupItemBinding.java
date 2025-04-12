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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class BankOfferPopupItemBinding
implements BC3 {
    public final ConstraintLayout couponItem;
    public final AjioTextView offerDesc;
    private final ConstraintLayout rootView;
    public final AjioTextView termsConditions;

    private BankOfferPopupItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.couponItem = constraintLayout2;
        this.offerDesc = ajioTextView;
        this.termsConditions = ajioTextView2;
    }

    public static BankOfferPopupItemBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.offer_desc;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.terms_conditions, object)) != null) {
            object = new BankOfferPopupItemBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), ajioTextView2, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static BankOfferPopupItemBinding inflate(LayoutInflater layoutInflater) {
        return BankOfferPopupItemBinding.inflate(layoutInflater, null, false);
    }

    public static BankOfferPopupItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.bank_offer_popup_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BankOfferPopupItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

