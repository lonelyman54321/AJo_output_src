/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowLuxSubCategoryBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowCategory;
    public final View rowCategoryDivider;
    public final ImageView rowCategoryImvNext;
    public final AjioTextView rowCategoryLblNew;
    public final AjioTextView rowCategoryTvTitle;

    private RowLuxSubCategoryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.rowCategory = constraintLayout2;
        this.rowCategoryDivider = view;
        this.rowCategoryImvNext = imageView;
        this.rowCategoryLblNew = ajioTextView;
        this.rowCategoryTvTitle = ajioTextView2;
    }

    public static RowLuxSubCategoryBinding bind(View object) {
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.row_category_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            n3 = R$id.row_category_imv_next;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.row_category_lbl_new;
                Object object3 = view2 = dd2_2.a(n3, object);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.row_category_tv_title;
                    Object object4 = view2 = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        Object object5 = object;
                        view2 = object2;
                        object = new RowLuxSubCategoryBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), view, (ImageView)view3, (AjioTextView)object3, (AjioTextView)object4);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowLuxSubCategoryBinding inflate(LayoutInflater layoutInflater) {
        return RowLuxSubCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static RowLuxSubCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_lux_sub_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowLuxSubCategoryBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

