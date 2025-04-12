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

public final class LuxePlpPrdRowPriceViewBinding
implements BC3 {
    public final AjioTextView luxePlpPrdRowPriceViewTv;
    private final LinearLayout rootView;

    private LuxePlpPrdRowPriceViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.luxePlpPrdRowPriceViewTv = ajioTextView;
    }

    public static LuxePlpPrdRowPriceViewBinding bind(View object) {
        int n3 = R$id.luxe_plp_prd_row_price_view_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            LuxePlpPrdRowPriceViewBinding luxePlpPrdRowPriceViewBinding = new LuxePlpPrdRowPriceViewBinding((LinearLayout)object, ajioTextView);
            return luxePlpPrdRowPriceViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePlpPrdRowPriceViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpPrdRowPriceViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpPrdRowPriceViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_prd_row_price_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpPrdRowPriceViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

