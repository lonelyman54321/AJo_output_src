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
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RowSubCategoryChildBinding
implements BC3 {
    private final LinearLayout rootView;
    public final RelativeLayout subCategoryChild;
    public final ImageView subCategoryChildImvNext;
    public final ImageView subCategoryChildImvSelected;
    public final AjioNonScrollableListView subCategoryChildList;
    public final AjioTextView subCategoryChildTv;

    private RowSubCategoryChildBinding(LinearLayout linearLayout, RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, AjioNonScrollableListView ajioNonScrollableListView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.subCategoryChild = relativeLayout;
        this.subCategoryChildImvNext = imageView;
        this.subCategoryChildImvSelected = imageView2;
        this.subCategoryChildList = ajioNonScrollableListView;
        this.subCategoryChildTv = ajioTextView;
    }

    public static RowSubCategoryChildBinding bind(View object) {
        View view;
        int n3 = R$id.sub_category_child;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            n3 = R$id.sub_category_child_imv_next;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.sub_category_child_imv_selected;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.sub_category_child_list;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (AjioNonScrollableListView)view;
                    if (object2 != null) {
                        n3 = R$id.sub_category_child_tv;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioTextView)view;
                        if (object3 != null) {
                            Object object4 = object;
                            object4 = (LinearLayout)object;
                            RowSubCategoryChildBinding rowSubCategoryChildBinding = new RowSubCategoryChildBinding((LinearLayout)object4, (RelativeLayout)view2, (ImageView)view3, (ImageView)view4, (AjioNonScrollableListView)((Object)object2), (AjioTextView)object3);
                            return rowSubCategoryChildBinding;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowSubCategoryChildBinding inflate(LayoutInflater layoutInflater) {
        return RowSubCategoryChildBinding.inflate(layoutInflater, null, false);
    }

    public static RowSubCategoryChildBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_sub_category_child;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowSubCategoryChildBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

