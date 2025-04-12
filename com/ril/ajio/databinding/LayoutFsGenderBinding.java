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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.LayoutFsTitleBinding;

public final class LayoutFsGenderBinding
implements BC3 {
    public final LayoutFsTitleBinding lfsgLayoutTitle;
    public final RecyclerView lfsgRvGender;
    private final ConstraintLayout rootView;

    private LayoutFsGenderBinding(ConstraintLayout constraintLayout, LayoutFsTitleBinding layoutFsTitleBinding, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.lfsgLayoutTitle = layoutFsTitleBinding;
        this.lfsgRvGender = recyclerView;
    }

    public static LayoutFsGenderBinding bind(View object) {
        Object object2;
        int n3 = R$id.lfsgLayoutTitle;
        Object object3 = dd2_2.a(n3, object);
        if (object3 != null) {
            object2 = LayoutFsTitleBinding.bind(object3);
            int n4 = R$id.lfsgRvGender;
            RecyclerView recyclerView = (RecyclerView)dd2_2.a(n4, object);
            if (recyclerView != null) {
                object = (ConstraintLayout)((Object)object);
                object3 = new LayoutFsGenderBinding((ConstraintLayout)((Object)object), (LayoutFsTitleBinding)object2, recyclerView);
                return object3;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LayoutFsGenderBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFsGenderBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFsGenderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_fs_gender;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFsGenderBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

