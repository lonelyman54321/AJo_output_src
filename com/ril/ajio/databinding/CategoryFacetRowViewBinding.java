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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CategoryFacetRowViewBinding
implements BC3 {
    public final AjioTextView categoryFacetRowTv;
    private final ConstraintLayout rootView;

    private CategoryFacetRowViewBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.categoryFacetRowTv = ajioTextView;
    }

    public static CategoryFacetRowViewBinding bind(View object) {
        int n3 = R$id.category_facet_row_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (ConstraintLayout)((Object)object);
            CategoryFacetRowViewBinding categoryFacetRowViewBinding = new CategoryFacetRowViewBinding((ConstraintLayout)((Object)object), ajioTextView);
            return categoryFacetRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CategoryFacetRowViewBinding inflate(LayoutInflater layoutInflater) {
        return CategoryFacetRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static CategoryFacetRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.category_facet_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CategoryFacetRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

