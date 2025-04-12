/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowImageSearchCategoryBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowCategory;
    public final TextView tvTitle;

    private RowImageSearchCategoryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.rowCategory = constraintLayout2;
        this.tvTitle = textView;
    }

    public static RowImageSearchCategoryBinding bind(View object) {
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.tv_title;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = new RowImageSearchCategoryBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), textView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowImageSearchCategoryBinding inflate(LayoutInflater layoutInflater) {
        return RowImageSearchCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static RowImageSearchCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_image_search_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowImageSearchCategoryBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

