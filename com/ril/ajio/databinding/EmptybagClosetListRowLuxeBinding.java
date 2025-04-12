/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.ril.ajio.R$layout;

public final class EmptybagClosetListRowLuxeBinding
implements BC3 {
    public final ImageView productImg;
    private final ImageView rootView;

    private EmptybagClosetListRowLuxeBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.productImg = imageView2;
    }

    public static EmptybagClosetListRowLuxeBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            EmptybagClosetListRowLuxeBinding emptybagClosetListRowLuxeBinding = new EmptybagClosetListRowLuxeBinding((ImageView)object, (ImageView)object);
            return emptybagClosetListRowLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static EmptybagClosetListRowLuxeBinding inflate(LayoutInflater layoutInflater) {
        return EmptybagClosetListRowLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static EmptybagClosetListRowLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.emptybag_closet_list_row_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmptybagClosetListRowLuxeBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

