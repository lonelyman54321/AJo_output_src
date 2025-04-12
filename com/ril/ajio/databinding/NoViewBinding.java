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

public final class NoViewBinding
implements BC3 {
    private final LinearLayout rootView;

    private NoViewBinding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static NoViewBinding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            NoViewBinding noViewBinding = new NoViewBinding((LinearLayout)object);
            return noViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static NoViewBinding inflate(LayoutInflater layoutInflater) {
        return NoViewBinding.inflate(layoutInflater, null, false);
    }

    public static NoViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.no_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NoViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

