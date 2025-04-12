/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RatingWidgetViewBinding
implements BC3 {
    public final ConstraintLayout newRatingContainer;
    public final AppCompatRatingBar newRatingStar;
    public final TextView newRatingsCount;
    public final TextView newRatingsValue;
    public final LinearLayout ratingContainer;
    public final TextView ratingsCount;
    public final TextView ratingsValue;
    private final ConstraintLayout rootView;

    private RatingWidgetViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, AppCompatRatingBar appCompatRatingBar, TextView textView, TextView textView2, LinearLayout linearLayout, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.newRatingContainer = constraintLayout2;
        this.newRatingStar = appCompatRatingBar;
        this.newRatingsCount = textView;
        this.newRatingsValue = textView2;
        this.ratingContainer = linearLayout;
        this.ratingsCount = textView3;
        this.ratingsValue = textView4;
    }

    public static RatingWidgetViewBinding bind(View object) {
        View view;
        int n3 = R$id.new_rating_container;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.new_rating_star;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppCompatRatingBar)view;
            if (object3 != null) {
                n3 = R$id.new_ratings_count;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.new_ratings_value;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (TextView)view;
                    if (view3 != null) {
                        n3 = R$id.rating_container;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (LinearLayout)view;
                        if (view4 != null) {
                            n3 = R$id.ratings_count;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                n3 = R$id.ratings_value;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (TextView)view;
                                if (view6 != null) {
                                    Object object4 = object;
                                    object4 = (ConstraintLayout)((Object)object);
                                    RatingWidgetViewBinding ratingWidgetViewBinding = new RatingWidgetViewBinding((ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object2), (AppCompatRatingBar)((Object)object3), (TextView)view2, (TextView)view3, (LinearLayout)view4, (TextView)view5, (TextView)view6);
                                    return ratingWidgetViewBinding;
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

    public static RatingWidgetViewBinding inflate(LayoutInflater layoutInflater) {
        return RatingWidgetViewBinding.inflate(layoutInflater, null, false);
    }

    public static RatingWidgetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.rating_widget_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RatingWidgetViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

