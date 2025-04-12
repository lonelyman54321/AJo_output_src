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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewRowProductDetailBinding
implements BC3 {
    public final LinearLayout descriptionContainer;
    public final View divider4;
    public final AjioButton moreLessTv;
    public final LinearLayout parentProductDetails;
    public final TextView productDetailsHeader;
    private final LinearLayout rootView;
    public final LinearLayout rowPdpDescriptionLayoutDisclosure;
    public final LinearLayout rowPdpDescriptionLayoutDynamic;
    public final RelativeLayout rowPdpDescriptionLayoutOtherInfo;
    public final AjioTextView rowPdpDescriptionTvOtherInfo;

    private NewRowProductDetailBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, AjioButton ajioButton, LinearLayout linearLayout3, TextView textView, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.descriptionContainer = linearLayout2;
        this.divider4 = view;
        this.moreLessTv = ajioButton;
        this.parentProductDetails = linearLayout3;
        this.productDetailsHeader = textView;
        this.rowPdpDescriptionLayoutDisclosure = linearLayout4;
        this.rowPdpDescriptionLayoutDynamic = linearLayout5;
        this.rowPdpDescriptionLayoutOtherInfo = relativeLayout;
        this.rowPdpDescriptionTvOtherInfo = ajioTextView;
    }

    public static NewRowProductDetailBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.description_container;
        View view3 = view2 = dd2_2.a(n3, object);
        view3 = (LinearLayout)view2;
        if (view3 != null && (view = dd2_2.a(n3 = R$id.divider4, object)) != null) {
            n3 = R$id.more_less_tv;
            Object object2 = view2 = dd2_2.a(n3, object);
            object2 = (AjioButton)view2;
            if (object2 != null) {
                Object object3 = object;
                object3 = (LinearLayout)object;
                n3 = R$id.product_details_header;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (TextView)view2;
                if (view4 != null) {
                    n3 = R$id.row_pdp_description_layout_disclosure;
                    View view5 = view2 = dd2_2.a(n3, object);
                    view5 = (LinearLayout)view2;
                    if (view5 != null) {
                        n3 = R$id.row_pdp_description_layout_dynamic;
                        View view6 = view2 = dd2_2.a(n3, object);
                        view6 = (LinearLayout)view2;
                        if (view6 != null) {
                            n3 = R$id.row_pdp_description_layout_other_info;
                            View view7 = view2 = dd2_2.a(n3, object);
                            view7 = (RelativeLayout)view2;
                            if (view7 != null) {
                                n3 = R$id.row_pdp_description_tv_other_info;
                                Object object4 = view2 = dd2_2.a(n3, object);
                                object4 = (AjioTextView)view2;
                                if (object4 != null) {
                                    object = new NewRowProductDetailBinding((LinearLayout)object3, (LinearLayout)view3, view, (AjioButton)object2, (LinearLayout)object3, (TextView)view4, (LinearLayout)view5, (LinearLayout)view6, (RelativeLayout)view7, (AjioTextView)object4);
                                    return object;
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

    public static NewRowProductDetailBinding inflate(LayoutInflater layoutInflater) {
        return NewRowProductDetailBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowProductDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_product_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowProductDetailBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

