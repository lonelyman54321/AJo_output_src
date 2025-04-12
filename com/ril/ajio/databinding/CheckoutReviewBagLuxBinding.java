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

public final class CheckoutReviewBagLuxBinding
implements BC3 {
    public final AjioTextView checkoutBtnReviewBag;
    private final LinearLayout rootView;

    private CheckoutReviewBagLuxBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.checkoutBtnReviewBag = ajioTextView;
    }

    public static CheckoutReviewBagLuxBinding bind(View object) {
        int n3 = R$id.checkout_btn_review_bag;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            CheckoutReviewBagLuxBinding checkoutReviewBagLuxBinding = new CheckoutReviewBagLuxBinding((LinearLayout)object, ajioTextView);
            return checkoutReviewBagLuxBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CheckoutReviewBagLuxBinding inflate(LayoutInflater layoutInflater) {
        return CheckoutReviewBagLuxBinding.inflate(layoutInflater, null, false);
    }

    public static CheckoutReviewBagLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.checkout_review_bag_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CheckoutReviewBagLuxBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

