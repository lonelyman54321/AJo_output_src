/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CouponItemImageLayoutRefreshBinding
implements BC3 {
    public final ImageView couponImgView;
    private final CardView rootView;

    private CouponItemImageLayoutRefreshBinding(CardView cardView, ImageView imageView) {
        this.rootView = cardView;
        this.couponImgView = imageView;
    }

    public static CouponItemImageLayoutRefreshBinding bind(View object) {
        int n3 = R$id.coupon_img_view;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (CardView)((Object)object);
            CouponItemImageLayoutRefreshBinding couponItemImageLayoutRefreshBinding = new CouponItemImageLayoutRefreshBinding((CardView)((Object)object), imageView);
            return couponItemImageLayoutRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponItemImageLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CouponItemImageLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CouponItemImageLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.coupon_item_image_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponItemImageLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

