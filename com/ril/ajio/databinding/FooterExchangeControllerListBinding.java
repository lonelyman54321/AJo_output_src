/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;

public final class FooterExchangeControllerListBinding
implements BC3 {
    public final AjioButton fragmentReturnBtnBack;
    public final AjioButton fragmentReturnBtnProceed;
    private final FrameLayout rootView;

    private FooterExchangeControllerListBinding(FrameLayout frameLayout, AjioButton ajioButton, AjioButton ajioButton2) {
        this.rootView = frameLayout;
        this.fragmentReturnBtnBack = ajioButton;
        this.fragmentReturnBtnProceed = ajioButton2;
    }

    public static FooterExchangeControllerListBinding bind(View object) {
        AjioButton ajioButton;
        int n3 = R$id.fragment_return_btn_back;
        AjioButton ajioButton2 = (AjioButton)dd2_2.a(n3, object);
        if (ajioButton2 != null && (ajioButton = (AjioButton)dd2_2.a(n3 = R$id.fragment_return_btn_proceed, object)) != null) {
            object = (FrameLayout)object;
            FooterExchangeControllerListBinding footerExchangeControllerListBinding = new FooterExchangeControllerListBinding((FrameLayout)object, ajioButton2, ajioButton);
            return footerExchangeControllerListBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FooterExchangeControllerListBinding inflate(LayoutInflater layoutInflater) {
        return FooterExchangeControllerListBinding.inflate(layoutInflater, null, false);
    }

    public static FooterExchangeControllerListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.footer_exchange_controller_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterExchangeControllerListBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

