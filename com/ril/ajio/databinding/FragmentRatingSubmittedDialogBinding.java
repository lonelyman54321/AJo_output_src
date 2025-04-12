/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentRatingSubmittedDialogBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final ConstraintLayout feedbackContainerHomepage;
    public final ConstraintLayout feedbackContainerOther;
    public final RecyclerView feedbackRatingList;
    public final ShimmerFrameLayout frameShimmerFeedback;
    public final Guideline guidelineFeedback;
    public final TextView pendingFeedbackTxt;
    public final TextView rateOtherProductTxt;
    public final ImageView ratingConfirmImg;
    public final ImageView ratingConfirmImgOther;
    public final TextView ratingDescriptionMsg;
    public final TextView ratingDescriptionMsgOther;
    public final TextView ratingThkMsg;
    public final TextView ratingThkMsgOther;
    public final TextView ratingTitle;
    public final TextView ratingTitleOther;
    private final RelativeLayout rootView;
    public final AjioTextView tvContinue;
    public final AjioTextView tvSkip;
    public final ConstraintLayout unratedItemsContainer;

    private FragmentRatingSubmittedDialogBinding(RelativeLayout relativeLayout, ImageView imageView, FrameLayout frameLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, Guideline guideline, TextView textView, TextView textView2, ImageView imageView2, ImageView imageView3, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, AjioTextView ajioTextView, AjioTextView ajioTextView2, ConstraintLayout constraintLayout3) {
        this.rootView = relativeLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.feedbackContainerHomepage = constraintLayout;
        this.feedbackContainerOther = constraintLayout2;
        this.feedbackRatingList = recyclerView;
        this.frameShimmerFeedback = shimmerFrameLayout;
        this.guidelineFeedback = guideline;
        this.pendingFeedbackTxt = textView;
        this.rateOtherProductTxt = textView2;
        this.ratingConfirmImg = imageView2;
        this.ratingConfirmImgOther = imageView3;
        this.ratingDescriptionMsg = textView3;
        this.ratingDescriptionMsgOther = textView4;
        this.ratingThkMsg = textView5;
        this.ratingThkMsgOther = textView6;
        this.ratingTitle = textView7;
        this.ratingTitleOther = textView8;
        this.tvContinue = ajioTextView;
        this.tvSkip = ajioTextView2;
        this.unratedItemsContainer = constraintLayout3;
    }

    public static FragmentRatingSubmittedDialogBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cancelBtn;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.cancelContainer;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (FrameLayout)view2;
            if (view4 != null) {
                n3 = R$id.feedback_container_homepage;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (ConstraintLayout)view2;
                if (object2 != null) {
                    n3 = R$id.feedback_container_other;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (ConstraintLayout)view2;
                    if (object3 != null) {
                        n3 = R$id.feedback_rating_list;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (RecyclerView)view2;
                        if (object4 != null) {
                            n3 = R$id.frame_shimmer_feedback;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (ShimmerFrameLayout)view2;
                            if (object5 != null) {
                                n3 = R$id.guideline_feedback;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (Guideline)view2;
                                if (view5 != null) {
                                    n3 = R$id.pending_feedback_txt;
                                    View view6 = view2 = dd2_2.a(n3, view);
                                    view6 = (TextView)view2;
                                    if (view6 != null) {
                                        n3 = R$id.rate_other_product_txt;
                                        View view7 = view2 = dd2_2.a(n3, view);
                                        view7 = (TextView)view2;
                                        if (view7 != null) {
                                            n3 = R$id.rating_confirm_img;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (ImageView)view2;
                                            if (view8 != null) {
                                                n3 = R$id.rating_confirm_img_other;
                                                View view9 = view2 = dd2_2.a(n3, view);
                                                view9 = (ImageView)view2;
                                                if (view9 != null) {
                                                    n3 = R$id.rating_description_msg;
                                                    View view10 = view2 = dd2_2.a(n3, view);
                                                    view10 = (TextView)view2;
                                                    if (view10 != null) {
                                                        n3 = R$id.rating_description_msg_other;
                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                        view11 = (TextView)view2;
                                                        if (view11 != null) {
                                                            n3 = R$id.rating_thk_msg;
                                                            View view12 = view2 = dd2_2.a(n3, view);
                                                            view12 = (TextView)view2;
                                                            if (view12 != null) {
                                                                n3 = R$id.rating_thk_msg_other;
                                                                View view13 = view2 = dd2_2.a(n3, view);
                                                                view13 = (TextView)view2;
                                                                if (view13 != null) {
                                                                    n3 = R$id.rating_title;
                                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                                    view14 = (TextView)view2;
                                                                    if (view14 != null) {
                                                                        n3 = R$id.rating_title_other;
                                                                        View view15 = view2 = dd2_2.a(n3, view);
                                                                        view15 = (TextView)view2;
                                                                        if (view15 != null) {
                                                                            n3 = R$id.tv_continue;
                                                                            Object object6 = view2 = dd2_2.a(n3, view);
                                                                            object6 = (AjioTextView)view2;
                                                                            if (object6 != null) {
                                                                                n3 = R$id.tv_skip;
                                                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                                                object7 = (AjioTextView)view2;
                                                                                if (object7 != null) {
                                                                                    n3 = R$id.unrated_items_container;
                                                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                                                    object8 = (ConstraintLayout)view2;
                                                                                    if (object8 != null) {
                                                                                        View view16 = view;
                                                                                        view16 = (RelativeLayout)view;
                                                                                        FragmentRatingSubmittedDialogBinding fragmentRatingSubmittedDialogBinding = new FragmentRatingSubmittedDialogBinding((RelativeLayout)view16, (ImageView)view3, (FrameLayout)view4, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (RecyclerView)object4, (ShimmerFrameLayout)((Object)object5), (Guideline)view5, (TextView)view6, (TextView)view7, (ImageView)view8, (ImageView)view9, (TextView)view10, (TextView)view11, (TextView)view12, (TextView)view13, (TextView)view14, (TextView)view15, (AjioTextView)object6, (AjioTextView)object7, (ConstraintLayout)((Object)object8));
                                                                                        return fragmentRatingSubmittedDialogBinding;
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

    public static FragmentRatingSubmittedDialogBinding inflate(LayoutInflater layoutInflater) {
        return FragmentRatingSubmittedDialogBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentRatingSubmittedDialogBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_rating_submitted_dialog;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentRatingSubmittedDialogBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

