/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PriceFacetValueRangeRowViewBinding
implements BC3 {
    public final AjioTextView priceFacetValueRangeClearTv;
    public final LinearLayout priceFacetValueRangeLayout;
    public final TextView priceFacetValueRangeMaxTv;
    public final TextView priceFacetValueRangeMinTv;
    private final LinearLayout rootView;

    private PriceFacetValueRangeRowViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.priceFacetValueRangeClearTv = ajioTextView;
        this.priceFacetValueRangeLayout = linearLayout2;
        this.priceFacetValueRangeMaxTv = textView;
        this.priceFacetValueRangeMinTv = textView2;
    }

    public static PriceFacetValueRangeRowViewBinding bind(View object) {
        View view;
        int n3 = R$id.price_facet_value_range_clear_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.price_facet_value_range_layout;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.price_facet_value_range_max_tv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.price_facet_value_range_min_tv;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        Object object3 = object;
                        object3 = (LinearLayout)object;
                        PriceFacetValueRangeRowViewBinding priceFacetValueRangeRowViewBinding = new PriceFacetValueRangeRowViewBinding((LinearLayout)object3, (AjioTextView)object2, (LinearLayout)view2, (TextView)view3, (TextView)view4);
                        return priceFacetValueRangeRowViewBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PriceFacetValueRangeRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PriceFacetValueRangeRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PriceFacetValueRangeRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.price_facet_value_range_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PriceFacetValueRangeRowViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

