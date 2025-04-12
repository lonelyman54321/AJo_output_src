/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCartCouponNudgeLayoutBinding
implements BC3 {
    public final TextView couponNudgeDescTv;
    public final ImageView couponNudgeIv;
    public final TextView couponNudgeTitleTv;
    private final RelativeLayout rootView;

    private RowCartCouponNudgeLayoutBinding(RelativeLayout relativeLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.rootView = relativeLayout;
        this.couponNudgeDescTv = textView;
        this.couponNudgeIv = imageView;
        this.couponNudgeTitleTv = textView2;
    }

    public static RowCartCouponNudgeLayoutBinding bind(View object) {
        TextView textView;
        ImageView imageView;
        int n3 = R$id.couponNudgeDescTv;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.couponNudgeIv, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.couponNudgeTitleTv, object)) != null) {
            object = (RelativeLayout)object;
            RowCartCouponNudgeLayoutBinding rowCartCouponNudgeLayoutBinding = new RowCartCouponNudgeLayoutBinding((RelativeLayout)object, textView2, imageView, textView);
            return rowCartCouponNudgeLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCartCouponNudgeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RowCartCouponNudgeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartCouponNudgeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_coupon_nudge_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartCouponNudgeLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

