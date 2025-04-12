/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentCustomerReviewPhotosBinding
implements BC3 {
    public final ComposeView bottomsheetCompose;
    public final FrameLayout cancelContainer;
    public final ImageView imCancelBtn;
    public final LinearLayout linearLayout1;
    private final ConstraintLayout rootView;
    public final View viewContainer;

    private FragmentCustomerReviewPhotosBinding(ConstraintLayout constraintLayout, ComposeView composeView, FrameLayout frameLayout, ImageView imageView, LinearLayout linearLayout, View view) {
        this.rootView = constraintLayout;
        this.bottomsheetCompose = composeView;
        this.cancelContainer = frameLayout;
        this.imCancelBtn = imageView;
        this.linearLayout1 = linearLayout;
        this.viewContainer = view;
    }

    public static FragmentCustomerReviewPhotosBinding bind(View object) {
        View view;
        int n3 = R$id.bottomsheet_compose;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ComposeView)view;
        if (object2 != null) {
            n3 = R$id.cancelContainer;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (FrameLayout)view;
            if (view2 != null) {
                n3 = R$id.im_cancelBtn;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    View view4;
                    n3 = R$id.linearLayout1;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (LinearLayout)view;
                    if (view5 != null && (view4 = dd2_2.a(n3 = R$id.view_container, object)) != null) {
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        FragmentCustomerReviewPhotosBinding fragmentCustomerReviewPhotosBinding = new FragmentCustomerReviewPhotosBinding((ConstraintLayout)((Object)object3), (ComposeView)((Object)object2), (FrameLayout)view2, (ImageView)view3, (LinearLayout)view5, view4);
                        return fragmentCustomerReviewPhotosBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentCustomerReviewPhotosBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCustomerReviewPhotosBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCustomerReviewPhotosBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_customer_review_photos;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCustomerReviewPhotosBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

