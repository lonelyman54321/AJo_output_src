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

public final class FragmentPecheckoutBinding
implements BC3 {
    private final LinearLayout rootView;

    private FragmentPecheckoutBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static FragmentPecheckoutBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            FragmentPecheckoutBinding fragmentPecheckoutBinding = new FragmentPecheckoutBinding((LinearLayout)object);
            return fragmentPecheckoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static FragmentPecheckoutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentPecheckoutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentPecheckoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_pecheckout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentPecheckoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

