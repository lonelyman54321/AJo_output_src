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

public final class LayoutFsTitleBinding
implements BC3 {
    public final TextView lfstTvTitle;
    private final TextView rootView;

    private LayoutFsTitleBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.lfstTvTitle = textView2;
    }

    public static LayoutFsTitleBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            LayoutFsTitleBinding layoutFsTitleBinding = new LayoutFsTitleBinding((TextView)object, (TextView)object);
            return layoutFsTitleBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutFsTitleBinding inflate(LayoutInflater layoutInflater) {
        return LayoutFsTitleBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutFsTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_fs_title;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutFsTitleBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

