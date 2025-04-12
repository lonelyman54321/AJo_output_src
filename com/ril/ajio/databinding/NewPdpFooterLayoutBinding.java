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
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.customview.PDPCustomDoDView;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;

public final class NewPdpFooterLayoutBinding
implements BC3 {
    public final ImageView addToCartImv;
    public final LinearLayout addToCartLayout;
    public final AjioTextView addToCartTv;
    public final ImageButton addToCloset;
    public final ImageButton addedToCloset;
    public final View footerButtonDivider;
    public final InAppBottomUpdatesView inappUpdateWidget;
    public final PDPCustomDoDView pdpDealLayout;
    public final ImageButton pdpShare;
    public final LottieAnimationView pdpShareFleek;
    private final ConstraintLayout rootView;
    public final RelativeLayout shareLayout;
    public final FrameLayout wishlistIconContainer;

    private NewPdpFooterLayoutBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, AjioTextView ajioTextView, ImageButton imageButton, ImageButton imageButton2, View view, InAppBottomUpdatesView inAppBottomUpdatesView, PDPCustomDoDView pDPCustomDoDView, ImageButton imageButton3, LottieAnimationView lottieAnimationView, RelativeLayout relativeLayout, FrameLayout frameLayout) {
        this.rootView = constraintLayout;
        this.addToCartImv = imageView;
        this.addToCartLayout = linearLayout;
        this.addToCartTv = ajioTextView;
        this.addToCloset = imageButton;
        this.addedToCloset = imageButton2;
        this.footerButtonDivider = view;
        this.inappUpdateWidget = inAppBottomUpdatesView;
        this.pdpDealLayout = pDPCustomDoDView;
        this.pdpShare = imageButton3;
        this.pdpShareFleek = lottieAnimationView;
        this.shareLayout = relativeLayout;
        this.wishlistIconContainer = frameLayout;
    }

    public static NewPdpFooterLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.add_to_cart_imv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.add_to_cart_layout;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n3 = R$id.add_to_cart_tv;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (AjioTextView)view2;
                if (object2 != null) {
                    n3 = R$id.add_to_closet;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (ImageButton)view2;
                    if (view5 != null) {
                        View view6;
                        n3 = R$id.added_to_closet;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (ImageButton)view2;
                        if (view7 != null && (view6 = dd2_2.a(n3 = R$id.footer_button_divider, view)) != null) {
                            n3 = R$id.inapp_update_widget;
                            Object object3 = view2 = dd2_2.a(n3, view);
                            object3 = (InAppBottomUpdatesView)view2;
                            if (object3 != null) {
                                n3 = R$id.pdp_deal_layout;
                                Object object4 = view2 = dd2_2.a(n3, view);
                                object4 = (PDPCustomDoDView)view2;
                                if (object4 != null) {
                                    n3 = R$id.pdp_share;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (ImageButton)view2;
                                    if (view8 != null) {
                                        n3 = R$id.pdp_share_fleek;
                                        Object object5 = view2 = dd2_2.a(n3, view);
                                        object5 = (LottieAnimationView)view2;
                                        if (object5 != null) {
                                            n3 = R$id.shareLayout;
                                            View view9 = view2 = dd2_2.a(n3, view);
                                            view9 = (RelativeLayout)view2;
                                            if (view9 != null) {
                                                n3 = R$id.wishlistIconContainer;
                                                View view10 = view2 = dd2_2.a(n3, view);
                                                view10 = (FrameLayout)view2;
                                                if (view10 != null) {
                                                    Object object6 = view;
                                                    object6 = (ConstraintLayout)view;
                                                    NewPdpFooterLayoutBinding newPdpFooterLayoutBinding = new NewPdpFooterLayoutBinding((ConstraintLayout)((Object)object6), (ImageView)view3, (LinearLayout)view4, (AjioTextView)object2, (ImageButton)view5, (ImageButton)view7, view6, (InAppBottomUpdatesView)((Object)object3), (PDPCustomDoDView)((Object)object4), (ImageButton)view8, (LottieAnimationView)((Object)object5), (RelativeLayout)view9, (FrameLayout)view10);
                                                    return newPdpFooterLayoutBinding;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewPdpFooterLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpFooterLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpFooterLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_footer_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpFooterLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

