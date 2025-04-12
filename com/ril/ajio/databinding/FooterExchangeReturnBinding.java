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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;

public final class FooterExchangeReturnBinding
implements BC3 {
    public final AjioButton doneButton;
    public final AjioButton resetButton;
    private final LinearLayout rootView;

    private FooterExchangeReturnBinding(LinearLayout linearLayout, AjioButton ajioButton, AjioButton ajioButton2) {
        this.rootView = linearLayout;
        this.doneButton = ajioButton;
        this.resetButton = ajioButton2;
    }

    public static FooterExchangeReturnBinding bind(View object) {
        AjioButton ajioButton;
        int n3 = R$id.done_button;
        AjioButton ajioButton2 = (AjioButton)dd2_2.a(n3, object);
        if (ajioButton2 != null && (ajioButton = (AjioButton)dd2_2.a(n3 = R$id.reset_button, object)) != null) {
            object = (LinearLayout)object;
            FooterExchangeReturnBinding footerExchangeReturnBinding = new FooterExchangeReturnBinding((LinearLayout)object, ajioButton2, ajioButton);
            return footerExchangeReturnBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FooterExchangeReturnBinding inflate(LayoutInflater layoutInflater) {
        return FooterExchangeReturnBinding.inflate(layoutInflater, null, false);
    }

    public static FooterExchangeReturnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.footer_exchange_return;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterExchangeReturnBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

