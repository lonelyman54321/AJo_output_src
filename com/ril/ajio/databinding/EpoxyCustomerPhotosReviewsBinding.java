/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class EpoxyCustomerPhotosReviewsBinding
implements BC3 {
    public final ComposeView composeView;
    private final ConstraintLayout rootView;

    private EpoxyCustomerPhotosReviewsBinding(ConstraintLayout constraintLayout, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.composeView = composeView;
    }

    public static EpoxyCustomerPhotosReviewsBinding bind(View object) {
        int n3 = R$id.compose_view;
        ComposeView composeView = (ComposeView)dd2_2.a(n3, object);
        if (composeView != null) {
            object = (ConstraintLayout)((Object)object);
            EpoxyCustomerPhotosReviewsBinding epoxyCustomerPhotosReviewsBinding = new EpoxyCustomerPhotosReviewsBinding((ConstraintLayout)((Object)object), composeView);
            return epoxyCustomerPhotosReviewsBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static EpoxyCustomerPhotosReviewsBinding inflate(LayoutInflater layoutInflater) {
        return EpoxyCustomerPhotosReviewsBinding.inflate(layoutInflater, null, false);
    }

    public static EpoxyCustomerPhotosReviewsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.epoxy_customer_photos_reviews;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EpoxyCustomerPhotosReviewsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

