/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeGeneralFacetValueRowViewBinding
implements BC3 {
    public final AjioCircularImageView generalFacetRowColorIv;
    public final ImageView generalFacetRowSelectedIv;
    public final AjioTextView generalFacetValueRowTv;
    private final LinearLayout rootView;

    private LuxeGeneralFacetValueRowViewBinding(LinearLayout linearLayout, AjioCircularImageView ajioCircularImageView, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.generalFacetRowColorIv = ajioCircularImageView;
        this.generalFacetRowSelectedIv = imageView;
        this.generalFacetValueRowTv = ajioTextView;
    }

    public static LuxeGeneralFacetValueRowViewBinding bind(View object) {
        AjioTextView ajioTextView;
        ImageView imageView;
        int n3 = R$id.general_facet_row_color_iv;
        AjioCircularImageView ajioCircularImageView = (AjioCircularImageView)dd2_2.a(n3, object);
        if (ajioCircularImageView != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.general_facet_row_selected_iv, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.general_facet_value_row_tv, object)) != null) {
            object = (LinearLayout)object;
            LuxeGeneralFacetValueRowViewBinding luxeGeneralFacetValueRowViewBinding = new LuxeGeneralFacetValueRowViewBinding((LinearLayout)object, ajioCircularImageView, imageView, ajioTextView);
            return luxeGeneralFacetValueRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeGeneralFacetValueRowViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxeGeneralFacetValueRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeGeneralFacetValueRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_general_facet_value_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeGeneralFacetValueRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

