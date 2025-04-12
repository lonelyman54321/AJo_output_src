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
import androidx.constraintlayout.widget.Guideline;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class OdReviewItemBinding
implements BC3 {
    public final Guideline odReviewGuideline;
    public final TextView ratingResponse;
    public final TextView ratingType;
    private final ConstraintLayout rootView;

    private OdReviewItemBinding(ConstraintLayout constraintLayout, Guideline guideline, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.odReviewGuideline = guideline;
        this.ratingResponse = textView;
        this.ratingType = textView2;
    }

    public static OdReviewItemBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.od_review_guideline;
        Guideline guideline = (Guideline)dd2_2.a(n3, object);
        if (guideline != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.rating_response, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.rating_type, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            OdReviewItemBinding odReviewItemBinding = new OdReviewItemBinding((ConstraintLayout)((Object)object), guideline, textView2, textView);
            return odReviewItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OdReviewItemBinding inflate(LayoutInflater layoutInflater) {
        return OdReviewItemBinding.inflate(layoutInflater, null, false);
    }

    public static OdReviewItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.od_review_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OdReviewItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

