/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpCarouselReferralWidgetBinding
implements BC3 {
    public final ShimmerFrameLayout referralRowShimmerView;
    private final FrameLayout rootView;
    public final AppCompatImageView rwDummyIv;
    public final TextView rwEarnInfo;
    public final TextView rwHeader;
    public final ConstraintLayout rwParent;
    public final AppCompatImageView rwWallet;

    private PdpCarouselReferralWidgetBinding(FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView2) {
        this.rootView = frameLayout;
        this.referralRowShimmerView = shimmerFrameLayout;
        this.rwDummyIv = appCompatImageView;
        this.rwEarnInfo = textView;
        this.rwHeader = textView2;
        this.rwParent = constraintLayout;
        this.rwWallet = appCompatImageView2;
    }

    public static PdpCarouselReferralWidgetBinding bind(View object) {
        View view;
        int n3 = R$id.referral_row_shimmer_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ShimmerFrameLayout)view;
        if (object2 != null) {
            n3 = R$id.rw_dummy_iv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppCompatImageView)view;
            if (object3 != null) {
                n3 = R$id.rw_earn_info;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.rw_header;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (TextView)view;
                    if (view3 != null) {
                        n3 = R$id.rw_parent;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (ConstraintLayout)view;
                        if (object4 != null) {
                            n3 = R$id.rw_wallet;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AppCompatImageView)view;
                            if (object5 != null) {
                                Object object6 = object;
                                object6 = (FrameLayout)object;
                                PdpCarouselReferralWidgetBinding pdpCarouselReferralWidgetBinding = new PdpCarouselReferralWidgetBinding((FrameLayout)object6, (ShimmerFrameLayout)((Object)object2), (AppCompatImageView)((Object)object3), (TextView)view2, (TextView)view3, (ConstraintLayout)((Object)object4), (AppCompatImageView)((Object)object5));
                                return pdpCarouselReferralWidgetBinding;
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

    public static PdpCarouselReferralWidgetBinding inflate(LayoutInflater layoutInflater) {
        return PdpCarouselReferralWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static PdpCarouselReferralWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_carousel_referral_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpCarouselReferralWidgetBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

