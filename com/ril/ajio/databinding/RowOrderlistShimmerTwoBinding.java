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

public final class RowOrderlistShimmerTwoBinding
implements BC3 {
    public final CardView cardView;
    private final LinearLayout rootView;
    public final View viewFour;

    private RowOrderlistShimmerTwoBinding(LinearLayout linearLayout, CardView cardView, View view) {
        this.rootView = linearLayout;
        this.cardView = cardView;
        this.viewFour = view;
    }

    public static RowOrderlistShimmerTwoBinding bind(View object) {
        View view;
        int n3 = R$id.card_view;
        CardView cardView = (CardView)dd2_2.a(n3, object);
        if (cardView != null && (view = dd2_2.a(n3 = R$id.view_four, object)) != null) {
            object = (LinearLayout)object;
            RowOrderlistShimmerTwoBinding rowOrderlistShimmerTwoBinding = new RowOrderlistShimmerTwoBinding((LinearLayout)object, cardView, view);
            return rowOrderlistShimmerTwoBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowOrderlistShimmerTwoBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderlistShimmerTwoBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderlistShimmerTwoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_orderlist_shimmer_two;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderlistShimmerTwoBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

