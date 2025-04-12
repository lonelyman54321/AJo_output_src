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

public final class RowComponentOrderFooterRevampBinding
implements BC3 {
    public final CardView rcofrCardView;
    private final LinearLayout rootView;
    public final LinearLayout rowComponentOrderFooter;

    private RowComponentOrderFooterRevampBinding(LinearLayout linearLayout, CardView cardView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.rcofrCardView = cardView;
        this.rowComponentOrderFooter = linearLayout2;
    }

    public static RowComponentOrderFooterRevampBinding bind(View object) {
        int n3 = R$id.rcofrCardView;
        CardView cardView = (CardView)dd2_2.a(n3, object);
        if (cardView != null) {
            object = (LinearLayout)object;
            RowComponentOrderFooterRevampBinding rowComponentOrderFooterRevampBinding = new RowComponentOrderFooterRevampBinding((LinearLayout)object, cardView, (LinearLayout)object);
            return rowComponentOrderFooterRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowComponentOrderFooterRevampBinding inflate(LayoutInflater layoutInflater) {
        return RowComponentOrderFooterRevampBinding.inflate(layoutInflater, null, false);
    }

    public static RowComponentOrderFooterRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_component_order_footer_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowComponentOrderFooterRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

