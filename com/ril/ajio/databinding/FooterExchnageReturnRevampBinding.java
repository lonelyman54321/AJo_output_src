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

public final class FooterExchnageReturnRevampBinding
implements BC3 {
    public final AjioTextView btnSaveFullWidth;
    public final AjioTextView doneButton;
    public final AjioTextView resetButton;
    private final CardView rootView;

    private FooterExchnageReturnRevampBinding(CardView cardView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = cardView;
        this.btnSaveFullWidth = ajioTextView;
        this.doneButton = ajioTextView2;
        this.resetButton = ajioTextView3;
    }

    public static FooterExchnageReturnRevampBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.btnSaveFullWidth;
        AjioTextView ajioTextView3 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView3 != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.done_button, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.reset_button, object)) != null) {
            object = (CardView)((Object)object);
            FooterExchnageReturnRevampBinding footerExchnageReturnRevampBinding = new FooterExchnageReturnRevampBinding((CardView)((Object)object), ajioTextView3, ajioTextView2, ajioTextView);
            return footerExchnageReturnRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FooterExchnageReturnRevampBinding inflate(LayoutInflater layoutInflater) {
        return FooterExchnageReturnRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FooterExchnageReturnRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.footer_exchnage_return_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterExchnageReturnRevampBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

