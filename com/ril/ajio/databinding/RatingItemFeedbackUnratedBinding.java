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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.willy.ratingbar.ScaleRatingBar;

public final class RatingItemFeedbackUnratedBinding
implements BC3 {
    public final TextView feedbackpageItemBrandTv;
    public final TextView feedbackpageItemDescriptionTv;
    public final AjioRoundedCornerImageView feedbackpageItemImage;
    public final ScaleRatingBar feedbackpageItemRating;
    private final ConstraintLayout rootView;

    private RatingItemFeedbackUnratedBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, AjioRoundedCornerImageView ajioRoundedCornerImageView, ScaleRatingBar scaleRatingBar) {
        this.rootView = constraintLayout;
        this.feedbackpageItemBrandTv = textView;
        this.feedbackpageItemDescriptionTv = textView2;
        this.feedbackpageItemImage = ajioRoundedCornerImageView;
        this.feedbackpageItemRating = scaleRatingBar;
    }

    public static RatingItemFeedbackUnratedBinding bind(View object) {
        View view;
        int n3 = R$id.feedbackpage_item_brand_tv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.feedbackpage_item_description_tv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.feedbackpage_item_image;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioRoundedCornerImageView)view;
                if (object2 != null) {
                    n3 = R$id.feedbackpage_item_rating;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ScaleRatingBar)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (ConstraintLayout)((Object)object);
                        RatingItemFeedbackUnratedBinding ratingItemFeedbackUnratedBinding = new RatingItemFeedbackUnratedBinding((ConstraintLayout)((Object)object4), (TextView)view2, (TextView)view3, (AjioRoundedCornerImageView)((Object)object2), (ScaleRatingBar)((Object)object3));
                        return ratingItemFeedbackUnratedBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RatingItemFeedbackUnratedBinding inflate(LayoutInflater layoutInflater) {
        return RatingItemFeedbackUnratedBinding.inflate(layoutInflater, null, false);
    }

    public static RatingItemFeedbackUnratedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.rating_item_feedback_unrated;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RatingItemFeedbackUnratedBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

