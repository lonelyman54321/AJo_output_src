/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;

public final class ItemImageBinding
implements BC3 {
    public final CardView cvProduct;
    public final AjioImageView imvProduct;
    private final CardView rootView;

    private ItemImageBinding(CardView cardView, CardView cardView2, AjioImageView ajioImageView) {
        this.rootView = cardView;
        this.cvProduct = cardView2;
        this.imvProduct = ajioImageView;
    }

    public static ItemImageBinding bind(View object) {
        Object object2 = object;
        object2 = (CardView)((Object)object);
        int n3 = R$id.imvProduct;
        AjioImageView ajioImageView = (AjioImageView)dd2_2.a(n3, object);
        if (ajioImageView != null) {
            object = new ItemImageBinding((CardView)((Object)object2), (CardView)((Object)object2), ajioImageView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ItemImageBinding inflate(LayoutInflater layoutInflater) {
        return ItemImageBinding.inflate(layoutInflater, null, false);
    }

    public static ItemImageBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.item_image;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ItemImageBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

