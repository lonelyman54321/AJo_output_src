/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;

public final class NewRowPdpColorBinding
implements BC3 {
    public final CardView myCardView;
    private final LinearLayout rootView;
    public final LinearLayout rowPdpColor;
    public final AjioCircularImageView rowProductDetailImvColor;

    private NewRowPdpColorBinding(LinearLayout linearLayout, CardView cardView, LinearLayout linearLayout2, AjioCircularImageView ajioCircularImageView) {
        this.rootView = linearLayout;
        this.myCardView = cardView;
        this.rowPdpColor = linearLayout2;
        this.rowProductDetailImvColor = ajioCircularImageView;
    }

    public static NewRowPdpColorBinding bind(View object) {
        Object object2;
        int n3 = R$id.myCardView;
        CardView cardView = (CardView)dd2_2.a(n3, object);
        if (cardView != null) {
            object2 = object;
            object2 = (LinearLayout)object;
            int n4 = R$id.row_product_detail_imv_color;
            AjioCircularImageView ajioCircularImageView = (AjioCircularImageView)dd2_2.a(n4, object);
            if (ajioCircularImageView != null) {
                object = new NewRowPdpColorBinding((LinearLayout)object2, cardView, (LinearLayout)object2, ajioCircularImageView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static NewRowPdpColorBinding inflate(LayoutInflater layoutInflater) {
        return NewRowPdpColorBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowPdpColorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_pdp_color;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowPdpColorBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

