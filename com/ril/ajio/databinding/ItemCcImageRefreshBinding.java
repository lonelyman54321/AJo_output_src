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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ItemCcImageRefreshBinding
implements BC3 {
    public final ImageView ccImage;
    private final CardView rootView;

    private ItemCcImageRefreshBinding(CardView cardView, ImageView imageView) {
        this.rootView = cardView;
        this.ccImage = imageView;
    }

    public static ItemCcImageRefreshBinding bind(View object) {
        int n3 = R$id.ccImage;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (CardView)((Object)object);
            ItemCcImageRefreshBinding itemCcImageRefreshBinding = new ItemCcImageRefreshBinding((CardView)((Object)object), imageView);
            return itemCcImageRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ItemCcImageRefreshBinding inflate(LayoutInflater layoutInflater) {
        return ItemCcImageRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static ItemCcImageRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_cc_image_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemCcImageRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

