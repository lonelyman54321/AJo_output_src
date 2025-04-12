/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.customview.PDPCustomDoDView;

public final class LuxeNewPdpFooterLayoutBinding
implements BC3 {
    public final ImageView addToCartImv;
    public final LinearLayout addToCartLayout;
    public final AjioTextView addToCartTv;
    public final ImageButton addToCloset;
    public final ImageButton addedToCloset;
    public final PDPCustomDoDView pdpDealLayout;
    public final ImageButton pdpShare;
    private final ConstraintLayout rootView;
    public final FrameLayout wishlistIconContainer;

    private LuxeNewPdpFooterLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, AjioTextView ajioTextView, ImageButton imageButton, ImageButton imageButton2, PDPCustomDoDView pDPCustomDoDView, ImageButton imageButton3, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.addToCartImv = imageView;
        this.addToCartLayout = linearLayout;
        this.addToCartTv = ajioTextView;
        this.addToCloset = imageButton;
        this.addedToCloset = imageButton2;
        this.pdpDealLayout = pDPCustomDoDView;
        this.pdpShare = imageButton3;
        this.wishlistIconContainer = frameLayout;
    }

    public static LuxeNewPdpFooterLayoutBinding bind(View object) {
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
                        n3 = R$id.added_to_closet;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ImageButton)view;
                        if (view5 != null) {
                            n3 = R$id.pdp_deal_layout;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (PDPCustomDoDView)view;
                            if (object3 != null) {
                                n3 = R$id.pdp_share;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (ImageButton)view;
                                if (view6 != null) {
                                    n3 = R$id.wishlistIconContainer;
                                    View view7 = view = dd2_2.a(n3, object);
                                    view7 = (FrameLayout)view;
                                    if (view7 != null) {
                                        Object object4 = object;
                                        object4 = (ConstraintLayout)((Object)object);
                                        LuxeNewPdpFooterLayoutBinding luxeNewPdpFooterLayoutBinding = new LuxeNewPdpFooterLayoutBinding((ConstraintLayout)((Object)object4), (ImageView)view2, (LinearLayout)view3, (AjioTextView)object2, (ImageButton)view4, (ImageButton)view5, (PDPCustomDoDView)((Object)object3), (ImageButton)view6, (FrameLayout)view7);
                                        return luxeNewPdpFooterLayoutBinding;
                                    }
                                }
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

    public static LuxeNewPdpFooterLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewPdpFooterLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewPdpFooterLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_pdp_footer_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewPdpFooterLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

