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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowSubCategorySubChildBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout rowSubCategorySubChild;
    public final ImageView subCategorySubImv;
    public final AjioTextView subCategorySubTv;

    private RowSubCategorySubChildBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.rowSubCategorySubChild = linearLayout2;
        this.subCategorySubImv = imageView;
        this.subCategorySubTv = ajioTextView;
    }

    public static RowSubCategorySubChildBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.sub_category_sub_imv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.sub_category_sub_tv, object)) != null) {
            object = new RowSubCategorySubChildBinding((LinearLayout)object2, (LinearLayout)object2, imageView, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowSubCategorySubChildBinding inflate(LayoutInflater layoutInflater) {
        return RowSubCategorySubChildBinding.inflate(layoutInflater, null, false);
    }

    public static RowSubCategorySubChildBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_sub_category_sub_child;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSubCategorySubChildBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

