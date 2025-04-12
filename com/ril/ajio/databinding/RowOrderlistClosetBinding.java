/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowOrderlistClosetBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final RelativeLayout rowOrderlistCloset;
    public final ImageView rowOrderlistClosetImv;

    private RowOrderlistClosetBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ImageView imageView) {
        this.rootView = relativeLayout;
        this.rowOrderlistCloset = relativeLayout2;
        this.rowOrderlistClosetImv = imageView;
    }

    public static RowOrderlistClosetBinding bind(View object) {
        Object object2 = object;
        object2 = (RelativeLayout)object;
        int n3 = R$id.row_orderlist_closet_imv;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = new RowOrderlistClosetBinding((RelativeLayout)object2, (RelativeLayout)object2, imageView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowOrderlistClosetBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderlistClosetBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderlistClosetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_orderlist_closet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderlistClosetBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

