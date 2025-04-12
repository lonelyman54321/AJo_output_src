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

public final class FooterExchageReturnTwoButtonBinding
implements BC3 {
    public final AjioTextView doneButtonReturn;
    public final AjioTextView resetButtonReturn;
    private final CardView rootView;

    private FooterExchageReturnTwoButtonBinding(CardView cardView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = cardView;
        this.doneButtonReturn = ajioTextView;
        this.resetButtonReturn = ajioTextView2;
    }

    public static FooterExchageReturnTwoButtonBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.done_button_return;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.reset_button_return, object)) != null) {
            object = (CardView)((Object)object);
            FooterExchageReturnTwoButtonBinding footerExchageReturnTwoButtonBinding = new FooterExchageReturnTwoButtonBinding((CardView)((Object)object), ajioTextView2, ajioTextView);
            return footerExchageReturnTwoButtonBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FooterExchageReturnTwoButtonBinding inflate(LayoutInflater layoutInflater) {
        return FooterExchageReturnTwoButtonBinding.inflate(layoutInflater, null, false);
    }

    public static FooterExchageReturnTwoButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.footer_exchage_return_two_button;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterExchageReturnTwoButtonBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

