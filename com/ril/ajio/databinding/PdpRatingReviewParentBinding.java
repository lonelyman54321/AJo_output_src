/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.ProgressBar
 *  android.widget.RatingBar
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PdpRatingReviewParentBinding
implements BC3 {
    public final LinearLayout allRatingContainer;
    public final AjioTextView btnCalculationInfo;
    public final AjioTextView btnRateProduct;
    public final LinearLayout contentContainer;
    public final RecyclerView customerOpinionRv;
    public final RecyclerView customerWordsRv;
    public final View divider;
    public final LinearLayout moreContainer;
    public final AjioTextView newRatingCount;
    public final RatingBar newRatingStar;
    public final AjioTextView newRatingValue;
    public final AjioTextView noReviewMsg;
    public final AjioTextView rating1starLabel;
    public final AjioTextView rating2starLabel;
    public final AjioTextView rating3starLabel;
    public final AjioTextView rating4starLabel;
    public final AjioTextView rating5starLabel;
    public final ConstraintLayout ratingContainer;
    public final AjioTextView ratingCount;
    public final AjioTextView ratingPerc1;
    public final AjioTextView ratingPerc2;
    public final AjioTextView ratingPerc3;
    public final AjioTextView ratingPerc4;
    public final AjioTextView ratingPerc5;
    public final ProgressBar ratingProgress1;
    public final ProgressBar ratingProgress2;
    public final ProgressBar ratingProgress3;
    public final ProgressBar ratingProgress4;
    public final ProgressBar ratingProgress5;
    public final AjioImageView ratingStar;
    public final LinearLayout ratingSummaryContainer;
    public final AjioTextView ratingValue;
    public final LinearLayout reviewRatingNewView;
    public final LinearLayout reviewRatingOldView;
    private final LinearLayout rootView;
    public final AjioTextView secHeader;
    public final LinearLayout subRatingSummary;
    public final AjioTextView viewHandle;
    public final View viewLine;

    private PdpRatingReviewParentBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, LinearLayout linearLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, View view, LinearLayout linearLayout4, AjioTextView ajioTextView3, RatingBar ratingBar, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, ConstraintLayout constraintLayout, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, AjioTextView ajioTextView14, AjioTextView ajioTextView15, AjioTextView ajioTextView16, ProgressBar progressBar, ProgressBar progressBar2, ProgressBar progressBar3, ProgressBar progressBar4, ProgressBar progressBar5, AjioImageView ajioImageView, LinearLayout linearLayout5, AjioTextView ajioTextView17, LinearLayout linearLayout6, LinearLayout linearLayout7, AjioTextView ajioTextView18, LinearLayout linearLayout8, AjioTextView ajioTextView19, View view2) {
        this.rootView = linearLayout;
        this.allRatingContainer = linearLayout2;
        this.btnCalculationInfo = ajioTextView;
        this.btnRateProduct = ajioTextView2;
        this.contentContainer = linearLayout3;
        this.customerOpinionRv = recyclerView;
        this.customerWordsRv = recyclerView2;
        this.divider = view;
        this.moreContainer = linearLayout4;
        this.newRatingCount = ajioTextView3;
        this.newRatingStar = ratingBar;
        this.newRatingValue = ajioTextView4;
        this.noReviewMsg = ajioTextView5;
        this.rating1starLabel = ajioTextView6;
        this.rating2starLabel = ajioTextView7;
        this.rating3starLabel = ajioTextView8;
        this.rating4starLabel = ajioTextView9;
        this.rating5starLabel = ajioTextView10;
        this.ratingContainer = constraintLayout;
        this.ratingCount = ajioTextView11;
        this.ratingPerc1 = ajioTextView12;
        this.ratingPerc2 = ajioTextView13;
        this.ratingPerc3 = ajioTextView14;
        this.ratingPerc4 = ajioTextView15;
        this.ratingPerc5 = ajioTextView16;
        this.ratingProgress1 = progressBar;
        this.ratingProgress2 = progressBar2;
        this.ratingProgress3 = progressBar3;
        this.ratingProgress4 = progressBar4;
        this.ratingProgress5 = progressBar5;
        this.ratingStar = ajioImageView;
        this.ratingSummaryContainer = linearLayout5;
        this.ratingValue = ajioTextView17;
        this.reviewRatingNewView = linearLayout6;
        this.reviewRatingOldView = linearLayout7;
        this.secHeader = ajioTextView18;
        this.subRatingSummary = linearLayout8;
        this.viewHandle = ajioTextView19;
        this.viewLine = view2;
    }

    public static PdpRatingReviewParentBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.all_rating_container;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n3 = R$id.btn_calculation_info;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioTextView)view2;
            if (object2 != null) {
                n3 = R$id.btn_rate_product;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.content_container;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (LinearLayout)view2;
                    if (view4 != null) {
                        n3 = R$id.customer_opinion_rv;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (RecyclerView)view2;
                        if (object4 != null) {
                            View view5;
                            n3 = R$id.customer_words_rv;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (RecyclerView)view2;
                            if (object5 != null && (view5 = dd2_2.a(n3 = R$id.divider, view)) != null) {
                                n3 = R$id.more_container;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (LinearLayout)view2;
                                if (view6 != null) {
                                    n3 = R$id.new_rating_count;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (AjioTextView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.new_rating_star;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (RatingBar)view2;
                                        if (view7 != null) {
                                            n3 = R$id.new_rating_value;
                                            Object object7 = view2 = dd2_2.a(n3, view);
                                            object7 = (AjioTextView)view2;
                                            if (object7 != null) {
                                                n3 = R$id.no_review_msg;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (AjioTextView)view2;
                                                if (object8 != null) {
                                                    n3 = R$id.rating1star_label;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (AjioTextView)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.rating2star_label;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioTextView)view2;
                                                        if (object10 != null) {
                                                            n3 = R$id.rating3star_label;
                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                            object11 = (AjioTextView)view2;
                                                            if (object11 != null) {
                                                                n3 = R$id.rating4star_label;
                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                object12 = (AjioTextView)view2;
                                                                if (object12 != null) {
                                                                    n3 = R$id.rating5star_label;
                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                    object13 = (AjioTextView)view2;
                                                                    if (object13 != null) {
                                                                        n3 = R$id.rating_container;
                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                        object14 = (ConstraintLayout)view2;
                                                                        if (object14 != null) {
                                                                            n3 = R$id.rating_count;
                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                            object15 = (AjioTextView)view2;
                                                                            if (object15 != null) {
                                                                                n3 = R$id.rating_perc_1;
                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                object16 = (AjioTextView)view2;
                                                                                if (object16 != null) {
                                                                                    n3 = R$id.rating_perc_2;
                                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                                    object17 = (AjioTextView)view2;
                                                                                    if (object17 != null) {
                                                                                        n3 = R$id.rating_perc_3;
                                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                                        object18 = (AjioTextView)view2;
                                                                                        if (object18 != null) {
                                                                                            n3 = R$id.rating_perc_4;
                                                                                            Object object19 = view2 = dd2_2.a(n3, view);
                                                                                            object19 = (AjioTextView)view2;
                                                                                            if (object19 != null) {
                                                                                                n3 = R$id.rating_perc_5;
                                                                                                Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                object20 = (AjioTextView)view2;
                                                                                                if (object20 != null) {
                                                                                                    n3 = R$id.rating_progress_1;
                                                                                                    View view8 = view2 = dd2_2.a(n3, view);
                                                                                                    view8 = (ProgressBar)view2;
                                                                                                    if (view8 != null) {
                                                                                                        n3 = R$id.rating_progress_2;
                                                                                                        View view9 = view2 = dd2_2.a(n3, view);
                                                                                                        view9 = (ProgressBar)view2;
                                                                                                        if (view9 != null) {
                                                                                                            n3 = R$id.rating_progress_3;
                                                                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                                                                            view10 = (ProgressBar)view2;
                                                                                                            if (view10 != null) {
                                                                                                                n3 = R$id.rating_progress_4;
                                                                                                                View view11 = view2 = dd2_2.a(n3, view);
                                                                                                                view11 = (ProgressBar)view2;
                                                                                                                if (view11 != null) {
                                                                                                                    n3 = R$id.rating_progress_5;
                                                                                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                                                                                    view12 = (ProgressBar)view2;
                                                                                                                    if (view12 != null) {
                                                                                                                        n3 = R$id.rating_star;
                                                                                                                        Object object21 = view2 = dd2_2.a(n3, view);
                                                                                                                        object21 = (AjioImageView)view2;
                                                                                                                        if (object21 != null) {
                                                                                                                            n3 = R$id.rating_summary_container;
                                                                                                                            View view13 = view2 = dd2_2.a(n3, view);
                                                                                                                            view13 = (LinearLayout)view2;
                                                                                                                            if (view13 != null) {
                                                                                                                                n3 = R$id.rating_value;
                                                                                                                                Object object22 = view2 = dd2_2.a(n3, view);
                                                                                                                                object22 = (AjioTextView)view2;
                                                                                                                                if (object22 != null) {
                                                                                                                                    n3 = R$id.review_rating_new_view;
                                                                                                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                                                                                                    view14 = (LinearLayout)view2;
                                                                                                                                    if (view14 != null) {
                                                                                                                                        n3 = R$id.review_rating_old_view;
                                                                                                                                        View view15 = view2 = dd2_2.a(n3, view);
                                                                                                                                        view15 = (LinearLayout)view2;
                                                                                                                                        if (view15 != null) {
                                                                                                                                            n3 = R$id.sec_header;
                                                                                                                                            Object object23 = view2 = dd2_2.a(n3, view);
                                                                                                                                            object23 = (AjioTextView)view2;
                                                                                                                                            if (object23 != null) {
                                                                                                                                                n3 = R$id.sub_rating_summary;
                                                                                                                                                View view16 = view2 = dd2_2.a(n3, view);
                                                                                                                                                view16 = (LinearLayout)view2;
                                                                                                                                                if (view16 != null) {
                                                                                                                                                    View view17;
                                                                                                                                                    n3 = R$id.view_handle;
                                                                                                                                                    Object object24 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    object24 = (AjioTextView)view2;
                                                                                                                                                    if (object24 != null && (view17 = dd2_2.a(n3 = R$id.view_line, view)) != null) {
                                                                                                                                                        View view18 = view;
                                                                                                                                                        view18 = (LinearLayout)view;
                                                                                                                                                        PdpRatingReviewParentBinding pdpRatingReviewParentBinding = new PdpRatingReviewParentBinding((LinearLayout)view18, (LinearLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (LinearLayout)view4, (RecyclerView)object4, (RecyclerView)object5, view5, (LinearLayout)view6, (AjioTextView)object6, (RatingBar)view7, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (ConstraintLayout)((Object)object14), (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (ProgressBar)view8, (ProgressBar)view9, (ProgressBar)view10, (ProgressBar)view11, (ProgressBar)view12, (AjioImageView)((Object)object21), (LinearLayout)view13, (AjioTextView)object22, (LinearLayout)view14, (LinearLayout)view15, (AjioTextView)object23, (LinearLayout)view16, (AjioTextView)object24, view17);
                                                                                                                                                        return pdpRatingReviewParentBinding;
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

    public static PdpRatingReviewParentBinding inflate(LayoutInflater layoutInflater) {
        return PdpRatingReviewParentBinding.inflate(layoutInflater, null, false);
    }

    public static PdpRatingReviewParentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_rating_review_parent;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpRatingReviewParentBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

