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
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.willy.ratingbar.ScaleRatingBar;

public final class ItemRatingsViewReturnOrderBinding
implements BC3 {
    public final Barrier barrier;
    public final TextView brandTV;
    public final Barrier imageBarrier;
    public final CardView imageContainer;
    public final TextView infoTV;
    public final AjioTextView odCustomerImp;
    public final AjioTextView odEditFeedback;
    public final ScaleRatingBar odItemRatingCl;
    public final ImageView odOrderDown;
    public final AjioTextView odRatingCl;
    public final Guideline odRatingGuideline;
    public final RecyclerView odReviewList;
    public final TextView priceTV;
    public final ImageView productIV;
    public final ScaleRatingBar rateThisProductRatingBar;
    public final Barrier ratingBarrier;
    public final TextView returnViewRatingsTitle;
    public final ComposeView reviewComposeLayout;
    private final ConstraintLayout rootView;
    public final TextView sizeTV;

    private ItemRatingsViewReturnOrderBinding(ConstraintLayout constraintLayout, Barrier barrier, TextView textView, Barrier barrier2, CardView cardView, TextView textView2, AjioTextView ajioTextView, AjioTextView ajioTextView2, ScaleRatingBar scaleRatingBar, ImageView imageView, AjioTextView ajioTextView3, Guideline guideline, RecyclerView recyclerView, TextView textView3, ImageView imageView2, ScaleRatingBar scaleRatingBar2, Barrier barrier3, TextView textView4, ComposeView composeView, TextView textView5) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.brandTV = textView;
        this.imageBarrier = barrier2;
        this.imageContainer = cardView;
        this.infoTV = textView2;
        this.odCustomerImp = ajioTextView;
        this.odEditFeedback = ajioTextView2;
        this.odItemRatingCl = scaleRatingBar;
        this.odOrderDown = imageView;
        this.odRatingCl = ajioTextView3;
        this.odRatingGuideline = guideline;
        this.odReviewList = recyclerView;
        this.priceTV = textView3;
        this.productIV = imageView2;
        this.rateThisProductRatingBar = scaleRatingBar2;
        this.ratingBarrier = barrier3;
        this.returnViewRatingsTitle = textView4;
        this.reviewComposeLayout = composeView;
        this.sizeTV = textView5;
    }

    public static ItemRatingsViewReturnOrderBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.barrier;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Barrier)view2;
        if (view3 != null) {
            n3 = R$id.brandTV;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.image_barrier;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (Barrier)view2;
                if (view5 != null) {
                    n3 = R$id.imageContainer;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (CardView)view2;
                    if (object2 != null) {
                        n3 = R$id.infoTV;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (TextView)view2;
                        if (view6 != null) {
                            n3 = R$id.od_customer_imp;
                            Object object3 = view2 = dd2_2.a(n3, view);
                            object3 = (AjioTextView)view2;
                            if (object3 != null) {
                                n3 = R$id.od_edit_feedback;
                                Object object4 = view2 = dd2_2.a(n3, view);
                                object4 = (AjioTextView)view2;
                                if (object4 != null) {
                                    n3 = R$id.od_item_rating_cl;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (ScaleRatingBar)view2;
                                    if (object5 != null) {
                                        n3 = R$id.od_order_down;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (ImageView)view2;
                                        if (view7 != null) {
                                            n3 = R$id.od_rating_cl;
                                            Object object6 = view2 = dd2_2.a(n3, view);
                                            object6 = (AjioTextView)view2;
                                            if (object6 != null) {
                                                n3 = R$id.od_rating_guideline;
                                                View view8 = view2 = dd2_2.a(n3, view);
                                                view8 = (Guideline)view2;
                                                if (view8 != null) {
                                                    n3 = R$id.od_review_list;
                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                    object7 = (RecyclerView)view2;
                                                    if (object7 != null) {
                                                        n3 = R$id.priceTV;
                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                        view9 = (TextView)view2;
                                                        if (view9 != null) {
                                                            n3 = R$id.productIV;
                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                            view10 = (ImageView)view2;
                                                            if (view10 != null) {
                                                                n3 = R$id.rate_this_product_rating_bar;
                                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                                object8 = (ScaleRatingBar)view2;
                                                                if (object8 != null) {
                                                                    n3 = R$id.rating_barrier;
                                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                                    view11 = (Barrier)view2;
                                                                    if (view11 != null) {
                                                                        n3 = R$id.return_view_ratings_title;
                                                                        View view12 = view2 = dd2_2.a(n3, view);
                                                                        view12 = (TextView)view2;
                                                                        if (view12 != null) {
                                                                            n3 = R$id.review_compose_layout;
                                                                            Object object9 = view2 = dd2_2.a(n3, view);
                                                                            object9 = (ComposeView)view2;
                                                                            if (object9 != null) {
                                                                                n3 = R$id.sizeTV;
                                                                                View view13 = view2 = dd2_2.a(n3, view);
                                                                                view13 = (TextView)view2;
                                                                                if (view13 != null) {
                                                                                    Object object10 = view;
                                                                                    object10 = (ConstraintLayout)view;
                                                                                    ItemRatingsViewReturnOrderBinding itemRatingsViewReturnOrderBinding = new ItemRatingsViewReturnOrderBinding((ConstraintLayout)((Object)object10), (Barrier)view3, (TextView)view4, (Barrier)view5, (CardView)((Object)object2), (TextView)view6, (AjioTextView)object3, (AjioTextView)object4, (ScaleRatingBar)((Object)object5), (ImageView)view7, (AjioTextView)object6, (Guideline)view8, (RecyclerView)object7, (TextView)view9, (ImageView)view10, (ScaleRatingBar)((Object)object8), (Barrier)view11, (TextView)view12, (ComposeView)((Object)object9), (TextView)view13);
                                                                                    return itemRatingsViewReturnOrderBinding;
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
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemRatingsViewReturnOrderBinding inflate(LayoutInflater layoutInflater) {
        return ItemRatingsViewReturnOrderBinding.inflate(layoutInflater, null, false);
    }

    public static ItemRatingsViewReturnOrderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_ratings_view_return_order;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemRatingsViewReturnOrderBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

