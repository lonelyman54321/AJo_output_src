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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class HomepageRatedAllProductsBinding
implements BC3 {
    public final TextView ratedThanksMsg;
    public final TextView ratedTitleMsg;
    public final ImageView ratingDone;
    private final ConstraintLayout rootView;

    private HomepageRatedAllProductsBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ImageView imageView) {
        this.rootView = constraintLayout;
        this.ratedThanksMsg = textView;
        this.ratedTitleMsg = textView2;
        this.ratingDone = imageView;
    }

    public static HomepageRatedAllProductsBinding bind(View object) {
        ImageView imageView;
        TextView textView;
        int n3 = R$id.rated_thanks_msg;
        TextView textView2 = (TextView)dd2_2.a(n3, object);
        if (textView2 != null && (textView = (TextView)dd2_2.a(n3 = R$id.rated_title_msg, object)) != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.rating_done, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            HomepageRatedAllProductsBinding homepageRatedAllProductsBinding = new HomepageRatedAllProductsBinding((ConstraintLayout)((Object)object), textView2, textView, imageView);
            return homepageRatedAllProductsBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HomepageRatedAllProductsBinding inflate(LayoutInflater layoutInflater) {
        return HomepageRatedAllProductsBinding.inflate(layoutInflater, null, false);
    }

    public static HomepageRatedAllProductsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.homepage_rated_all_products;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomepageRatedAllProductsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

