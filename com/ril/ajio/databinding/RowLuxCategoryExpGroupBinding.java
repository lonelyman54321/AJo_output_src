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

public final class RowLuxCategoryExpGroupBinding
implements BC3 {
    public final ConstraintLayout mainLayout;
    private final ConstraintLayout rootView;
    public final View rowCategoryExpDivider;
    public final ImageView rowCategoryExpImvCategory;
    public final ImageView rowCategoryExpImvPlus;
    public final AjioTextView rowCategoryExpTvTitle;

    private RowLuxCategoryExpGroupBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ImageView imageView, ImageView imageView2, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.mainLayout = constraintLayout2;
        this.rowCategoryExpDivider = view;
        this.rowCategoryExpImvCategory = imageView;
        this.rowCategoryExpImvPlus = imageView2;
        this.rowCategoryExpTvTitle = ajioTextView;
    }

    public static RowLuxCategoryExpGroupBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.main_layout;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.row_category_exp_divider, object)) != null) {
            n3 = R$id.row_category_exp_imv_category;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.row_category_exp_imv_plus;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (ImageView)view2;
                if (view4 != null) {
                    n3 = R$id.row_category_exp_tv_title;
                    Object object3 = view2 = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view2;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (ConstraintLayout)((Object)object);
                        RowLuxCategoryExpGroupBinding rowLuxCategoryExpGroupBinding = new RowLuxCategoryExpGroupBinding((ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object2), view, (ImageView)view3, (ImageView)view4, (AjioTextView)object3);
                        return rowLuxCategoryExpGroupBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowLuxCategoryExpGroupBinding inflate(LayoutInflater layoutInflater) {
        return RowLuxCategoryExpGroupBinding.inflate(layoutInflater, null, false);
    }

    public static RowLuxCategoryExpGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_lux_category_exp_group;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowLuxCategoryExpGroupBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

