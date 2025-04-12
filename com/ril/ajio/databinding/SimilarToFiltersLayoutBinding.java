/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class SimilarToFiltersLayoutBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final RecyclerView similarToSizeRv;
    public final AjioTextView sizeTitle;

    private SimilarToFiltersLayoutBinding(RelativeLayout relativeLayout, RecyclerView recyclerView, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.similarToSizeRv = recyclerView;
        this.sizeTitle = ajioTextView;
    }

    public static SimilarToFiltersLayoutBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.similar_to_size_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.size_title, object)) != null) {
            object = (RelativeLayout)object;
            SimilarToFiltersLayoutBinding similarToFiltersLayoutBinding = new SimilarToFiltersLayoutBinding((RelativeLayout)object, recyclerView, ajioTextView);
            return similarToFiltersLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SimilarToFiltersLayoutBinding inflate(LayoutInflater layoutInflater) {
        return SimilarToFiltersLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static SimilarToFiltersLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.similar_to_filters_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SimilarToFiltersLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

