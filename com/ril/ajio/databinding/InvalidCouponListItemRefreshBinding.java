/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class InvalidCouponListItemRefreshBinding
implements BC3 {
    public final TextView couponCodeTv;
    public final ConstraintLayout couponDetailsContainer;
    public final TextView couponInfoTv;
    public final CardView eligibleItemsContainer;
    public final TextView eligibleProductsCountTv;
    public final TextView offerDescTv;
    public final RecyclerView productListRv;
    private final ConstraintLayout rootView;
    public final TextView shopNow;
    public final TextView tnc;

    private InvalidCouponListItemRefreshBinding(ConstraintLayout constraintLayout, TextView textView, ConstraintLayout constraintLayout2, TextView textView2, CardView cardView, TextView textView3, TextView textView4, RecyclerView recyclerView, TextView textView5, TextView textView6) {
        this.rootView = constraintLayout;
        this.couponCodeTv = textView;
        this.couponDetailsContainer = constraintLayout2;
        this.couponInfoTv = textView2;
        this.eligibleItemsContainer = cardView;
        this.eligibleProductsCountTv = textView3;
        this.offerDescTv = textView4;
        this.productListRv = recyclerView;
        this.shopNow = textView5;
        this.tnc = textView6;
    }

    public static InvalidCouponListItemRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.couponCodeTv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.couponDetailsContainer;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (ConstraintLayout)view;
            if (object2 != null) {
                n3 = R$id.couponInfoTv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.eligibleItemsContainer;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (CardView)view;
                    if (object3 != null) {
                        n3 = R$id.eligibleProductsCountTv;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.offerDescTv;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                n3 = R$id.productListRv;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (RecyclerView)view;
                                if (object4 != null) {
                                    n3 = R$id.shopNow;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (TextView)view;
                                    if (view6 != null) {
                                        n3 = R$id.tnc;
                                        View view7 = view = dd2_2.a(n3, object);
                                        view7 = (TextView)view;
                                        if (view7 != null) {
                                            Object object5 = object;
                                            object5 = (ConstraintLayout)((Object)object);
                                            InvalidCouponListItemRefreshBinding invalidCouponListItemRefreshBinding = new InvalidCouponListItemRefreshBinding((ConstraintLayout)((Object)object5), (TextView)view2, (ConstraintLayout)((Object)object2), (TextView)view3, (CardView)((Object)object3), (TextView)view4, (TextView)view5, (RecyclerView)object4, (TextView)view6, (TextView)view7);
                                            return invalidCouponListItemRefreshBinding;
                                        }
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

    public static InvalidCouponListItemRefreshBinding inflate(LayoutInflater layoutInflater) {
        return InvalidCouponListItemRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static InvalidCouponListItemRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.invalid_coupon_list_item_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return InvalidCouponListItemRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

