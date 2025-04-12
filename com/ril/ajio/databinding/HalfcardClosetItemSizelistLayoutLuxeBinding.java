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

public final class HalfcardClosetItemSizelistLayoutLuxeBinding
implements BC3 {
    public final TextView closetSizeItemTv;
    private final TextView rootView;

    private HalfcardClosetItemSizelistLayoutLuxeBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.closetSizeItemTv = textView2;
    }

    public static HalfcardClosetItemSizelistLayoutLuxeBinding bind(View object) {
        if (object != null) {
            object = (TextView)object;
            HalfcardClosetItemSizelistLayoutLuxeBinding halfcardClosetItemSizelistLayoutLuxeBinding = new HalfcardClosetItemSizelistLayoutLuxeBinding((TextView)object, (TextView)object);
            return halfcardClosetItemSizelistLayoutLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static HalfcardClosetItemSizelistLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return HalfcardClosetItemSizelistLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static HalfcardClosetItemSizelistLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.halfcard_closet_item_sizelist_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HalfcardClosetItemSizelistLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public TextView getRoot() {
        return this.rootView;
    }
}

