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
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class HomepageRatingFragmentBinding
implements BC3 {
    public final ShimmerFrameLayout frameShimmerHomepage;
    public final ShimmerFrameLayout frameShimmerWishlist;
    public final TextView homepageRatePurchaseTv;
    public final RecyclerView homepageRatingList;
    public final LinearLayout ratingRootView;
    private final LinearLayout rootView;

    private HomepageRatingFragmentBinding(LinearLayout linearLayout, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.frameShimmerHomepage = shimmerFrameLayout;
        this.frameShimmerWishlist = shimmerFrameLayout2;
        this.homepageRatePurchaseTv = textView;
        this.homepageRatingList = recyclerView;
        this.ratingRootView = linearLayout2;
    }

    public static HomepageRatingFragmentBinding bind(View object) {
        View view;
        int n3 = R$id.frame_shimmer_homepage;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ShimmerFrameLayout)view;
        if (object2 != null) {
            n3 = R$id.frame_shimmer_wishlist;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ShimmerFrameLayout)view;
            if (object3 != null) {
                n3 = R$id.homepage_rate_purchase_tv;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.homepage_rating_list;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (RecyclerView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (LinearLayout)object;
                        object = new HomepageRatingFragmentBinding((LinearLayout)object5, (ShimmerFrameLayout)((Object)object2), (ShimmerFrameLayout)((Object)object3), (TextView)view2, (RecyclerView)object4, (LinearLayout)object5);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HomepageRatingFragmentBinding inflate(LayoutInflater layoutInflater) {
        return HomepageRatingFragmentBinding.inflate(layoutInflater, null, false);
    }

    public static HomepageRatingFragmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.homepage_rating_fragment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomepageRatingFragmentBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

