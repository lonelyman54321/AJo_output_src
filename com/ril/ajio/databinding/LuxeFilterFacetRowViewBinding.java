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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeFilterFacetRowViewBinding
implements BC3 {
    public final AjioTextView facetRowNameTv;
    public final AjioTextView facetRowNumTv;
    public final CardView facetRowSelectedIv;
    private final RelativeLayout rootView;

    private LuxeFilterFacetRowViewBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, CardView cardView) {
        this.rootView = relativeLayout;
        this.facetRowNameTv = ajioTextView;
        this.facetRowNumTv = ajioTextView2;
        this.facetRowSelectedIv = cardView;
    }

    public static LuxeFilterFacetRowViewBinding bind(View object) {
        CardView cardView;
        AjioTextView ajioTextView;
        int n3 = R$id.facet_row_name_tv;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.facet_row_num_tv, object)) != null && (cardView = (CardView)dd2_2.a(n3 = R$id.facet_row_selected_iv, object)) != null) {
            object = (RelativeLayout)object;
            LuxeFilterFacetRowViewBinding luxeFilterFacetRowViewBinding = new LuxeFilterFacetRowViewBinding((RelativeLayout)object, ajioTextView2, ajioTextView, cardView);
            return luxeFilterFacetRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeFilterFacetRowViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxeFilterFacetRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeFilterFacetRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_filter_facet_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeFilterFacetRowViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

