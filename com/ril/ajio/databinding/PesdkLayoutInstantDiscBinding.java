/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PesdkLayoutInstantDiscBinding
implements BC3 {
    public final TextView discInfo;
    private final LinearLayout rootView;

    private PesdkLayoutInstantDiscBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.discInfo = textView;
    }

    public static PesdkLayoutInstantDiscBinding bind(View object) {
        int n3 = R$id.discInfo;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (LinearLayout)object;
            PesdkLayoutInstantDiscBinding pesdkLayoutInstantDiscBinding = new PesdkLayoutInstantDiscBinding((LinearLayout)object, textView);
            return pesdkLayoutInstantDiscBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLayoutInstantDiscBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLayoutInstantDiscBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLayoutInstantDiscBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_layout_instant_disc;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLayoutInstantDiscBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

