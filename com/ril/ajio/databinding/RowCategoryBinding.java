/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowCategoryBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowCategory;
    public final View rowCategoryDivider;
    public final AjioImageView rowCategoryExpImvNext;
    public final AjioImageView rowCategoryImv;
    public final AjioTextView rowCategoryTvTitle;

    private RowCategoryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.rowCategory = constraintLayout2;
        this.rowCategoryDivider = view;
        this.rowCategoryExpImvNext = ajioImageView;
        this.rowCategoryImv = ajioImageView2;
        this.rowCategoryTvTitle = ajioTextView;
    }

    public static RowCategoryBinding bind(View object) {
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.row_category_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            View view2;
            n3 = R$id.row_category_exp_imv_next;
            Object object3 = view2 = dd2_2.a(n3, object);
            object3 = (AjioImageView)view2;
            if (object3 != null) {
                n3 = R$id.row_category_imv;
                Object object4 = view2 = dd2_2.a(n3, object);
                object4 = (AjioImageView)view2;
                if (object4 != null) {
                    n3 = R$id.row_category_tv_title;
                    Object object5 = view2 = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        Object object6 = object;
                        view2 = object2;
                        object = new RowCategoryBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), view, (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (AjioTextView)object5);
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

    public static RowCategoryBinding inflate(LayoutInflater layoutInflater) {
        return RowCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static RowCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCategoryBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

