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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpColorViewLuxeBinding
implements BC3 {
    public final CardView myCardView;
    private final LinearLayout rootView;
    public final LinearLayout rowPdpColor;
    public final ImageView rowProductDetailImvColor;

    private PdpColorViewLuxeBinding(LinearLayout linearLayout, CardView cardView, LinearLayout linearLayout2, ImageView imageView) {
        this.rootView = linearLayout;
        this.myCardView = cardView;
        this.rowPdpColor = linearLayout2;
        this.rowProductDetailImvColor = imageView;
    }

    public static PdpColorViewLuxeBinding bind(View object) {
        Object object2;
        int n3 = R$id.myCardView;
        CardView cardView = (CardView)dd2_2.a(n3, object);
        if (cardView != null) {
            object2 = object;
            object2 = (LinearLayout)object;
            int n4 = R$id.row_product_detail_imv_color;
            ImageView imageView = (ImageView)dd2_2.a(n4, object);
            if (imageView != null) {
                object = new PdpColorViewLuxeBinding((LinearLayout)object2, cardView, (LinearLayout)object2, imageView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static PdpColorViewLuxeBinding inflate(LayoutInflater layoutInflater) {
        return PdpColorViewLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static PdpColorViewLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_color_view_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpColorViewLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

