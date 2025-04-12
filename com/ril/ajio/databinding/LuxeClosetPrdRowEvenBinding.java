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

public final class LuxeClosetPrdRowEvenBinding
implements BC3 {
    private final LinearLayout rootView;

    private LuxeClosetPrdRowEvenBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static LuxeClosetPrdRowEvenBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            LuxeClosetPrdRowEvenBinding luxeClosetPrdRowEvenBinding = new LuxeClosetPrdRowEvenBinding((LinearLayout)object);
            return luxeClosetPrdRowEvenBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LuxeClosetPrdRowEvenBinding inflate(LayoutInflater layoutInflater) {
        return LuxeClosetPrdRowEvenBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeClosetPrdRowEvenBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_closet_prd_row_even;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeClosetPrdRowEvenBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

