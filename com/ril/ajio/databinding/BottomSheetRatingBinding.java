/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class BottomSheetRatingBinding
implements BC3 {
    public final LottieAnimationView ratingAnimView;
    public final ImageView ratingCancelIv;
    public final FrameLayout ratingCancelLayout;
    public final AjioTextView ratingHeaderTv;
    public final AjioTextView ratingLaterTv;
    public final AjioTextView ratingMsgTv;
    public final AjioTextView ratingRateUsTv;
    private final LinearLayout rootView;

    private BottomSheetRatingBinding(LinearLayout linearLayout, LottieAnimationView lottieAnimationView, ImageView imageView, FrameLayout frameLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = linearLayout;
        this.ratingAnimView = lottieAnimationView;
        this.ratingCancelIv = imageView;
        this.ratingCancelLayout = frameLayout;
        this.ratingHeaderTv = ajioTextView;
        this.ratingLaterTv = ajioTextView2;
        this.ratingMsgTv = ajioTextView3;
        this.ratingRateUsTv = ajioTextView4;
    }

    public static BottomSheetRatingBinding bind(View object) {
        View view;
        int n3 = R$id.rating_anim_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (LottieAnimationView)view;
        if (object2 != null) {
            n3 = R$id.rating_cancel_iv;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.rating_cancel_layout;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (FrameLayout)view;
                if (view3 != null) {
                    n3 = R$id.rating_header_tv;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.rating_later_tv;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.rating_msg_tv;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                n3 = R$id.rating_rate_us_tv;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (AjioTextView)view;
                                if (object6 != null) {
                                    Object object7 = object;
                                    object7 = (LinearLayout)object;
                                    BottomSheetRatingBinding bottomSheetRatingBinding = new BottomSheetRatingBinding((LinearLayout)object7, (LottieAnimationView)((Object)object2), (ImageView)view2, (FrameLayout)view3, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                                    return bottomSheetRatingBinding;
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

    public static BottomSheetRatingBinding inflate(LayoutInflater layoutInflater) {
        return BottomSheetRatingBinding.inflate(layoutInflater, null, false);
    }

    public static BottomSheetRatingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.bottom_sheet_rating;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BottomSheetRatingBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

