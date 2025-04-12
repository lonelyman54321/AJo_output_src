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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeBrandFacetValueViewBinding
implements BC3 {
    public final AjioTextView brandFacetValueNoResultTv;
    public final AjioTextView brandFacetValueRowClearTv;
    public final RecyclerView brandFacetValueRowRv;
    public final AjioEditText brandFacetValueRowSearchEt;
    public final ImageView brandFacetValueRowSearchIv;
    public final LinearLayout brandFacetValueRowSearchLayout;
    private final LinearLayout rootView;

    private LuxeBrandFacetValueViewBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RecyclerView recyclerView, AjioEditText ajioEditText, ImageView imageView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.brandFacetValueNoResultTv = ajioTextView;
        this.brandFacetValueRowClearTv = ajioTextView2;
        this.brandFacetValueRowRv = recyclerView;
        this.brandFacetValueRowSearchEt = ajioEditText;
        this.brandFacetValueRowSearchIv = imageView;
        this.brandFacetValueRowSearchLayout = linearLayout2;
    }

    public static LuxeBrandFacetValueViewBinding bind(View object) {
        View view;
        int n3 = R$id.brand_facet_value_no_result_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.brand_facet_value_row_clear_tv;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.brand_facet_value_row_rv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.brand_facet_value_row_search_et;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioEditText)view;
                    if (object5 != null) {
                        n3 = R$id.brand_facet_value_row_search_iv;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (ImageView)view;
                        if (view2 != null) {
                            n3 = R$id.brand_facet_value_row_search_layout;
                            View view3 = view = dd2_2.a(n3, object);
                            view3 = (LinearLayout)view;
                            if (view3 != null) {
                                Object object6 = object;
                                object6 = (LinearLayout)object;
                                LuxeBrandFacetValueViewBinding luxeBrandFacetValueViewBinding = new LuxeBrandFacetValueViewBinding((LinearLayout)object6, (AjioTextView)object2, (AjioTextView)object3, (RecyclerView)object4, (AjioEditText)object5, (ImageView)view2, (LinearLayout)view3);
                                return luxeBrandFacetValueViewBinding;
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

    public static LuxeBrandFacetValueViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxeBrandFacetValueViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeBrandFacetValueViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_brand_facet_value_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeBrandFacetValueViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

