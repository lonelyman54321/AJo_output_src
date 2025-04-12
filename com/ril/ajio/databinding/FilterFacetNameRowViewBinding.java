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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FilterFacetNameRowViewBinding
implements BC3 {
    public final AjioTextView facetRowNameTv;
    public final AjioTextView facetRowNumTv;
    public final AjioAspectRatioImageView facetRowSelectedIv;
    private final RelativeLayout rootView;

    private FilterFacetNameRowViewBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioAspectRatioImageView ajioAspectRatioImageView) {
        this.rootView = relativeLayout;
        this.facetRowNameTv = ajioTextView;
        this.facetRowNumTv = ajioTextView2;
        this.facetRowSelectedIv = ajioAspectRatioImageView;
    }

    public static FilterFacetNameRowViewBinding bind(View object) {
        AjioAspectRatioImageView ajioAspectRatioImageView;
        AjioTextView ajioTextView;
        int n3 = R$id.facet_row_name_tv;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.facet_row_num_tv, object)) != null && (ajioAspectRatioImageView = (AjioAspectRatioImageView)dd2_2.a(n3 = R$id.facet_row_selected_iv, object)) != null) {
            object = (RelativeLayout)object;
            FilterFacetNameRowViewBinding filterFacetNameRowViewBinding = new FilterFacetNameRowViewBinding((RelativeLayout)object, ajioTextView2, ajioTextView, ajioAspectRatioImageView);
            return filterFacetNameRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FilterFacetNameRowViewBinding inflate(LayoutInflater layoutInflater) {
        return FilterFacetNameRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static FilterFacetNameRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.filter_facet_name_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FilterFacetNameRowViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

