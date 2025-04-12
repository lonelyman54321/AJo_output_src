/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.willy.ratingbar.ScaleRatingBar;

public final class ShimmerRatingHomepageBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View rowShimmerAcDetail1;
    public final View rowShimmerAcDetail2;
    public final View rowShimmerAcDetail3;
    public final View rowShimmerAcDetail4;
    public final View rowShimmerTitle;
    public final Barrier shimmerBarrier;
    public final ScaleRatingBar shimmerItemRating;

    private ShimmerRatingHomepageBinding(ConstraintLayout constraintLayout, View view, View view2, View view3, View view4, View view5, Barrier barrier, ScaleRatingBar scaleRatingBar) {
        this.rootView = constraintLayout;
        this.rowShimmerAcDetail1 = view;
        this.rowShimmerAcDetail2 = view2;
        this.rowShimmerAcDetail3 = view3;
        this.rowShimmerAcDetail4 = view4;
        this.rowShimmerTitle = view5;
        this.shimmerBarrier = barrier;
        this.shimmerItemRating = scaleRatingBar;
    }

    public static ShimmerRatingHomepageBinding bind(View object) {
        View view;
        View view2;
        View view3;
        View view4;
        int n3 = R$id.row_shimmer_ac_detail_1;
        View view5 = dd2_2.a(n3, object);
        if (view5 != null && (view4 = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_2, object)) != null && (view3 = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_3, object)) != null && (view2 = dd2_2.a(n3 = R$id.row_shimmer_ac_detail_4, object)) != null && (view = dd2_2.a(n3 = R$id.row_shimmer_title, object)) != null) {
            Object object2;
            n3 = R$id.shimmer_barrier;
            View view6 = object2 = dd2_2.a(n3, object);
            view6 = (Barrier)((Object)object2);
            if (view6 != null) {
                n3 = R$id.shimmer_item_rating;
                Object object3 = object2 = dd2_2.a(n3, object);
                object3 = (ScaleRatingBar)((Object)object2);
                if (object3 != null) {
                    ShimmerRatingHomepageBinding shimmerRatingHomepageBinding;
                    Object object4 = object;
                    object4 = (ConstraintLayout)((Object)object);
                    object2 = shimmerRatingHomepageBinding;
                    shimmerRatingHomepageBinding = new ShimmerRatingHomepageBinding((ConstraintLayout)((Object)object4), view5, view4, view3, view2, view, (Barrier)view6, (ScaleRatingBar)((Object)object3));
                    return shimmerRatingHomepageBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShimmerRatingHomepageBinding inflate(LayoutInflater layoutInflater) {
        return ShimmerRatingHomepageBinding.inflate(layoutInflater, null, false);
    }

    public static ShimmerRatingHomepageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shimmer_rating_homepage;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShimmerRatingHomepageBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

