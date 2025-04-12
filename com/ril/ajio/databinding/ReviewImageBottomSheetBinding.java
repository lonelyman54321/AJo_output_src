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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.ril.ajio.R$layout;

public abstract class ReviewImageBottomSheetBinding
extends ViewDataBinding {
    public final CardView cvRating;
    public final AppCompatImageView idReviewImageCloseDialog;
    public final ImageView ivNext;
    public final ImageView ivPrev;
    public final ImageView ivRating;
    public final ConstraintLayout layoutHeaderReviewImage;
    public final ConstraintLayout layoutParentReviewImage;
    public final ConstraintLayout layoutRatingParent;
    public final ConstraintLayout layoutReviewImage;
    public final TextView tvCount;
    public final TextView tvErrorMsg;
    public final TextView tvRatingText;
    public final TextView tvReviewText;
    public final TextView tvReviewTitleDate;
    public final ViewPager2 vpReviewImage;

    public ReviewImageBottomSheetBinding(Object object, View view, int n3, CardView cardView, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ViewPager2 viewPager2) {
        super(object, view, n3);
        this.cvRating = cardView;
        this.idReviewImageCloseDialog = appCompatImageView;
        this.ivNext = imageView;
        this.ivPrev = imageView2;
        this.ivRating = imageView3;
        this.layoutHeaderReviewImage = constraintLayout;
        this.layoutParentReviewImage = constraintLayout2;
        this.layoutRatingParent = constraintLayout3;
        this.layoutReviewImage = constraintLayout4;
        this.tvCount = textView;
        this.tvErrorMsg = textView2;
        this.tvRatingText = textView3;
        this.tvReviewText = textView4;
        this.tvReviewTitleDate = textView5;
        this.vpReviewImage = viewPager2;
    }

    public static ReviewImageBottomSheetBinding bind(View view) {
        return ReviewImageBottomSheetBinding.bind(view, null);
    }

    public static ReviewImageBottomSheetBinding bind(View view, Object object) {
        int n3 = R$layout.review_image_bottom_sheet;
        return (ReviewImageBottomSheetBinding)ViewDataBinding.bind(object, view, n3);
    }

    public static ReviewImageBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return ReviewImageBottomSheetBinding.inflate(layoutInflater, null);
    }

    public static ReviewImageBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        return ReviewImageBottomSheetBinding.inflate(layoutInflater, viewGroup, bl2, null);
    }

    public static ReviewImageBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2, Object object) {
        int n3 = R$layout.review_image_bottom_sheet;
        return (ReviewImageBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, viewGroup, bl2, object);
    }

    public static ReviewImageBottomSheetBinding inflate(LayoutInflater layoutInflater, Object object) {
        int n3 = R$layout.review_image_bottom_sheet;
        return (ReviewImageBottomSheetBinding)ViewDataBinding.inflateInternal(layoutInflater, n3, null, false, object);
    }
}

