/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxePriceRangeBottomsheetViewBinding
implements BC3 {
    public final View priceFacetBottomsheetDividerView;
    public final AjioTextView priceFacetBottomsheetDoneTv;
    public final TextInputEditText priceFacetBottomsheetMaxEt;
    public final LinearLayout priceFacetBottomsheetMaxLayout;
    public final TextInputEditText priceFacetBottomsheetMinEt;
    public final LinearLayout priceFacetBottomsheetMinLayout;
    public final AjioTextView priceFacetBottomsheetTitleTv;
    public final FrameLayout priceFacetCancelLayout;
    private final LinearLayout rootView;

    private LuxePriceRangeBottomsheetViewBinding(LinearLayout linearLayout, View view, AjioTextView ajioTextView, TextInputEditText textInputEditText, LinearLayout linearLayout2, TextInputEditText textInputEditText2, LinearLayout linearLayout3, AjioTextView ajioTextView2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.priceFacetBottomsheetDividerView = view;
        this.priceFacetBottomsheetDoneTv = ajioTextView;
        this.priceFacetBottomsheetMaxEt = textInputEditText;
        this.priceFacetBottomsheetMaxLayout = linearLayout2;
        this.priceFacetBottomsheetMinEt = textInputEditText2;
        this.priceFacetBottomsheetMinLayout = linearLayout3;
        this.priceFacetBottomsheetTitleTv = ajioTextView2;
        this.priceFacetCancelLayout = frameLayout;
    }

    public static LuxePriceRangeBottomsheetViewBinding bind(View object) {
        int n3 = R$id.price_facet_bottomsheet_divider_view;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.price_facet_bottomsheet_done_tv;
            Object object3 = object2 = dd2_2.a(n3, object);
            object3 = (AjioTextView)object2;
            if (object3 != null) {
                n3 = R$id.price_facet_bottomsheet_max_et;
                Object object4 = object2 = dd2_2.a(n3, object);
                object4 = (TextInputEditText)object2;
                if (object4 != null) {
                    n3 = R$id.price_facet_bottomsheet_max_layout;
                    View view2 = object2 = dd2_2.a(n3, object);
                    view2 = (LinearLayout)object2;
                    if (view2 != null) {
                        n3 = R$id.price_facet_bottomsheet_min_et;
                        Object object5 = object2 = dd2_2.a(n3, object);
                        object5 = (TextInputEditText)object2;
                        if (object5 != null) {
                            n3 = R$id.price_facet_bottomsheet_min_layout;
                            View view3 = object2 = dd2_2.a(n3, object);
                            view3 = (LinearLayout)object2;
                            if (view3 != null) {
                                n3 = R$id.price_facet_bottomsheet_title_tv;
                                Object object6 = object2 = dd2_2.a(n3, object);
                                object6 = (AjioTextView)object2;
                                if (object6 != null) {
                                    n3 = R$id.price_facet_cancel_layout;
                                    View view4 = object2 = dd2_2.a(n3, object);
                                    view4 = (FrameLayout)object2;
                                    if (view4 != null) {
                                        LuxePriceRangeBottomsheetViewBinding luxePriceRangeBottomsheetViewBinding;
                                        Object object7 = object;
                                        object7 = (LinearLayout)object;
                                        object2 = luxePriceRangeBottomsheetViewBinding;
                                        luxePriceRangeBottomsheetViewBinding = new LuxePriceRangeBottomsheetViewBinding((LinearLayout)object7, view, (AjioTextView)object3, (TextInputEditText)object4, (LinearLayout)view2, (TextInputEditText)object5, (LinearLayout)view3, (AjioTextView)object6, (FrameLayout)view4);
                                        return luxePriceRangeBottomsheetViewBinding;
                                    }
                                }
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

    public static LuxePriceRangeBottomsheetViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxePriceRangeBottomsheetViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePriceRangeBottomsheetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_price_range_bottomsheet_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePriceRangeBottomsheetViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

