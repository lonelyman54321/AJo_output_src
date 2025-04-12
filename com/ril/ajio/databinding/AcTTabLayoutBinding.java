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

public final class AcTTabLayoutBinding
implements BC3 {
    public final TextView acTab1;
    private final TextView rootView;

    private AcTTabLayoutBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.acTab1 = textView2;
    }

    public static AcTTabLayoutBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            AcTTabLayoutBinding acTTabLayoutBinding = new AcTTabLayoutBinding((TextView)object, (TextView)object);
            return acTTabLayoutBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static AcTTabLayoutBinding inflate(LayoutInflater layoutInflater) {
        return AcTTabLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static AcTTabLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ac_t_tab_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AcTTabLayoutBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

