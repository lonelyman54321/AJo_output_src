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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CardReturnToExchangeNewBinding
implements BC3 {
    public final ImageView imgError;
    private final CardView rootView;
    public final AjioTextView tvMessage;
    public final AjioTextView tvTryExchange;

    private CardReturnToExchangeNewBinding(CardView cardView, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = cardView;
        this.imgError = imageView;
        this.tvMessage = ajioTextView;
        this.tvTryExchange = ajioTextView2;
    }

    public static CardReturnToExchangeNewBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.imgError;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.tvMessage, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_try_exchange, object)) != null) {
            object = (CardView)((Object)object);
            CardReturnToExchangeNewBinding cardReturnToExchangeNewBinding = new CardReturnToExchangeNewBinding((CardView)((Object)object), imageView, ajioTextView2, ajioTextView);
            return cardReturnToExchangeNewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CardReturnToExchangeNewBinding inflate(LayoutInflater layoutInflater) {
        return CardReturnToExchangeNewBinding.inflate(layoutInflater, null, false);
    }

    public static CardReturnToExchangeNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.card_return_to_exchange_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CardReturnToExchangeNewBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

