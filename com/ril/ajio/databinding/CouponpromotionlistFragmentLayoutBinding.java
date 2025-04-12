/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;

public final class CouponpromotionlistFragmentLayoutBinding
implements BC3 {
    public final AjioProgressView couponsPromotionProgressBar;
    public final RelativeLayout exchangeScroll;
    public final LinearLayout footer;
    public final RecyclerView parentRecycleview;
    private final RelativeLayout rootView;

    private CouponpromotionlistFragmentLayoutBinding(RelativeLayout relativeLayout, AjioProgressView ajioProgressView, RelativeLayout relativeLayout2, LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = relativeLayout;
        this.couponsPromotionProgressBar = ajioProgressView;
        this.exchangeScroll = relativeLayout2;
        this.footer = linearLayout;
        this.parentRecycleview = recyclerView;
    }

    public static CouponpromotionlistFragmentLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.coupons_promotion_progress_bar;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioProgressView)view;
        if (object2 != null) {
            View view2 = object;
            view2 = (RelativeLayout)object;
            n3 = R$id.footer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.parent_recycleview;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (RecyclerView)view;
                if (object3 != null) {
                    object = new CouponpromotionlistFragmentLayoutBinding((RelativeLayout)view2, (AjioProgressView)((Object)object2), (RelativeLayout)view2, (LinearLayout)view3, (RecyclerView)object3);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CouponpromotionlistFragmentLayoutBinding inflate(LayoutInflater layoutInflater) {
        return CouponpromotionlistFragmentLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static CouponpromotionlistFragmentLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.couponpromotionlist_fragment_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CouponpromotionlistFragmentLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

