/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.customview.PDPCustomDoDView;

public final class NewPdpFooterLayoutMiniBinding
implements BC3 {
    public final ImageView addToCartImv;
    public final LinearLayout addToCartLayout;
    public final AjioTextView addToCartTv;
    public final ImageButton addToCloset;
    public final PDPCustomDoDView pdpDealLayout;
    public final ImageButton pdpShare;
    private final ConstraintLayout rootView;
    public final View spacePDPDummy;

    private NewPdpFooterLayoutMiniBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, AjioTextView ajioTextView, ImageButton imageButton, PDPCustomDoDView pDPCustomDoDView, ImageButton imageButton2, View view) {
        this.rootView = constraintLayout;
        this.addToCartImv = imageView;
        this.addToCartLayout = linearLayout;
        this.addToCartTv = ajioTextView;
        this.addToCloset = imageButton;
        this.pdpDealLayout = pDPCustomDoDView;
        this.pdpShare = imageButton2;
        this.spacePDPDummy = view;
    }

    public static NewPdpFooterLayoutMiniBinding bind(View object) {
        View view;
        int n3 = R$id.add_to_cart_imv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.add_to_cart_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.add_to_cart_tv;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.add_to_closet;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (ImageButton)view;
                    if (view4 != null) {
                        n3 = R$id.pdp_deal_layout;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (PDPCustomDoDView)view;
                        if (object3 != null) {
                            View view5;
                            n3 = R$id.pdp_share;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (ImageButton)view;
                            if (view6 != null && (view5 = dd2_2.a(n3 = R$id.spacePDPDummy, object)) != null) {
                                Object object4 = object;
                                object4 = (ConstraintLayout)((Object)object);
                                NewPdpFooterLayoutMiniBinding newPdpFooterLayoutMiniBinding = new NewPdpFooterLayoutMiniBinding((ConstraintLayout)((Object)object4), (ImageView)view2, (LinearLayout)view3, (AjioTextView)object2, (ImageButton)view4, (PDPCustomDoDView)((Object)object3), (ImageButton)view6, view5);
                                return newPdpFooterLayoutMiniBinding;
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

    public static NewPdpFooterLayoutMiniBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpFooterLayoutMiniBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpFooterLayoutMiniBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_footer_layout_mini;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpFooterLayoutMiniBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

