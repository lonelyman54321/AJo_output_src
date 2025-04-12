/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentCouponListBinding
implements BC3 {
    public final TextView couponBoOfferInfo;
    public final RecyclerView couponListView;
    public final ConstraintLayout couponNoOfferContainer;
    public final TextView couponNoOfferHeader;
    public final ImageView couponNoOfferIcon;
    private final ConstraintLayout rootView;

    private FragmentCouponListBinding(ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout2, TextView textView2, ImageView imageView) {
        this.rootView = constraintLayout;
        this.couponBoOfferInfo = textView;
        this.couponListView = recyclerView;
        this.couponNoOfferContainer = constraintLayout2;
        this.couponNoOfferHeader = textView2;
        this.couponNoOfferIcon = imageView;
    }

    public static FragmentCouponListBinding bind(View object) {
        View view;
        int n3 = R$id.coupon_bo_offer_info;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.coupon_list_view;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (RecyclerView)view;
            if (object2 != null) {
                n3 = R$id.coupon_no_offer_container;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (ConstraintLayout)view;
                if (object3 != null) {
                    n3 = R$id.coupon_no_offer_header;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (TextView)view;
                    if (view3 != null) {
                        n3 = R$id.coupon_no_offer_icon;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (ImageView)view;
                        if (view4 != null) {
                            Object object4 = object;
                            object4 = (ConstraintLayout)((Object)object);
                            FragmentCouponListBinding fragmentCouponListBinding = new FragmentCouponListBinding((ConstraintLayout)((Object)object4), (TextView)view2, (RecyclerView)object2, (ConstraintLayout)((Object)object3), (TextView)view3, (ImageView)view4);
                            return fragmentCouponListBinding;
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

    public static FragmentCouponListBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCouponListBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCouponListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_coupon_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCouponListBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

