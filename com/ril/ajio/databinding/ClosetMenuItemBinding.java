/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ClosetMenuItemBinding
implements BC3 {
    public final ImageView closetIcon;
    private final LinearLayout rootView;

    private ClosetMenuItemBinding(LinearLayout linearLayout, ImageView imageView) {
        this.rootView = linearLayout;
        this.closetIcon = imageView;
    }

    public static ClosetMenuItemBinding bind(View object) {
        int n3 = R$id.closet_icon;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (LinearLayout)object;
            ClosetMenuItemBinding closetMenuItemBinding = new ClosetMenuItemBinding((LinearLayout)object, imageView);
            return closetMenuItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ClosetMenuItemBinding inflate(LayoutInflater layoutInflater) {
        return ClosetMenuItemBinding.inflate(layoutInflater, null, false);
    }

    public static ClosetMenuItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.closet_menu_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ClosetMenuItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

