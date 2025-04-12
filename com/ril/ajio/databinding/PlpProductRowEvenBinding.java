/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$layout;

public final class PlpProductRowEvenBinding
implements BC3 {
    public final LinearLayout llEven;
    private final LinearLayout rootView;

    private PlpProductRowEvenBinding(LinearLayout linearLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.llEven = linearLayout2;
    }

    public static PlpProductRowEvenBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            PlpProductRowEvenBinding plpProductRowEvenBinding = new PlpProductRowEvenBinding((LinearLayout)object, (LinearLayout)object);
            return plpProductRowEvenBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PlpProductRowEvenBinding inflate(LayoutInflater layoutInflater) {
        return PlpProductRowEvenBinding.inflate(layoutInflater, null, false);
    }

    public static PlpProductRowEvenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_product_row_even;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpProductRowEvenBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

