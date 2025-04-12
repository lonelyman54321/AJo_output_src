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

public final class QuickviewListItemRowLuxeBinding
implements BC3 {
    public final ImageView qvImage;
    private final ImageView rootView;

    private QuickviewListItemRowLuxeBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.qvImage = imageView2;
    }

    public static QuickviewListItemRowLuxeBinding bind(View object) {
        if (object != null) {
            object = (ImageView)object;
            QuickviewListItemRowLuxeBinding quickviewListItemRowLuxeBinding = new QuickviewListItemRowLuxeBinding((ImageView)object, (ImageView)object);
            return quickviewListItemRowLuxeBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static QuickviewListItemRowLuxeBinding inflate(LayoutInflater layoutInflater) {
        return QuickviewListItemRowLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static QuickviewListItemRowLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.quickview_list_item_row_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return QuickviewListItemRowLuxeBinding.bind((View)layoutInflater);
    }

    public ImageView getRoot() {
        return this.rootView;
    }
}

