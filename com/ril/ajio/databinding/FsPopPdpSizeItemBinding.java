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

public final class FsPopPdpSizeItemBinding
implements BC3 {
    public final TextView fsPopUpPDPSize;
    private final TextView rootView;

    private FsPopPdpSizeItemBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.fsPopUpPDPSize = textView2;
    }

    public static FsPopPdpSizeItemBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            FsPopPdpSizeItemBinding fsPopPdpSizeItemBinding = new FsPopPdpSizeItemBinding((TextView)object, (TextView)object);
            return fsPopPdpSizeItemBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static FsPopPdpSizeItemBinding inflate(LayoutInflater layoutInflater) {
        return FsPopPdpSizeItemBinding.inflate(layoutInflater, null, false);
    }

    public static FsPopPdpSizeItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fs_pop_pdp_size_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FsPopPdpSizeItemBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

