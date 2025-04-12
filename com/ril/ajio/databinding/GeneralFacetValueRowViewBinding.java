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

public final class GeneralFacetValueRowViewBinding
implements BC3 {
    public final AjioCircularImageView generalFacetRowColorIv;
    public final LinearLayout generalFacetRowLyt;
    public final ImageView generalFacetRowSelectedIv;
    public final AjioTextView generalFacetValueRowTv;
    private final LinearLayout rootView;

    private GeneralFacetValueRowViewBinding(LinearLayout linearLayout, AjioCircularImageView ajioCircularImageView, LinearLayout linearLayout2, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.generalFacetRowColorIv = ajioCircularImageView;
        this.generalFacetRowLyt = linearLayout2;
        this.generalFacetRowSelectedIv = imageView;
        this.generalFacetValueRowTv = ajioTextView;
    }

    public static GeneralFacetValueRowViewBinding bind(View object) {
        View view;
        int n3 = R$id.general_facet_row_color_iv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioCircularImageView)view;
        if (object2 != null) {
            View view2 = object;
            view2 = (LinearLayout)object;
            n3 = R$id.general_facet_row_selected_iv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.general_facet_value_row_tv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    object = new GeneralFacetValueRowViewBinding((LinearLayout)view2, (AjioCircularImageView)((Object)object2), (LinearLayout)view2, (ImageView)view3, (AjioTextView)object3);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static GeneralFacetValueRowViewBinding inflate(LayoutInflater layoutInflater) {
        return GeneralFacetValueRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static GeneralFacetValueRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.general_facet_value_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return GeneralFacetValueRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

