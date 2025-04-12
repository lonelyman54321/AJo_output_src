/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ExpandableListView
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLuxSubCategoryDetailBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final AjioTextView subCategoryChildTv;
    public final ExpandableListView subCategoryExpandableList;
    public final ImageView subCategoryImvBack;

    private FragmentLuxSubCategoryDetailBinding(RelativeLayout relativeLayout, AjioTextView ajioTextView, ExpandableListView expandableListView, ImageView imageView) {
        this.rootView = relativeLayout;
        this.subCategoryChildTv = ajioTextView;
        this.subCategoryExpandableList = expandableListView;
        this.subCategoryImvBack = imageView;
    }

    public static FragmentLuxSubCategoryDetailBinding bind(View object) {
        ImageView imageView;
        ExpandableListView expandableListView;
        int n3 = R$id.sub_category_child_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null && (expandableListView = (ExpandableListView)dd2_2.a(n3 = R$id.sub_category_expandable_list, object)) != null && (imageView = (ImageView)dd2_2.a(n3 = R$id.sub_category_imv_back, object)) != null) {
            object = (RelativeLayout)object;
            FragmentLuxSubCategoryDetailBinding fragmentLuxSubCategoryDetailBinding = new FragmentLuxSubCategoryDetailBinding((RelativeLayout)object, ajioTextView, expandableListView, imageView);
            return fragmentLuxSubCategoryDetailBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentLuxSubCategoryDetailBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLuxSubCategoryDetailBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLuxSubCategoryDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_lux_sub_category_detail;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLuxSubCategoryDetailBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

