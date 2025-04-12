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

public final class CheckoutReviewBagRevampBinding
implements BC3 {
    public final AjioTextView checkoutBtnReviewBag;
    private final LinearLayout rootView;

    private CheckoutReviewBagRevampBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.checkoutBtnReviewBag = ajioTextView;
    }

    public static CheckoutReviewBagRevampBinding bind(View object) {
        int n3 = R$id.checkout_btn_review_bag;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            CheckoutReviewBagRevampBinding checkoutReviewBagRevampBinding = new CheckoutReviewBagRevampBinding((LinearLayout)object, ajioTextView);
            return checkoutReviewBagRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CheckoutReviewBagRevampBinding inflate(LayoutInflater layoutInflater) {
        return CheckoutReviewBagRevampBinding.inflate(layoutInflater, null, false);
    }

    public static CheckoutReviewBagRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.checkout_review_bag_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CheckoutReviewBagRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

