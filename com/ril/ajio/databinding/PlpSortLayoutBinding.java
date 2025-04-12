/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpSortLayoutBinding
implements BC3 {
    public final LinearLayout mainLyt;
    public final FrameLayout plpSortCancelLayout;
    public final RecyclerView plpSortViewRv;
    private final LinearLayout rootView;

    private PlpSortLayoutBinding(LinearLayout linearLayout, LinearLayout linearLayout2, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.mainLyt = linearLayout2;
        this.plpSortCancelLayout = frameLayout;
        this.plpSortViewRv = recyclerView;
    }

    public static PlpSortLayoutBinding bind(View object) {
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        int n3 = R$id.main_lyt;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.plp_sort_cancel_layout, object)) != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.plp_sort_view_rv, object)) != null) {
            object = (LinearLayout)object;
            PlpSortLayoutBinding plpSortLayoutBinding = new PlpSortLayoutBinding((LinearLayout)object, linearLayout, frameLayout, recyclerView);
            return plpSortLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpSortLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PlpSortLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PlpSortLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_sort_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpSortLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

