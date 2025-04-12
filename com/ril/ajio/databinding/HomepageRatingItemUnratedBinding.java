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

public final class HomepageRatingItemUnratedBinding
implements BC3 {
    public final TextView homepageItemBrandTv;
    public final TextView homepageItemDescriptionTv;
    public final AjioRoundedCornerImageView homepageItemImage;
    public final ScaleRatingBar homepageItemRating;
    public final TextView homepageRatingExperience;
    public final TextView homepageRatingSubmitted;
    private final ConstraintLayout rootView;

    private HomepageRatingItemUnratedBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, AjioRoundedCornerImageView ajioRoundedCornerImageView, ScaleRatingBar scaleRatingBar, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.homepageItemBrandTv = textView;
        this.homepageItemDescriptionTv = textView2;
        this.homepageItemImage = ajioRoundedCornerImageView;
        this.homepageItemRating = scaleRatingBar;
        this.homepageRatingExperience = textView3;
        this.homepageRatingSubmitted = textView4;
    }

    public static HomepageRatingItemUnratedBinding bind(View object) {
        View view;
        int n3 = R$id.homepage_item_brand_tv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.homepage_item_description_tv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.homepage_item_image;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioRoundedCornerImageView)view;
                if (object2 != null) {
                    n3 = R$id.homepage_item_rating;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ScaleRatingBar)view;
                    if (object3 != null) {
                        n3 = R$id.homepage_rating_experience;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.homepage_rating_submitted;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                Object object4 = object;
                                object4 = (ConstraintLayout)((Object)object);
                                HomepageRatingItemUnratedBinding homepageRatingItemUnratedBinding = new HomepageRatingItemUnratedBinding((ConstraintLayout)((Object)object4), (TextView)view2, (TextView)view3, (AjioRoundedCornerImageView)((Object)object2), (ScaleRatingBar)((Object)object3), (TextView)view4, (TextView)view5);
                                return homepageRatingItemUnratedBinding;
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

    public static HomepageRatingItemUnratedBinding inflate(LayoutInflater layoutInflater) {
        return HomepageRatingItemUnratedBinding.inflate(layoutInflater, null, false);
    }

    public static HomepageRatingItemUnratedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.homepage_rating_item_unrated;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomepageRatingItemUnratedBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

