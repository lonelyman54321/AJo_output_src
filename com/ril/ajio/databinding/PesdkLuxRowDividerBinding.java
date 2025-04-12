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

public final class PesdkLuxRowDividerBinding
implements BC3 {
    private final FrameLayout rootView;

    private PesdkLuxRowDividerBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static PesdkLuxRowDividerBinding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            PesdkLuxRowDividerBinding pesdkLuxRowDividerBinding = new PesdkLuxRowDividerBinding((FrameLayout)object);
            return pesdkLuxRowDividerBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PesdkLuxRowDividerBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowDividerBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_divider;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowDividerBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

