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

public final class CardReturnToExchangeBinding
implements BC3 {
    public final ImageView imgError;
    public final AjioTextView initExchangeInReturn;
    private final CardView rootView;
    public final AjioTextView tvMessage;

    private CardReturnToExchangeBinding(CardView cardView, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = cardView;
        this.imgError = imageView;
        this.initExchangeInReturn = ajioTextView;
        this.tvMessage = ajioTextView2;
    }

    public static CardReturnToExchangeBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.imgError;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.init_exchange_in_return, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tvMessage, object)) != null) {
            object = (CardView)((Object)object);
            CardReturnToExchangeBinding cardReturnToExchangeBinding = new CardReturnToExchangeBinding((CardView)((Object)object), imageView, ajioTextView2, ajioTextView);
            return cardReturnToExchangeBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CardReturnToExchangeBinding inflate(LayoutInflater layoutInflater) {
        return CardReturnToExchangeBinding.inflate(layoutInflater, null, false);
    }

    public static CardReturnToExchangeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.card_return_to_exchange;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CardReturnToExchangeBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

