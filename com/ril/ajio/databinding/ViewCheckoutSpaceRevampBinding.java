/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ril.ajio.R$layout;

public final class ViewCheckoutSpaceRevampBinding
implements BC3 {
    private final TextView rootView;

    private ViewCheckoutSpaceRevampBinding(TextView textView) {
        this.rootView = textView;
    }

    public static ViewCheckoutSpaceRevampBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            ViewCheckoutSpaceRevampBinding viewCheckoutSpaceRevampBinding = new ViewCheckoutSpaceRevampBinding((TextView)object);
            return viewCheckoutSpaceRevampBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ViewCheckoutSpaceRevampBinding inflate(LayoutInflater layoutInflater) {
        return ViewCheckoutSpaceRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCheckoutSpaceRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_checkout_space_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCheckoutSpaceRevampBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

