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

public final class RowLuxSubCategoryChildBinding
implements BC3 {
    private final LinearLayout rootView;
    public final View rowCategoryExpDivider;
    public final RelativeLayout subCategoryChild;
    public final ImageView subCategoryChildImvNext;
    public final AjioTextView subCategoryChildTv;

    private RowLuxSubCategoryChildBinding(LinearLayout linearLayout, View view, RelativeLayout relativeLayout, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.rowCategoryExpDivider = view;
        this.subCategoryChild = relativeLayout;
        this.subCategoryChildImvNext = imageView;
        this.subCategoryChildTv = ajioTextView;
    }

    public static RowLuxSubCategoryChildBinding bind(View object) {
        int n3 = R$id.row_category_exp_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.sub_category_child;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (RelativeLayout)object2;
            if (view2 != null) {
                n3 = R$id.sub_category_child_imv_next;
                View view3 = object2 = dd2_2.a(n3, object);
                view3 = (ImageView)object2;
                if (view3 != null) {
                    n3 = R$id.sub_category_child_tv;
                    Object object3 = object2 = dd2_2.a(n3, object);
                    object3 = (AjioTextView)object2;
                    if (object3 != null) {
                        RowLuxSubCategoryChildBinding rowLuxSubCategoryChildBinding;
                        Object object4 = object;
                        object4 = (LinearLayout)object;
                        object2 = rowLuxSubCategoryChildBinding;
                        rowLuxSubCategoryChildBinding = new RowLuxSubCategoryChildBinding((LinearLayout)object4, view, (RelativeLayout)view2, (ImageView)view3, (AjioTextView)object3);
                        return rowLuxSubCategoryChildBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowLuxSubCategoryChildBinding inflate(LayoutInflater layoutInflater) {
        return RowLuxSubCategoryChildBinding.inflate(layoutInflater, null, false);
    }

    public static RowLuxSubCategoryChildBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_lux_sub_category_child;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowLuxSubCategoryChildBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

