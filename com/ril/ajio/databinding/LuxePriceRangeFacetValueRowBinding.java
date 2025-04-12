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

public final class LuxePriceRangeFacetValueRowBinding
implements BC3 {
    public final AjioTextView priceFacetValueRangeClearTv;
    public final LinearLayout priceFacetValueRangeLayout;
    public final AjioTextView priceFacetValueRangeMaxTextTv;
    public final TextView priceFacetValueRangeMaxValTv;
    public final AjioTextView priceFacetValueRangeMinTextTv;
    public final TextView priceFacetValueRangeMinValTv;
    private final LinearLayout rootView;

    private LuxePriceRangeFacetValueRowBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, AjioTextView ajioTextView2, TextView textView, AjioTextView ajioTextView3, TextView textView2) {
        this.rootView = linearLayout;
        this.priceFacetValueRangeClearTv = ajioTextView;
        this.priceFacetValueRangeLayout = linearLayout2;
        this.priceFacetValueRangeMaxTextTv = ajioTextView2;
        this.priceFacetValueRangeMaxValTv = textView;
        this.priceFacetValueRangeMinTextTv = ajioTextView3;
        this.priceFacetValueRangeMinValTv = textView2;
    }

    public static LuxePriceRangeFacetValueRowBinding bind(View object) {
        View view;
        int n3 = R$id.price_facet_value_range_clear_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.price_facet_value_range_layout;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                n3 = R$id.price_facet_value_range_max_text_tv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.price_facet_value_range_max_val_tv;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (TextView)view;
                    if (view3 != null) {
                        n3 = R$id.price_facet_value_range_min_text_tv;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            n3 = R$id.price_facet_value_range_min_val_tv;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                Object object5 = object;
                                object5 = (LinearLayout)object;
                                LuxePriceRangeFacetValueRowBinding luxePriceRangeFacetValueRowBinding = new LuxePriceRangeFacetValueRowBinding((LinearLayout)object5, (AjioTextView)object2, (LinearLayout)view2, (AjioTextView)object3, (TextView)view3, (AjioTextView)object4, (TextView)view4);
                                return luxePriceRangeFacetValueRowBinding;
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePriceRangeFacetValueRowBinding inflate(LayoutInflater layoutInflater) {
        return LuxePriceRangeFacetValueRowBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePriceRangeFacetValueRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_price_range_facet_value_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePriceRangeFacetValueRowBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

