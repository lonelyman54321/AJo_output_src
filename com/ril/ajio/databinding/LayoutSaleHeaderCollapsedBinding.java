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

public final class LayoutSaleHeaderCollapsedBinding
implements BC3 {
    public final LinearLayout collapsedHeaderContainer;
    public final TextView collapsedInfoTV;
    public final AppCompatImageView collapsedSaleIV;
    private final LinearLayout rootView;

    private LayoutSaleHeaderCollapsedBinding(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayout;
        this.collapsedHeaderContainer = linearLayout2;
        this.collapsedInfoTV = textView;
        this.collapsedSaleIV = appCompatImageView;
    }

    public static LayoutSaleHeaderCollapsedBinding bind(View object) {
        AppCompatImageView appCompatImageView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.collapsedInfoTV;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (appCompatImageView = (AppCompatImageView)dd2_2.a(n3 = R$id.collapsedSaleIV, object)) != null) {
            object = new LayoutSaleHeaderCollapsedBinding((LinearLayout)object2, (LinearLayout)object2, textView, appCompatImageView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutSaleHeaderCollapsedBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSaleHeaderCollapsedBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSaleHeaderCollapsedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_header_collapsed;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSaleHeaderCollapsedBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

