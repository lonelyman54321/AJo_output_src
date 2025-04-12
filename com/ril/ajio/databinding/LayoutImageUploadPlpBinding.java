/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutImageUploadPlpBinding
implements BC3 {
    public final Button btnUploadedImageAction;
    public final ConstraintLayout containerProgressBar;
    public final CardView cvUploadedImageContainer;
    public final View imageShadow;
    public final ImageView ivCancel;
    public final ImageView ivUploadError;
    public final ImageView ivUploadImage;
    public final ProgressBar progressBar;
    public final ProgressBar progressBarVerify;
    private final CardView rootView;
    public final TextView tvMessage;
    public final TextView tvProgress;
    public final TextView tvTitle;

    private LayoutImageUploadPlpBinding(CardView cardView, Button button, ConstraintLayout constraintLayout, CardView cardView2, View view, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar, ProgressBar progressBar2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.btnUploadedImageAction = button;
        this.containerProgressBar = constraintLayout;
        this.cvUploadedImageContainer = cardView2;
        this.imageShadow = view;
        this.ivCancel = imageView;
        this.ivUploadError = imageView2;
        this.ivUploadImage = imageView3;
        this.progressBar = progressBar;
        this.progressBarVerify = progressBar2;
        this.tvMessage = textView;
        this.tvProgress = textView2;
        this.tvTitle = textView3;
    }

    public static LayoutImageUploadPlpBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.btn_uploaded_image_action;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Button)view2;
        if (view3 != null) {
            n3 = R$id.container_progress_bar;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (ConstraintLayout)view2;
            if (object2 != null) {
                View view4;
                n3 = R$id.cv_uploaded_image_container;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (CardView)view2;
                if (object3 != null && (view4 = dd2_2.a(n3 = R$id.image_shadow, view)) != null) {
                    n3 = R$id.iv_cancel;
                    View view5 = view2 = dd2_2.a(n3, view);
                    view5 = (ImageView)view2;
                    if (view5 != null) {
                        n3 = R$id.iv_upload_error;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (ImageView)view2;
                        if (view6 != null) {
                            n3 = R$id.iv_upload_image;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (ImageView)view2;
                            if (view7 != null) {
                                n3 = R$id.progress_bar;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (ProgressBar)view2;
                                if (view8 != null) {
                                    n3 = R$id.progress_bar_verify;
                                    View view9 = view2 = dd2_2.a(n3, view);
                                    view9 = (ProgressBar)view2;
                                    if (view9 != null) {
                                        n3 = R$id.tv_message;
                                        View view10 = view2 = dd2_2.a(n3, view);
                                        view10 = (TextView)view2;
                                        if (view10 != null) {
                                            n3 = R$id.tv_progress;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (TextView)view2;
                                            if (view11 != null) {
                                                n3 = R$id.tv_title;
                                                View view12 = view2 = dd2_2.a(n3, view);
                                                view12 = (TextView)view2;
                                                if (view12 != null) {
                                                    Object object4 = view;
                                                    object4 = (CardView)view;
                                                    LayoutImageUploadPlpBinding layoutImageUploadPlpBinding = new LayoutImageUploadPlpBinding((CardView)((Object)object4), (Button)view3, (ConstraintLayout)((Object)object2), (CardView)((Object)object3), view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (ProgressBar)view8, (ProgressBar)view9, (TextView)view10, (TextView)view11, (TextView)view12);
                                                    return layoutImageUploadPlpBinding;
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

    public static LayoutImageUploadPlpBinding inflate(LayoutInflater layoutInflater) {
        return LayoutImageUploadPlpBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutImageUploadPlpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_image_upload_plp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutImageUploadPlpBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

