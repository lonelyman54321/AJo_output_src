/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class BrandFacetValueTitleRowViewBinding
implements BC3 {
    public final AjioTextView brandFacetValueTitleRowTv;
    private final LinearLayout rootView;

    private BrandFacetValueTitleRowViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.brandFacetValueTitleRowTv = ajioTextView;
    }

    public static BrandFacetValueTitleRowViewBinding bind(View object) {
        int n3 = R$id.brand_facet_value_title_row_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            BrandFacetValueTitleRowViewBinding brandFacetValueTitleRowViewBinding = new BrandFacetValueTitleRowViewBinding((LinearLayout)object, ajioTextView);
            return brandFacetValueTitleRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static BrandFacetValueTitleRowViewBinding inflate(LayoutInflater layoutInflater) {
        return BrandFacetValueTitleRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static BrandFacetValueTitleRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.brand_facet_value_title_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return BrandFacetValueTitleRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

