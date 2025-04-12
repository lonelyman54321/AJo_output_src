/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.willy.ratingbar.ScaleRatingBar;

public final class ViewProductRatingsBinding
implements BC3 {
    public final ImageView ivRatingArrow;
    public final LinearLayout layoutNoRatings;
    public final ConstraintLayout layoutRatings;
    public final ScaleRatingBar noRatingBar;
    public final AjioTextView odCustomerImp;
    public final Guideline odRatingGuideline;
    public final AjioTextView odRatingTitle;
    public final RecyclerView odReviewList;
    public final AjioTextView odTvEdit;
    public final ScaleRatingBar ratingBar;
    public final ComposeView reviewComposeLayout;
    private final FrameLayout rootView;

    private ViewProductRatingsBinding(FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, ConstraintLayout constraintLayout, ScaleRatingBar scaleRatingBar, AjioTextView ajioTextView, Guideline guideline, AjioTextView ajioTextView2, RecyclerView recyclerView, AjioTextView ajioTextView3, ScaleRatingBar scaleRatingBar2, ComposeView composeView) {
        this.rootView = frameLayout;
        this.ivRatingArrow = imageView;
        this.layoutNoRatings = linearLayout;
        this.layoutRatings = constraintLayout;
        this.noRatingBar = scaleRatingBar;
        this.odCustomerImp = ajioTextView;
        this.odRatingGuideline = guideline;
        this.odRatingTitle = ajioTextView2;
        this.odReviewList = recyclerView;
        this.odTvEdit = ajioTextView3;
        this.ratingBar = scaleRatingBar2;
        this.reviewComposeLayout = composeView;
    }

    public static ViewProductRatingsBinding bind(View object) {
        View view;
        int n3 = R$id.iv_rating_arrow;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.layout_no_ratings;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.layout_ratings;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (ConstraintLayout)view;
                if (object2 != null) {
                    n3 = R$id.no_rating_bar;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ScaleRatingBar)view;
                    if (object3 != null) {
                        n3 = R$id.od_customer_imp;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.od_rating_guideline;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (Guideline)view;
                            if (view4 != null) {
                                n3 = R$id.od_rating_title;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioTextView)view;
                                if (object5 != null) {
                                    n3 = R$id.od_review_list;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (RecyclerView)view;
                                    if (object6 != null) {
                                        n3 = R$id.od_tv_edit;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (AjioTextView)view;
                                        if (object7 != null) {
                                            n3 = R$id.rating_bar;
                                            Object object8 = view = dd2_2.a(n3, object);
                                            object8 = (ScaleRatingBar)view;
                                            if (object8 != null) {
                                                n3 = R$id.review_compose_layout;
                                                Object object9 = view = dd2_2.a(n3, object);
                                                object9 = (ComposeView)view;
                                                if (object9 != null) {
                                                    Object object10 = object;
                                                    object10 = (FrameLayout)object;
                                                    ViewProductRatingsBinding viewProductRatingsBinding = new ViewProductRatingsBinding((FrameLayout)object10, (ImageView)view2, (LinearLayout)view3, (ConstraintLayout)((Object)object2), (ScaleRatingBar)((Object)object3), (AjioTextView)object4, (Guideline)view4, (AjioTextView)object5, (RecyclerView)object6, (AjioTextView)object7, (ScaleRatingBar)((Object)object8), (ComposeView)((Object)object9));
                                                    return viewProductRatingsBinding;
                                                }
                                            }
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

    public static ViewProductRatingsBinding inflate(LayoutInflater layoutInflater) {
        return ViewProductRatingsBinding.inflate(layoutInflater, null, false);
    }

    public static ViewProductRatingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_product_ratings;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewProductRatingsBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

