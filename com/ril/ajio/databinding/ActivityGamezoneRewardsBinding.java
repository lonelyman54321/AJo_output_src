/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ActivityGamezoneRewardsBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final ImageView rewardImvBanner;
    public final ImageView rewardImvClose;
    public final ImageView rewardImvRewardType;
    public final AjioTextView rewardLblCoupon;
    public final AjioTextView rewardLblTerms;
    public final AjioTextView rewardLblViewProducts;
    public final AjioTextView rewardTvCopyCoupon;
    public final AjioTextView rewardTvCouponCode;
    public final AjioTextView rewardTvExpiry;
    public final AjioTextView rewardTvInfo;
    public final AjioTextView rewardTvLabel;
    public final AjioTextView rewardTvReceived;
    public final AjioTextView rewardTvSubLabel;
    private final FrameLayout rootView;

    private ActivityGamezoneRewardsBinding(FrameLayout frameLayout, AjioLoaderView ajioLoaderView, ImageView imageView, ImageView imageView2, ImageView imageView3, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10) {
        this.rootView = frameLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.rewardImvBanner = imageView;
        this.rewardImvClose = imageView2;
        this.rewardImvRewardType = imageView3;
        this.rewardLblCoupon = ajioTextView;
        this.rewardLblTerms = ajioTextView2;
        this.rewardLblViewProducts = ajioTextView3;
        this.rewardTvCopyCoupon = ajioTextView4;
        this.rewardTvCouponCode = ajioTextView5;
        this.rewardTvExpiry = ajioTextView6;
        this.rewardTvInfo = ajioTextView7;
        this.rewardTvLabel = ajioTextView8;
        this.rewardTvReceived = ajioTextView9;
        this.rewardTvSubLabel = ajioTextView10;
    }

    public static ActivityGamezoneRewardsBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioLoaderView)view2;
        if (object2 != null) {
            n3 = R$id.reward_imv_banner;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.reward_imv_close;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (ImageView)view2;
                if (view4 != null) {
                    n3 = R$id.reward_imv_rewardType;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (ImageView)view2;
                    if (view5 != null) {
                        n3 = R$id.reward_lbl_coupon;
                        Object object3 = view2 = dd2_2.a(n3, view);
                        object3 = (AjioTextView)view2;
                        if (object3 != null) {
                            n3 = R$id.reward_lbl_terms;
                            Object object4 = view2 = dd2_2.a(n3, view);
                            object4 = (AjioTextView)view2;
                            if (object4 != null) {
                                n3 = R$id.reward_lbl_view_products;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AjioTextView)view2;
                                if (object5 != null) {
                                    n3 = R$id.reward_tv_copy_coupon;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (AjioTextView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.reward_tv_coupon_code;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (AjioTextView)view2;
                                        if (object7 != null) {
                                            n3 = R$id.reward_tv_expiry;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (AjioTextView)view2;
                                            if (object8 != null) {
                                                n3 = R$id.reward_tv_info;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.reward_tv_label;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.reward_tv_received;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (AjioTextView)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.reward_tv_sub_label;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                View view6 = view;
                                                                view6 = (FrameLayout)view;
                                                                ActivityGamezoneRewardsBinding activityGamezoneRewardsBinding = new ActivityGamezoneRewardsBinding((FrameLayout)view6, (AjioLoaderView)((Object)object2), (ImageView)view3, (ImageView)view4, (ImageView)view5, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12);
                                                                return activityGamezoneRewardsBinding;
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
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityGamezoneRewardsBinding inflate(LayoutInflater layoutInflater) {
        return ActivityGamezoneRewardsBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityGamezoneRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_gamezone_rewards;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityGamezoneRewardsBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

