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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CardReturnProductTagBinding
implements BC3 {
    private final CardView rootView;
    public final AjioTextView tvDontHaveProductTag;
    public final AjioTextView tvProductDetailsSubmitted;

    private CardReturnProductTagBinding(CardView cardView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = cardView;
        this.tvDontHaveProductTag = ajioTextView;
        this.tvProductDetailsSubmitted = ajioTextView2;
    }

    public static CardReturnProductTagBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.tvDontHaveProductTag;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tvProductDetailsSubmitted, object)) != null) {
            object = (CardView)((Object)object);
            CardReturnProductTagBinding cardReturnProductTagBinding = new CardReturnProductTagBinding((CardView)((Object)object), ajioTextView2, ajioTextView);
            return cardReturnProductTagBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CardReturnProductTagBinding inflate(LayoutInflater layoutInflater) {
        return CardReturnProductTagBinding.inflate(layoutInflater, null, false);
    }

    public static CardReturnProductTagBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.card_return_product_tag;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CardReturnProductTagBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

