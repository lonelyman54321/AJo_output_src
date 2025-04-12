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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentLuxSubCategoryBinding
implements BC3 {
    public final RecyclerView fragmentLuxSubCatRv;
    private final FrameLayout rootView;
    public final FrameLayout subCategoryFrame;

    private FragmentLuxSubCategoryBinding(FrameLayout frameLayout, RecyclerView recyclerView, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.fragmentLuxSubCatRv = recyclerView;
        this.subCategoryFrame = frameLayout2;
    }

    public static FragmentLuxSubCategoryBinding bind(View object) {
        FrameLayout frameLayout;
        int n3 = R$id.fragment_lux_sub_cat_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.sub_category_frame, object)) != null) {
            object = (FrameLayout)object;
            FragmentLuxSubCategoryBinding fragmentLuxSubCategoryBinding = new FragmentLuxSubCategoryBinding((FrameLayout)object, recyclerView, frameLayout);
            return fragmentLuxSubCategoryBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentLuxSubCategoryBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLuxSubCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLuxSubCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_lux_sub_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLuxSubCategoryBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

