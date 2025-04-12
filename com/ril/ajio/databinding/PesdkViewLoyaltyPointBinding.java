/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkViewLoyaltyPointBinding
implements BC3 {
    public final ImageView imvLoyalty;
    public final ImageView imvOffer;
    public final RelativeLayout layoutLoyalty;
    public final LinearLayout layoutOffer;
    public final LinearLayout loyaltyOfferLayout;
    private final LinearLayout rootView;
    public final AjioTextView tvLoyalty;
    public final AjioTextView tvOffer;

    private PesdkViewLoyaltyPointBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.imvLoyalty = imageView;
        this.imvOffer = imageView2;
        this.layoutLoyalty = relativeLayout;
        this.layoutOffer = linearLayout2;
        this.loyaltyOfferLayout = linearLayout3;
        this.tvLoyalty = ajioTextView;
        this.tvOffer = ajioTextView2;
    }

    public static PesdkViewLoyaltyPointBinding bind(View object) {
        View view;
        int n3 = R$id.imv_loyalty;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.imv_offer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.layout_loyalty;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (RelativeLayout)view;
                if (view4 != null) {
                    n3 = R$id.layout_offer;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (LinearLayout)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        n3 = R$id.tv_loyalty;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            n3 = R$id.tv_offer;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                object = new PesdkViewLoyaltyPointBinding((LinearLayout)object2, (ImageView)view2, (ImageView)view3, (RelativeLayout)view4, (LinearLayout)view5, (LinearLayout)object2, (AjioTextView)object3, (AjioTextView)object4);
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

    public static PesdkViewLoyaltyPointBinding inflate(LayoutInflater layoutInflater) {
        return PesdkViewLoyaltyPointBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkViewLoyaltyPointBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_view_loyalty_point;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkViewLoyaltyPointBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

