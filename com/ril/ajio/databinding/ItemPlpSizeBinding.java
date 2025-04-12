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

public final class ItemPlpSizeBinding
implements BC3 {
    private final TextView rootView;

    private ItemPlpSizeBinding(TextView textView) {
        this.rootView = textView;
    }

    public static ItemPlpSizeBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            ItemPlpSizeBinding itemPlpSizeBinding = new ItemPlpSizeBinding((TextView)object);
            return itemPlpSizeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ItemPlpSizeBinding inflate(LayoutInflater layoutInflater) {
        return ItemPlpSizeBinding.inflate(layoutInflater, null, false);
    }

    public static ItemPlpSizeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_plp_size;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemPlpSizeBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

