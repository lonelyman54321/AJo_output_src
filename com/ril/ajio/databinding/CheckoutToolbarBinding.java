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
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CheckoutToolbarBinding
implements BC3 {
    private final Toolbar rootView;
    public final AjioTextView toolbarTitle;

    private CheckoutToolbarBinding(Toolbar toolbar, AjioTextView ajioTextView) {
        this.rootView = toolbar;
        this.toolbarTitle = ajioTextView;
    }

    public static CheckoutToolbarBinding bind(View object) {
        int n3 = R$id.toolbar_title;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (Toolbar)object;
            CheckoutToolbarBinding checkoutToolbarBinding = new CheckoutToolbarBinding((Toolbar)object, ajioTextView);
            return checkoutToolbarBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CheckoutToolbarBinding inflate(LayoutInflater layoutInflater) {
        return CheckoutToolbarBinding.inflate(layoutInflater, null, false);
    }

    public static CheckoutToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.checkout_toolbar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CheckoutToolbarBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

