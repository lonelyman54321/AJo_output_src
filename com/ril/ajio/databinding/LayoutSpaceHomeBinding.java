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
import com.ril.ajio.R$layout;

public final class LayoutSpaceHomeBinding
implements BC3 {
    private final FrameLayout rootView;
    public final FrameLayout space;

    private LayoutSpaceHomeBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.space = frameLayout2;
    }

    public static LayoutSpaceHomeBinding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            LayoutSpaceHomeBinding layoutSpaceHomeBinding = new LayoutSpaceHomeBinding((FrameLayout)object, (FrameLayout)object);
            return layoutSpaceHomeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutSpaceHomeBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSpaceHomeBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSpaceHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_space_home;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSpaceHomeBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

