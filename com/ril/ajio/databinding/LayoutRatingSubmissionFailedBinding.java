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
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutRatingSubmissionFailedBinding
implements BC3 {
    public final Barrier barrier;
    public final ImageView imgClose;
    private final ConstraintLayout rootView;
    public final TextView tvDescription;
    public final TextView tvTitle;

    private LayoutRatingSubmissionFailedBinding(ConstraintLayout constraintLayout, Barrier barrier, ImageView imageView, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.imgClose = imageView;
        this.tvDescription = textView;
        this.tvTitle = textView2;
    }

    public static LayoutRatingSubmissionFailedBinding bind(View object) {
        View view;
        int n3 = R$id.barrier;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (Barrier)view;
        if (view2 != null) {
            n3 = R$id.img_close;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.tv_description;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.tv_title;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        LayoutRatingSubmissionFailedBinding layoutRatingSubmissionFailedBinding = new LayoutRatingSubmissionFailedBinding((ConstraintLayout)((Object)object2), (Barrier)view2, (ImageView)view3, (TextView)view4, (TextView)view5);
                        return layoutRatingSubmissionFailedBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutRatingSubmissionFailedBinding inflate(LayoutInflater layoutInflater) {
        return LayoutRatingSubmissionFailedBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutRatingSubmissionFailedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_rating_submission_failed;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutRatingSubmissionFailedBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

