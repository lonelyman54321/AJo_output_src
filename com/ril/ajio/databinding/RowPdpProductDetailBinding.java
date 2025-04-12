/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowPdpProductDetailBinding
implements BC3 {
    public final LinearLayout descriptionContainer;
    public final View divider4;
    public final LinearLayout parentProductDetails;
    private final LinearLayout rootView;
    public final ImageView rowPdpDescriptionImvMoreInfo;
    public final ImageView rowPdpDescriptionImvOtherInfo;
    public final LinearLayout rowPdpDescriptionLayoutDisclosure;
    public final LinearLayout rowPdpDescriptionLayoutDynamic;
    public final RelativeLayout rowPdpDescriptionLayoutOtherInfo;
    public final AjioTextView rowPdpDescriptionTvMoreLess;
    public final AjioTextView rowPdpDescriptionTvOtherInfo;

    private RowPdpProductDetailBinding(LinearLayout linearLayout, LinearLayout linearLayout2, View view, LinearLayout linearLayout3, ImageView imageView, ImageView imageView2, LinearLayout linearLayout4, LinearLayout linearLayout5, RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.descriptionContainer = linearLayout2;
        this.divider4 = view;
        this.parentProductDetails = linearLayout3;
        this.rowPdpDescriptionImvMoreInfo = imageView;
        this.rowPdpDescriptionImvOtherInfo = imageView2;
        this.rowPdpDescriptionLayoutDisclosure = linearLayout4;
        this.rowPdpDescriptionLayoutDynamic = linearLayout5;
        this.rowPdpDescriptionLayoutOtherInfo = relativeLayout;
        this.rowPdpDescriptionTvMoreLess = ajioTextView;
        this.rowPdpDescriptionTvOtherInfo = ajioTextView2;
    }

    public static RowPdpProductDetailBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.description_container;
        View view3 = view2 = dd2_2.a(n3, object);
        view3 = (LinearLayout)view2;
        if (view3 != null && (view = dd2_2.a(n3 = R$id.divider4, object)) != null) {
            Object object2 = object;
            object2 = (LinearLayout)object;
            n3 = R$id.row_pdp_description_imv_more_info;
            View view4 = view2 = dd2_2.a(n3, object);
            view4 = (ImageView)view2;
            if (view4 != null) {
                n3 = R$id.row_pdp_description_imv_other_info;
                View view5 = view2 = dd2_2.a(n3, object);
                view5 = (ImageView)view2;
                if (view5 != null) {
                    n3 = R$id.row_pdp_description_layout_disclosure;
                    View view6 = view2 = dd2_2.a(n3, object);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n3 = R$id.row_pdp_description_layout_dynamic;
                        View view7 = view2 = dd2_2.a(n3, object);
                        view7 = (LinearLayout)view2;
                        if (view7 != null) {
                            n3 = R$id.row_pdp_description_layout_other_info;
                            View view8 = view2 = dd2_2.a(n3, object);
                            view8 = (RelativeLayout)view2;
                            if (view8 != null) {
                                n3 = R$id.row_pdp_description_tv_more_less;
                                Object object3 = view2 = dd2_2.a(n3, object);
                                object3 = (AjioTextView)view2;
                                if (object3 != null) {
                                    n3 = R$id.row_pdp_description_tv_other_info;
                                    Object object4 = view2 = dd2_2.a(n3, object);
                                    object4 = (AjioTextView)view2;
                                    if (object4 != null) {
                                        object = new RowPdpProductDetailBinding((LinearLayout)object2, (LinearLayout)view3, view, (LinearLayout)object2, (ImageView)view4, (ImageView)view5, (LinearLayout)view6, (LinearLayout)view7, (RelativeLayout)view8, (AjioTextView)object3, (AjioTextView)object4);
                                        return object;
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

    public static RowPdpProductDetailBinding inflate(LayoutInflater layoutInflater) {
        return RowPdpProductDetailBinding.inflate(layoutInflater, null, false);
    }

    public static RowPdpProductDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pdp_product_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPdpProductDetailBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

