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

public final class EmptybagClosetListRowRefreshBinding
implements BC3 {
    public final ImageView productImg;
    private final CardView rootView;

    private EmptybagClosetListRowRefreshBinding(CardView cardView, ImageView imageView) {
        this.rootView = cardView;
        this.productImg = imageView;
    }

    public static EmptybagClosetListRowRefreshBinding bind(View object) {
        int n3 = R$id.productImg;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object = (CardView)((Object)object);
            EmptybagClosetListRowRefreshBinding emptybagClosetListRowRefreshBinding = new EmptybagClosetListRowRefreshBinding((CardView)((Object)object), imageView);
            return emptybagClosetListRowRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static EmptybagClosetListRowRefreshBinding inflate(LayoutInflater layoutInflater) {
        return EmptybagClosetListRowRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static EmptybagClosetListRowRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.emptybag_closet_list_row_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmptybagClosetListRowRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

