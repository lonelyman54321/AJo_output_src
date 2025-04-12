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
import com.ril.ajio.R$layout;

public final class LayoutSpaceBinding
implements BC3 {
    public final View lsSpace;
    private final View rootView;

    private LayoutSpaceBinding(View view, View view2) {
        this.rootView = view;
        this.lsSpace = view2;
    }

    public static LayoutSpaceBinding bind(View object) {
        if (object != null) {
            LayoutSpaceBinding layoutSpaceBinding = new LayoutSpaceBinding((View)object, (View)object);
            return layoutSpaceBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutSpaceBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSpaceBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_space;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSpaceBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

