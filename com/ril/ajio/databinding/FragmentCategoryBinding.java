/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.ViewCategoryBinding;
import com.ril.ajio.databinding.ViewLuxCategoryBinding;

public final class FragmentCategoryBinding
implements BC3 {
    public final AjioLoaderView categoryProgressView;
    private final FrameLayout rootView;
    public final ViewCategoryBinding viewCategory;
    public final ViewLuxCategoryBinding viewLuxCategory;

    private FragmentCategoryBinding(FrameLayout frameLayout, AjioLoaderView ajioLoaderView, ViewCategoryBinding viewCategoryBinding, ViewLuxCategoryBinding viewLuxCategoryBinding) {
        this.rootView = frameLayout;
        this.categoryProgressView = ajioLoaderView;
        this.viewCategory = viewCategoryBinding;
        this.viewLuxCategory = viewLuxCategoryBinding;
    }

    public static FragmentCategoryBinding bind(View object) {
        Object object2;
        Object object3;
        int n3 = R$id.category_progress_view;
        AjioLoaderView ajioLoaderView = (AjioLoaderView)dd2_2.a(n3, object);
        if (ajioLoaderView != null && (object3 = dd2_2.a(n3 = R$id.view_category, object)) != null) {
            object2 = ViewCategoryBinding.bind(object3);
            int n4 = R$id.view_lux_category;
            Object object4 = dd2_2.a(n4, object);
            if (object4 != null) {
                object3 = ViewLuxCategoryBinding.bind(object4);
                object = (FrameLayout)object;
                object4 = new FragmentCategoryBinding((FrameLayout)object, ajioLoaderView, (ViewCategoryBinding)object2, (ViewLuxCategoryBinding)object3);
                return object4;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static FragmentCategoryBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCategoryBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

