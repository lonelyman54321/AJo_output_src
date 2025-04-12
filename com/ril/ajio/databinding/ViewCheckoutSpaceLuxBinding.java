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

public final class ViewCheckoutSpaceLuxBinding
implements BC3 {
    private final TextView rootView;

    private ViewCheckoutSpaceLuxBinding(TextView textView) {
        this.rootView = textView;
    }

    public static ViewCheckoutSpaceLuxBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            ViewCheckoutSpaceLuxBinding viewCheckoutSpaceLuxBinding = new ViewCheckoutSpaceLuxBinding((TextView)object);
            return viewCheckoutSpaceLuxBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ViewCheckoutSpaceLuxBinding inflate(LayoutInflater layoutInflater) {
        return ViewCheckoutSpaceLuxBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCheckoutSpaceLuxBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_checkout_space_lux;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCheckoutSpaceLuxBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

