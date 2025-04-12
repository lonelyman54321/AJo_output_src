/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ExpandableListView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ViewSubCategoryBinding
implements BC3 {
    public final RelativeLayout mainLayout;
    private final RelativeLayout rootView;
    public final CardView subCategoryCardScroll;
    public final ExpandableListView subCategoryExpandableList;

    private ViewSubCategoryBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, CardView cardView, ExpandableListView expandableListView) {
        this.rootView = relativeLayout;
        this.mainLayout = relativeLayout2;
        this.subCategoryCardScroll = cardView;
        this.subCategoryExpandableList = expandableListView;
    }

    public static ViewSubCategoryBinding bind(View object) {
        ExpandableListView expandableListView;
        Object object2 = object;
        object2 = (RelativeLayout)object;
        int n3 = R$id.sub_category_card_scroll;
        CardView cardView = (CardView)dd2_2.a(n3, object);
        if (cardView != null && (expandableListView = (ExpandableListView)dd2_2.a(n3 = R$id.sub_category_expandable_list, object)) != null) {
            object = new ViewSubCategoryBinding((RelativeLayout)object2, (RelativeLayout)object2, cardView, expandableListView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ViewSubCategoryBinding inflate(LayoutInflater layoutInflater) {
        return ViewSubCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static ViewSubCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_sub_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewSubCategoryBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

