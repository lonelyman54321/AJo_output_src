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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class SubRowComponentSpaceBinding
implements BC3 {
    private final LinearLayout rootView;
    public final FrameLayout subRowComponentSpace;

    private SubRowComponentSpaceBinding(LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.subRowComponentSpace = frameLayout;
    }

    public static SubRowComponentSpaceBinding bind(View object) {
        int n3 = R$id.sub_row_component_space;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null) {
            object = (LinearLayout)object;
            SubRowComponentSpaceBinding subRowComponentSpaceBinding = new SubRowComponentSpaceBinding((LinearLayout)object, frameLayout);
            return subRowComponentSpaceBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SubRowComponentSpaceBinding inflate(LayoutInflater layoutInflater) {
        return SubRowComponentSpaceBinding.inflate(layoutInflater, null, false);
    }

    public static SubRowComponentSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.sub_row_component_space;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SubRowComponentSpaceBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

