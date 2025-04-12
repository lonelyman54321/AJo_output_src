/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class TabLuxCategoryBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView tabLblSlash;
    public final AjioTextView tabTvText;

    private TabLuxCategoryBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.tabLblSlash = ajioTextView;
        this.tabTvText = ajioTextView2;
    }

    public static TabLuxCategoryBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.tab_lbl_slash;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tab_tv_text, object)) != null) {
            object = (LinearLayout)object;
            TabLuxCategoryBinding tabLuxCategoryBinding = new TabLuxCategoryBinding((LinearLayout)object, ajioTextView2, ajioTextView);
            return tabLuxCategoryBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TabLuxCategoryBinding inflate(LayoutInflater layoutInflater) {
        return TabLuxCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static TabLuxCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.tab_lux_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TabLuxCategoryBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

