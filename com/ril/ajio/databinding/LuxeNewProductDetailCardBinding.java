/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeNewProductDetailCardBinding
implements BC3 {
    public final ConstraintLayout clMoreLessDetails;
    public final ConstraintLayout clProductDetails;
    public final View divider4;
    public final ConstraintLayout parentProductDetails;
    public final TextView productDetailsHeader;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final LinearLayout rowPdpDescriptionLayoutDisclosure;
    public final RelativeLayout rowPdpDescriptionLayoutOtherInfo;
    public final AjioTextView rowPdpDescriptionTvOtherInfo;
    public final AjioTextView rowPdpDetailsTvMoreLess;
    public final RecyclerView rvSection2;
    public final RecyclerView rvSection3;

    private LuxeNewProductDetailCardBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, View view, ConstraintLayout constraintLayout4, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout, RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RecyclerView recyclerView2, RecyclerView recyclerView3) {
        this.rootView = constraintLayout;
        this.clMoreLessDetails = constraintLayout2;
        this.clProductDetails = constraintLayout3;
        this.divider4 = view;
        this.parentProductDetails = constraintLayout4;
        this.productDetailsHeader = textView;
        this.recyclerView = recyclerView;
        this.rowPdpDescriptionLayoutDisclosure = linearLayout;
        this.rowPdpDescriptionLayoutOtherInfo = relativeLayout;
        this.rowPdpDescriptionTvOtherInfo = ajioTextView;
        this.rowPdpDetailsTvMoreLess = ajioTextView2;
        this.rvSection2 = recyclerView2;
        this.rvSection3 = recyclerView3;
    }

    public static LuxeNewProductDetailCardBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cl_more_less_details;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (ConstraintLayout)view2;
        if (object2 != null) {
            View view3;
            n3 = R$id.cl_product_details;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (ConstraintLayout)view2;
            if (object3 != null && (view3 = dd2_2.a(n3 = R$id.divider4, view)) != null) {
                Object object4 = view;
                object4 = (ConstraintLayout)view;
                n3 = R$id.product_details_header;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (TextView)view2;
                if (view4 != null) {
                    n3 = R$id.recycler_view;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (RecyclerView)view2;
                    if (object5 != null) {
                        n3 = R$id.row_pdp_description_layout_disclosure;
                        View view5 = view2 = dd2_2.a(n3, view);
                        view5 = (LinearLayout)view2;
                        if (view5 != null) {
                            n3 = R$id.row_pdp_description_layout_other_info;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (RelativeLayout)view2;
                            if (view6 != null) {
                                n3 = R$id.row_pdp_description_tv_other_info;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AjioTextView)view2;
                                if (object6 != null) {
                                    n3 = R$id.row_pdp_details_tv_more_less;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.rv_section2;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (RecyclerView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.rv_section3;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (RecyclerView)view2;
                                            if (object9 != null) {
                                                object = new LuxeNewProductDetailCardBinding((ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), view3, (ConstraintLayout)((Object)object4), (TextView)view4, (RecyclerView)object5, (LinearLayout)view5, (RelativeLayout)view6, (AjioTextView)object6, (AjioTextView)object7, (RecyclerView)object8, (RecyclerView)object9);
                                                return object;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeNewProductDetailCardBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewProductDetailCardBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewProductDetailCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_product_detail_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewProductDetailCardBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

