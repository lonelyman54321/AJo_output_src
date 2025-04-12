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
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class BankOfferMergeItemBinding
implements BC3 {
    public final AjioImageView couponImage;
    public final ConstraintLayout couponItem;
    public final AjioTextView offerDesc;
    private final ConstraintLayout rootView;
    public final AjioTextView termsConditions;
    public final AjioTextView totalCoupons;

    private BankOfferMergeItemBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.couponImage = ajioImageView;
        this.couponItem = constraintLayout2;
        this.offerDesc = ajioTextView;
        this.termsConditions = ajioTextView2;
        this.totalCoupons = ajioTextView3;
    }

    public static BankOfferMergeItemBinding bind(View object) {
        View view;
        int n3 = R$id.coupon_image;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
        if (object2 != null) {
            n3 = R$id.coupon_item;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ConstraintLayout)view;
            if (object3 != null) {
                n3 = R$id.offer_desc;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.terms_conditions;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.total_coupons;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            Object object7 = object;
                            object7 = (ConstraintLayout)((Object)object);
                            BankOfferMergeItemBinding bankOfferMergeItemBinding = new BankOfferMergeItemBinding((ConstraintLayout)((Object)object7), (AjioImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                            return bankOfferMergeItemBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static BankOfferMergeItemBinding inflate(LayoutInflater layoutInflater) {
        return BankOfferMergeItemBinding.inflate(layoutInflater, null, false);
    }

    public static BankOfferMergeItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.bank_offer_merge_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BankOfferMergeItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

