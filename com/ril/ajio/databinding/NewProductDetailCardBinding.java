/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewProductDetailCardBinding
implements BC3 {
    public final ConstraintLayout clMoreLessDetails;
    public final ConstraintLayout clProductDetails;
    public final View divider4;
    public final ConstraintLayout parentProductDetails;
    public final TextView productDetailsHeader;
    public final RecyclerView recyclerView;
    private final ConstraintLayout rootView;
    public final ImageView rowPdpDetailsImvMoreDetail;
    public final AjioTextView rowPdpDetailsTvMoreLess;

    private NewProductDetailCardBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, View view, ConstraintLayout constraintLayout4, TextView textView, RecyclerView recyclerView, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.clMoreLessDetails = constraintLayout2;
        this.clProductDetails = constraintLayout3;
        this.divider4 = view;
        this.parentProductDetails = constraintLayout4;
        this.productDetailsHeader = textView;
        this.recyclerView = recyclerView;
        this.rowPdpDetailsImvMoreDetail = imageView;
        this.rowPdpDetailsTvMoreLess = ajioTextView;
    }

    public static NewProductDetailCardBinding bind(View object) {
        View view;
        int n3 = R$id.cl_more_less_details;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            View view2;
            n3 = R$id.cl_product_details;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ConstraintLayout)view;
            if (object3 != null && (view2 = dd2_2.a(n3 = R$id.divider4, object)) != null) {
                Object object4 = object;
                object4 = (ConstraintLayout)((Object)object);
                n3 = R$id.product_details_header;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.recycler_view;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (RecyclerView)view;
                    if (object5 != null) {
                        n3 = R$id.row_pdp_details_imv_more_detail;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (ImageView)view;
                        if (view4 != null) {
                            n3 = R$id.row_pdp_details_tv_more_less;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                object = new NewProductDetailCardBinding((ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), view2, (ConstraintLayout)((Object)object4), (TextView)view3, (RecyclerView)object5, (ImageView)view4, (AjioTextView)object6);
                                return object;
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

    public static NewProductDetailCardBinding inflate(LayoutInflater layoutInflater) {
        return NewProductDetailCardBinding.inflate(layoutInflater, null, false);
    }

    public static NewProductDetailCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_product_detail_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewProductDetailCardBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

