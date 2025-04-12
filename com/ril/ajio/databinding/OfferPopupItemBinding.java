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

public final class OfferPopupItemBinding
implements BC3 {
    public final ConstraintLayout couponItem;
    public final AjioTextView offerCode;
    public final AjioTextView offerDesc;
    public final AjioTextView offerPrice;
    private final ConstraintLayout rootView;
    public final AjioTextView termsConditions;
    public final AjioTextView timerText;

    private OfferPopupItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = constraintLayout;
        this.couponItem = constraintLayout2;
        this.offerCode = ajioTextView;
        this.offerDesc = ajioTextView2;
        this.offerPrice = ajioTextView3;
        this.termsConditions = ajioTextView4;
        this.timerText = ajioTextView5;
    }

    public static OfferPopupItemBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.offer_code;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (AjioTextView)view;
        if (object3 != null) {
            n3 = R$id.offer_desc;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                n3 = R$id.offer_price;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    n3 = R$id.terms_conditions;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        n3 = R$id.timer_text;
                        Object object7 = view = dd2_2.a(n3, object);
                        object7 = (AjioTextView)view;
                        if (object7 != null) {
                            Object object8 = object;
                            view = object2;
                            object = new OfferPopupItemBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7);
                            return object;
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

    public static OfferPopupItemBinding inflate(LayoutInflater layoutInflater) {
        return OfferPopupItemBinding.inflate(layoutInflater, null, false);
    }

    public static OfferPopupItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.offer_popup_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OfferPopupItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

