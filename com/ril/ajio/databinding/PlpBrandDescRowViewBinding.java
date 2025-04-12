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
import com.ril.ajio.customviews.widgets.AjioEllipsisTextView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PlpBrandDescRowViewBinding
implements BC3 {
    public final AjioEllipsisTextView plpBrandDescRowTv;
    public final AjioTextView plpDescReadMoreTv;
    private final LinearLayout rootView;

    private PlpBrandDescRowViewBinding(LinearLayout linearLayout, AjioEllipsisTextView ajioEllipsisTextView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.plpBrandDescRowTv = ajioEllipsisTextView;
        this.plpDescReadMoreTv = ajioTextView;
    }

    public static PlpBrandDescRowViewBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.plp_brand_desc_row_tv;
        AjioEllipsisTextView ajioEllipsisTextView = (AjioEllipsisTextView)dd2_2.a(n3, object);
        if (ajioEllipsisTextView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.plp_desc_read_more_tv, object)) != null) {
            object = (LinearLayout)object;
            PlpBrandDescRowViewBinding plpBrandDescRowViewBinding = new PlpBrandDescRowViewBinding((LinearLayout)object, ajioEllipsisTextView, ajioTextView);
            return plpBrandDescRowViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpBrandDescRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpBrandDescRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpBrandDescRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_brand_desc_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpBrandDescRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

