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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OfferBottomSheetBinding
implements BC3 {
    public final AjioTextView btnOk;
    public final ImageView imvClose;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;
    public final AjioTextView tvDiscount;
    public final AjioTextView tvFooter;
    public final AjioTextView tvOrderValue;
    public final AjioTextView tvPayableAmount;

    private OfferBottomSheetBinding(LinearLayout linearLayout, AjioTextView ajioTextView, ImageView imageView, LinearLayout linearLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = linearLayout;
        this.btnOk = ajioTextView;
        this.imvClose = imageView;
        this.parentLayout = linearLayout2;
        this.tvDiscount = ajioTextView2;
        this.tvFooter = ajioTextView3;
        this.tvOrderValue = ajioTextView4;
        this.tvPayableAmount = ajioTextView5;
    }

    public static OfferBottomSheetBinding bind(View object) {
        View view;
        int n3 = R$id.btnOk;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.imv_close;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                Object object3 = object;
                object3 = (LinearLayout)object;
                n3 = R$id.tv_discount;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.tv_footer;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.tv_order_value;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.tv_payable_amount;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                object = new OfferBottomSheetBinding((LinearLayout)object3, (AjioTextView)object2, (ImageView)view2, (LinearLayout)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7);
                                return object;
                            }
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

    public static OfferBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return OfferBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static OfferBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.offer_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OfferBottomSheetBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

