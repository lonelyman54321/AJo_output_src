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

public final class LuxeToolbarEmiBinding
implements BC3 {
    public final Toolbar pesdkToolbar;
    public final AjioTextView pesdkToolbarTitleTv;
    private final Toolbar rootView;

    private LuxeToolbarEmiBinding(Toolbar toolbar, Toolbar toolbar2, AjioTextView ajioTextView) {
        this.rootView = toolbar;
        this.pesdkToolbar = toolbar2;
        this.pesdkToolbarTitleTv = ajioTextView;
    }

    public static LuxeToolbarEmiBinding bind(View object) {
        Object object2 = object;
        object2 = (Toolbar)object;
        int n3 = R$id.pesdk_toolbar_title_tv;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = new LuxeToolbarEmiBinding((Toolbar)object2, (Toolbar)object2, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LuxeToolbarEmiBinding inflate(LayoutInflater layoutInflater) {
        return LuxeToolbarEmiBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeToolbarEmiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_toolbar_emi;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeToolbarEmiBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

