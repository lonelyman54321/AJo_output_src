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
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTouchInterceptRecyclerView;

public final class ItemRowAjiogramProductsPdpBinding
implements BC3 {
    public final LinearLayout ajiogramProductsLayout;
    public final AppCompatImageView ivButton;
    public final AppCompatImageView ivTitle;
    public final LinearLayout layoutButton;
    public final LinearLayout layoutTitle;
    private final LinearLayout rootView;
    public final AjioTouchInterceptRecyclerView rvAjiogramProducts;
    public final TextView tvButton;
    public final TextView tvTitle;
    public final View viewLine;

    private ItemRowAjiogramProductsPdpBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout3, LinearLayout linearLayout4, AjioTouchInterceptRecyclerView ajioTouchInterceptRecyclerView, TextView textView, TextView textView2, View view) {
        this.rootView = linearLayout;
        this.ajiogramProductsLayout = linearLayout2;
        this.ivButton = appCompatImageView;
        this.ivTitle = appCompatImageView2;
        this.layoutButton = linearLayout3;
        this.layoutTitle = linearLayout4;
        this.rvAjiogramProducts = ajioTouchInterceptRecyclerView;
        this.tvButton = textView;
        this.tvTitle = textView2;
        this.viewLine = view;
    }

    public static ItemRowAjiogramProductsPdpBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (LinearLayout)object;
        int n3 = R$id.iv_button;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            n3 = R$id.iv_title;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AppCompatImageView)view;
            if (object3 != null) {
                n3 = R$id.layout_button;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.layout_title;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (LinearLayout)view;
                    if (view4 != null) {
                        n3 = R$id.rv_ajiogram_products;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTouchInterceptRecyclerView)view;
                        if (object4 != null) {
                            n3 = R$id.tv_button;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                View view6;
                                n3 = R$id.tv_title;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (TextView)view;
                                if (view7 != null && (view6 = dd2_2.a(n3 = R$id.view_line, object)) != null) {
                                    Object object5 = object;
                                    view = view2;
                                    object = new ItemRowAjiogramProductsPdpBinding((LinearLayout)view2, (LinearLayout)view2, (AppCompatImageView)((Object)object2), (AppCompatImageView)((Object)object3), (LinearLayout)view3, (LinearLayout)view4, (AjioTouchInterceptRecyclerView)object4, (TextView)view5, (TextView)view7, view6);
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

    public static ItemRowAjiogramProductsPdpBinding inflate(LayoutInflater layoutInflater) {
        return ItemRowAjiogramProductsPdpBinding.inflate(layoutInflater, null, false);
    }

    public static ItemRowAjiogramProductsPdpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_row_ajiogram_products_pdp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemRowAjiogramProductsPdpBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

