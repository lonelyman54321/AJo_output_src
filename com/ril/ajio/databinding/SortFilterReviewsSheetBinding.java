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
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class SortFilterReviewsSheetBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final ComposeView composeSheetView;
    private final ConstraintLayout rootView;

    private SortFilterReviewsSheetBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ComposeView composeView) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.composeSheetView = composeView;
    }

    public static SortFilterReviewsSheetBinding bind(View object) {
        ComposeView composeView;
        FrameLayout frameLayout;
        int n3 = R$id.cancelBtn;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.cancelContainer, object)) != null && (composeView = (ComposeView)dd2_2.a(n3 = R$id.composeSheetView, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            SortFilterReviewsSheetBinding sortFilterReviewsSheetBinding = new SortFilterReviewsSheetBinding((ConstraintLayout)((Object)object), imageView, frameLayout, composeView);
            return sortFilterReviewsSheetBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SortFilterReviewsSheetBinding inflate(LayoutInflater layoutInflater) {
        return SortFilterReviewsSheetBinding.inflate(layoutInflater, null, false);
    }

    public static SortFilterReviewsSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.sort_filter_reviews_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SortFilterReviewsSheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

