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
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;

public final class ToolbarExchangeConfirmBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioCustomToolbar toolbar;
    public final LinearLayout toolbarlayout;

    private ToolbarExchangeConfirmBinding(LinearLayout linearLayout, AjioCustomToolbar ajioCustomToolbar, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.toolbar = ajioCustomToolbar;
        this.toolbarlayout = linearLayout2;
    }

    public static ToolbarExchangeConfirmBinding bind(View object) {
        int n3 = R$id.toolbar;
        AjioCustomToolbar ajioCustomToolbar = (AjioCustomToolbar)dd2_2.a(n3, object);
        if (ajioCustomToolbar != null) {
            object = (LinearLayout)object;
            ToolbarExchangeConfirmBinding toolbarExchangeConfirmBinding = new ToolbarExchangeConfirmBinding((LinearLayout)object, ajioCustomToolbar, (LinearLayout)object);
            return toolbarExchangeConfirmBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ToolbarExchangeConfirmBinding inflate(LayoutInflater layoutInflater) {
        return ToolbarExchangeConfirmBinding.inflate(layoutInflater, null, false);
    }

    public static ToolbarExchangeConfirmBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.toolbar_exchange_confirm;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ToolbarExchangeConfirmBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

