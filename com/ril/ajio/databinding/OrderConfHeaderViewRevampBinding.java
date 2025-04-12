/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OrderConfHeaderViewRevampBinding
implements BC3 {
    public final ConstraintLayout earnedAmountLayout;
    public final AjioImageView ivYouEarned;
    public final TextView lblOrderConfirmed;
    public final TextView ochvrTvOrderId;
    public final RelativeLayout orderConfHeaderLayout;
    public final LottieAnimationView orderHeaderImg;
    public final LinearLayout orderInfoLayout;
    private final RelativeLayout rootView;
    public final AjioTextView tvYouEarnedAmount;

    private OrderConfHeaderViewRevampBinding(RelativeLayout relativeLayout, ConstraintLayout constraintLayout, AjioImageView ajioImageView, TextView textView, TextView textView2, RelativeLayout relativeLayout2, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.earnedAmountLayout = constraintLayout;
        this.ivYouEarned = ajioImageView;
        this.lblOrderConfirmed = textView;
        this.ochvrTvOrderId = textView2;
        this.orderConfHeaderLayout = relativeLayout2;
        this.orderHeaderImg = lottieAnimationView;
        this.orderInfoLayout = linearLayout;
        this.tvYouEarnedAmount = ajioTextView;
    }

    public static OrderConfHeaderViewRevampBinding bind(View object) {
        View view;
        int n3 = R$id.earned_amount_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.iv_you_earned;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioImageView)view;
            if (object3 != null) {
                n3 = R$id.lbl_order_confirmed;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.ochvrTvOrderId;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (TextView)view;
                    if (view3 != null) {
                        n3 = R$id.order_conf_header_layout;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (RelativeLayout)view;
                        if (view4 != null) {
                            n3 = R$id.order_header_img;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (LottieAnimationView)view;
                            if (object4 != null) {
                                n3 = R$id.order_info_layout;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (LinearLayout)view;
                                if (view5 != null) {
                                    n3 = R$id.tv_you_earned_amount;
                                    Object object5 = view = dd2_2.a(n3, object);
                                    object5 = (AjioTextView)view;
                                    if (object5 != null) {
                                        Object object6 = object;
                                        object6 = (RelativeLayout)object;
                                        OrderConfHeaderViewRevampBinding orderConfHeaderViewRevampBinding = new OrderConfHeaderViewRevampBinding((RelativeLayout)object6, (ConstraintLayout)((Object)object2), (AjioImageView)((Object)object3), (TextView)view2, (TextView)view3, (RelativeLayout)view4, (LottieAnimationView)((Object)object4), (LinearLayout)view5, (AjioTextView)object5);
                                        return orderConfHeaderViewRevampBinding;
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

    public static OrderConfHeaderViewRevampBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfHeaderViewRevampBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfHeaderViewRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_conf_header_view_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfHeaderViewRevampBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

