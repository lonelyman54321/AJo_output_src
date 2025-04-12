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

public final class LuxePlpProductRowOddBinding
implements BC3 {
    private final LinearLayout rootView;

    private LuxePlpProductRowOddBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LuxePlpProductRowOddBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LuxePlpProductRowOddBinding luxePlpProductRowOddBinding = new LuxePlpProductRowOddBinding((LinearLayout)object);
            return luxePlpProductRowOddBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LuxePlpProductRowOddBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpProductRowOddBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpProductRowOddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_product_row_odd;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpProductRowOddBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

