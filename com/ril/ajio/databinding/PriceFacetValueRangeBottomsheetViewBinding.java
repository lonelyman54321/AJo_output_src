/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PriceFacetValueRangeBottomsheetViewBinding
implements BC3 {
    public final View priceFacetBottomsheetDividerView;
    public final AjioTextView priceFacetBottomsheetDoneTv;
    public final EditText priceFacetBottomsheetMaxEt;
    public final AjioTextView priceFacetBottomsheetMaxTv;
    public final EditText priceFacetBottomsheetMinEt;
    public final AjioTextView priceFacetBottomsheetMinTv;
    public final AjioTextView priceFacetBottomsheetTitleTv;
    public final FrameLayout priceFacetCancelLayout;
    private final LinearLayout rootView;

    private PriceFacetValueRangeBottomsheetViewBinding(LinearLayout linearLayout, View view, AjioTextView ajioTextView, EditText editText, AjioTextView ajioTextView2, EditText editText2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.priceFacetBottomsheetDividerView = view;
        this.priceFacetBottomsheetDoneTv = ajioTextView;
        this.priceFacetBottomsheetMaxEt = editText;
        this.priceFacetBottomsheetMaxTv = ajioTextView2;
        this.priceFacetBottomsheetMinEt = editText2;
        this.priceFacetBottomsheetMinTv = ajioTextView3;
        this.priceFacetBottomsheetTitleTv = ajioTextView4;
        this.priceFacetCancelLayout = frameLayout;
    }

    public static PriceFacetValueRangeBottomsheetViewBinding bind(View object) {
        int n3 = R$id.price_facet_bottomsheet_divider_view;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.price_facet_bottomsheet_done_tv;
            Object object3 = object2 = dd2_2.a(n3, object);
            object3 = (AjioTextView)object2;
            if (object3 != null) {
                n3 = R$id.price_facet_bottomsheet_max_et;
                View view2 = object2 = dd2_2.a(n3, object);
                view2 = (EditText)object2;
                if (view2 != null) {
                    n3 = R$id.price_facet_bottomsheet_max_tv;
                    Object object4 = object2 = dd2_2.a(n3, object);
                    object4 = (AjioTextView)object2;
                    if (object4 != null) {
                        n3 = R$id.price_facet_bottomsheet_min_et;
                        View view3 = object2 = dd2_2.a(n3, object);
                        view3 = (EditText)object2;
                        if (view3 != null) {
                            n3 = R$id.price_facet_bottomsheet_min_tv;
                            Object object5 = object2 = dd2_2.a(n3, object);
                            object5 = (AjioTextView)object2;
                            if (object5 != null) {
                                n3 = R$id.price_facet_bottomsheet_title_tv;
                                Object object6 = object2 = dd2_2.a(n3, object);
                                object6 = (AjioTextView)object2;
                                if (object6 != null) {
                                    n3 = R$id.price_facet_cancel_layout;
                                    View view4 = object2 = dd2_2.a(n3, object);
                                    view4 = (FrameLayout)object2;
                                    if (view4 != null) {
                                        PriceFacetValueRangeBottomsheetViewBinding priceFacetValueRangeBottomsheetViewBinding;
                                        Object object7 = object;
                                        object7 = (LinearLayout)object;
                                        object2 = priceFacetValueRangeBottomsheetViewBinding;
                                        priceFacetValueRangeBottomsheetViewBinding = new PriceFacetValueRangeBottomsheetViewBinding((LinearLayout)object7, view, (AjioTextView)object3, (EditText)view2, (AjioTextView)object4, (EditText)view3, (AjioTextView)object5, (AjioTextView)object6, (FrameLayout)view4);
                                        return priceFacetValueRangeBottomsheetViewBinding;
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

    public static PriceFacetValueRangeBottomsheetViewBinding inflate(LayoutInflater layoutInflater) {
        return PriceFacetValueRangeBottomsheetViewBinding.inflate(layoutInflater, null, false);
    }

    public static PriceFacetValueRangeBottomsheetViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.price_facet_value_range_bottomsheet_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PriceFacetValueRangeBottomsheetViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

