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
import com.willy.ratingbar.ScaleRatingBar;

public final class ShimmerPdpRatingsBinding
implements BC3 {
    public final ScaleRatingBar rateThisProductRatingBar;
    private final LinearLayout rootView;

    private ShimmerPdpRatingsBinding(LinearLayout linearLayout, ScaleRatingBar scaleRatingBar) {
        this.rootView = linearLayout;
        this.rateThisProductRatingBar = scaleRatingBar;
    }

    public static ShimmerPdpRatingsBinding bind(View object) {
        int n3 = R$id.rate_this_product_rating_bar;
        ScaleRatingBar scaleRatingBar = (ScaleRatingBar)dd2_2.a(n3, object);
        if (scaleRatingBar != null) {
            object = (LinearLayout)object;
            ShimmerPdpRatingsBinding shimmerPdpRatingsBinding = new ShimmerPdpRatingsBinding((LinearLayout)object, scaleRatingBar);
            return shimmerPdpRatingsBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerPdpRatingsBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerPdpRatingsBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerPdpRatingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_pdp_ratings;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerPdpRatingsBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

