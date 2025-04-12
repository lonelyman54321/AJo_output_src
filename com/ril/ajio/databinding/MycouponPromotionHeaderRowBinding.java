/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class MycouponPromotionHeaderRowBinding
implements BC3 {
    public final AjioTextView mycouponsView;
    private final LinearLayout rootView;

    private MycouponPromotionHeaderRowBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.mycouponsView = ajioTextView;
    }

    public static MycouponPromotionHeaderRowBinding bind(View object) {
        int n3 = R$id.mycoupons_view;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            MycouponPromotionHeaderRowBinding mycouponPromotionHeaderRowBinding = new MycouponPromotionHeaderRowBinding((LinearLayout)object, ajioTextView);
            return mycouponPromotionHeaderRowBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static MycouponPromotionHeaderRowBinding inflate(LayoutInflater layoutInflater) {
        return MycouponPromotionHeaderRowBinding.inflate(layoutInflater, null, false);
    }

    public static MycouponPromotionHeaderRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.mycoupon_promotion_header_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return MycouponPromotionHeaderRowBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

