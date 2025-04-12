/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutReturnImageBinding
implements BC3 {
    public final CardView cvImage;
    public final ImageView ivDelete;
    public final ImageView ivImage;
    public final ImageView ivRetry;
    public final ConstraintLayout layoutContainer;
    public final ProgressBar pbImageUpload;
    private final ConstraintLayout rootView;
    public final AjioTextView tvTakeImage;

    private LayoutReturnImageBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, ProgressBar progressBar, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.cvImage = cardView;
        this.ivDelete = imageView;
        this.ivImage = imageView2;
        this.ivRetry = imageView3;
        this.layoutContainer = constraintLayout2;
        this.pbImageUpload = progressBar;
        this.tvTakeImage = ajioTextView;
    }

    public static LayoutReturnImageBinding bind(View object) {
        View view;
        int n3 = R$id.cvImage;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (CardView)view;
        if (object2 != null) {
            n3 = R$id.ivDelete;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.ivImage;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.ivRetry;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (ImageView)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        n3 = R$id.pbImageUpload;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (ProgressBar)view;
                        if (view5 != null) {
                            n3 = R$id.tvTakeImage;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioTextView)view;
                            if (object4 != null) {
                                object = new LayoutReturnImageBinding((ConstraintLayout)((Object)object3), (CardView)((Object)object2), (ImageView)view2, (ImageView)view3, (ImageView)view4, (ConstraintLayout)((Object)object3), (ProgressBar)view5, (AjioTextView)object4);
                                return object;
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

    public static LayoutReturnImageBinding inflate(LayoutInflater layoutInflater) {
        return LayoutReturnImageBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutReturnImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_return_image;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutReturnImageBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

