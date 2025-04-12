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

public final class RowCategoryExpGroupBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final View rowCategoryExpDivider;
    public final ConstraintLayout rowCategoryExpGroup;
    public final ImageView rowCategoryExpImvIndicator;
    public final AjioTextView rowCategoryExpTvSubtitle;
    public final AjioTextView rowCategoryExpTvTitle;

    private RowCategoryExpGroupBinding(ConstraintLayout constraintLayout, View view, ConstraintLayout constraintLayout2, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.rowCategoryExpDivider = view;
        this.rowCategoryExpGroup = constraintLayout2;
        this.rowCategoryExpImvIndicator = imageView;
        this.rowCategoryExpTvSubtitle = ajioTextView;
        this.rowCategoryExpTvTitle = ajioTextView2;
    }

    public static RowCategoryExpGroupBinding bind(View object) {
        int n3 = R$id.row_category_exp_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            n3 = R$id.row_category_exp_imv_indicator;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.row_category_exp_tv_subtitle;
                Object object3 = view2 = dd2_2.a(n3, object);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.row_category_exp_tv_title;
                    Object object4 = view2 = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        view2 = object;
                        object = new RowCategoryExpGroupBinding((ConstraintLayout)((Object)object2), view, (ConstraintLayout)((Object)object2), (ImageView)view3, (AjioTextView)object3, (AjioTextView)object4);
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

    public static RowCategoryExpGroupBinding inflate(LayoutInflater layoutInflater) {
        return RowCategoryExpGroupBinding.inflate(layoutInflater, null, false);
    }

    public static RowCategoryExpGroupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_category_exp_group;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCategoryExpGroupBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

