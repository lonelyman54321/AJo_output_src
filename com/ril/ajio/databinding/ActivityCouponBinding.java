/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;

public final class ActivityCouponBinding
implements BC3 {
    public final LinearLayout couponCancelContainer;
    public final AjioProgressView couponProgressBar;
    public final TabLayout couponTab;
    public final Toolbar couponToolbar;
    public final TextView couponToolbarOfferCount;
    public final TextView couponToolbarTitle;
    public final ViewPager couponViewPager;
    private final ConstraintLayout rootView;

    private ActivityCouponBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, AjioProgressView ajioProgressView, TabLayout tabLayout, Toolbar toolbar, TextView textView, TextView textView2, ViewPager viewPager) {
        this.rootView = constraintLayout;
        this.couponCancelContainer = linearLayout;
        this.couponProgressBar = ajioProgressView;
        this.couponTab = tabLayout;
        this.couponToolbar = toolbar;
        this.couponToolbarOfferCount = textView;
        this.couponToolbarTitle = textView2;
        this.couponViewPager = viewPager;
    }

    public static ActivityCouponBinding bind(View object) {
        View view;
        int n3 = R$id.coupon_cancel_container;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.coupon_progress_bar;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioProgressView)view;
            if (object2 != null) {
                n3 = R$id.coupon_tab;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (TabLayout)view;
                if (object3 != null) {
                    n3 = R$id.coupon_toolbar;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (Toolbar)view;
                    if (object4 != null) {
                        n3 = R$id.coupon_toolbar_offer_count;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (TextView)view;
                        if (view3 != null) {
                            n3 = R$id.coupon_toolbar_title;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                n3 = R$id.coupon_view_pager;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (ViewPager)view;
                                if (object5 != null) {
                                    Object object6 = object;
                                    object6 = (ConstraintLayout)((Object)object);
                                    ActivityCouponBinding activityCouponBinding = new ActivityCouponBinding((ConstraintLayout)((Object)object6), (LinearLayout)view2, (AjioProgressView)((Object)object2), (TabLayout)((Object)object3), (Toolbar)object4, (TextView)view3, (TextView)view4, (ViewPager)((Object)object5));
                                    return activityCouponBinding;
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

    public static ActivityCouponBinding inflate(LayoutInflater layoutInflater) {
        return ActivityCouponBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityCouponBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_coupon;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityCouponBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

