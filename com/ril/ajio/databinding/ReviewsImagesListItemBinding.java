/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ReviewsImagesListItemBinding
implements BC3 {
    public final ImageView deleteImg;
    public final LinearProgressIndicator imageUploadProgressbar;
    public final AjioTextView imageUploadRetry;
    public final FrameLayout reviewImgBg;
    public final ImageView reviewImgRetry;
    private final FrameLayout rootView;
    public final AjioRoundedCornerImageView selectedReviewImg;

    private ReviewsImagesListItemBinding(FrameLayout frameLayout, ImageView imageView, LinearProgressIndicator linearProgressIndicator, AjioTextView ajioTextView, FrameLayout frameLayout2, ImageView imageView2, AjioRoundedCornerImageView ajioRoundedCornerImageView) {
        this.rootView = frameLayout;
        this.deleteImg = imageView;
        this.imageUploadProgressbar = linearProgressIndicator;
        this.imageUploadRetry = ajioTextView;
        this.reviewImgBg = frameLayout2;
        this.reviewImgRetry = imageView2;
        this.selectedReviewImg = ajioRoundedCornerImageView;
    }

    public static ReviewsImagesListItemBinding bind(View object) {
        View view;
        int n3 = R$id.delete_img;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.image_upload_progressbar;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (LinearProgressIndicator)view;
            if (object2 != null) {
                n3 = R$id.image_upload_retry;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.review_img_bg;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (FrameLayout)view;
                    if (view3 != null) {
                        n3 = R$id.review_img_retry;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (ImageView)view;
                        if (view4 != null) {
                            n3 = R$id.selected_review_img;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioRoundedCornerImageView)view;
                            if (object4 != null) {
                                Object object5 = object;
                                object5 = (FrameLayout)object;
                                ReviewsImagesListItemBinding reviewsImagesListItemBinding = new ReviewsImagesListItemBinding((FrameLayout)object5, (ImageView)view2, (LinearProgressIndicator)((Object)object2), (AjioTextView)object3, (FrameLayout)view3, (ImageView)view4, (AjioRoundedCornerImageView)((Object)object4));
                                return reviewsImagesListItemBinding;
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

    public static ReviewsImagesListItemBinding inflate(LayoutInflater layoutInflater) {
        return ReviewsImagesListItemBinding.inflate(layoutInflater, null, false);
    }

    public static ReviewsImagesListItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.reviews_images_list_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReviewsImagesListItemBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

