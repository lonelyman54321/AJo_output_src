/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Space
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.ril.ajio.R$layout;

public final class LayoutFsSpaceBinding
implements BC3 {
    private final Space rootView;

    private LayoutFsSpaceBinding(Space space) {
        this.rootView = space;
    }

    public static LayoutFsSpaceBinding bind(View object) {
        if (object != null) {
            object = (Space)object;
            LayoutFsSpaceBinding layoutFsSpaceBinding = new LayoutFsSpaceBinding((Space)object);
            return layoutFsSpaceBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutFsSpaceBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFsSpaceBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFsSpaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_fs_space;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFsSpaceBinding.bind((View)layoutInflater);
    }

    public Space getRoot() {
        return this.rootView;
    }
}

