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

public final class HomeListLayoutBinding
implements BC3 {
    public final ConstraintLayout cmsParent;
    public final RecyclerView hList;
    private final ConstraintLayout rootView;

    private HomeListLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.cmsParent = constraintLayout2;
        this.hList = recyclerView;
    }

    public static HomeListLayoutBinding bind(View object) {
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.hList;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = new HomeListLayoutBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), recyclerView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static HomeListLayoutBinding inflate(LayoutInflater layoutInflater) {
        return HomeListLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static HomeListLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.home_list_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomeListLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

