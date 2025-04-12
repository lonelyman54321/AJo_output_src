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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.NoSimilarProductFoundLayoutBinding;

public final class SimilarItemsErrorBottomSheetFragmentsBinding
implements BC3 {
    public final ImageView closeCrossBtn;
    public final FrameLayout crossCancelView;
    public final NoSimilarProductFoundLayoutBinding includeNoSimilar;
    private final ConstraintLayout rootView;

    private SimilarItemsErrorBottomSheetFragmentsBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, NoSimilarProductFoundLayoutBinding noSimilarProductFoundLayoutBinding) {
        this.rootView = constraintLayout;
        this.closeCrossBtn = imageView;
        this.crossCancelView = frameLayout;
        this.includeNoSimilar = noSimilarProductFoundLayoutBinding;
    }

    public static SimilarItemsErrorBottomSheetFragmentsBinding bind(View object) {
        Object object2;
        FrameLayout frameLayout;
        int n3 = R$id.close_cross_btn;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.cross_cancel_view, object)) != null && (object2 = dd2_2.a(n3 = R$id.include_no_similar, object)) != null) {
            NoSimilarProductFoundLayoutBinding noSimilarProductFoundLayoutBinding = NoSimilarProductFoundLayoutBinding.bind(object2);
            object = (ConstraintLayout)((Object)object);
            object2 = new SimilarItemsErrorBottomSheetFragmentsBinding((ConstraintLayout)((Object)object), imageView, frameLayout, noSimilarProductFoundLayoutBinding);
            return object2;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SimilarItemsErrorBottomSheetFragmentsBinding inflate(LayoutInflater layoutInflater) {
        return SimilarItemsErrorBottomSheetFragmentsBinding.inflate(layoutInflater, null, false);
    }

    public static SimilarItemsErrorBottomSheetFragmentsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.similar_items_error_bottom_sheet_fragments;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SimilarItemsErrorBottomSheetFragmentsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

