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
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxToolbarBinding
implements BC3 {
    public final AppBarLayout pesdkAppBarLayout;
    public final Toolbar pesdkToolbar;
    public final AjioTextView pesdkToolbarTitleTv;
    private final AppBarLayout rootView;

    private LuxToolbarBinding(AppBarLayout appBarLayout, AppBarLayout appBarLayout2, Toolbar toolbar, AjioTextView ajioTextView) {
        this.rootView = appBarLayout;
        this.pesdkAppBarLayout = appBarLayout2;
        this.pesdkToolbar = toolbar;
        this.pesdkToolbarTitleTv = ajioTextView;
    }

    public static LuxToolbarBinding bind(View object) {
        AjioTextView ajioTextView;
        Object object2 = object;
        object2 = (AppBarLayout)object;
        int n3 = R$id.pesdk_toolbar;
        Toolbar toolbar = (Toolbar)dd2_2.a(n3, object);
        if (toolbar != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.pesdk_toolbar_title_tv, object)) != null) {
            object = new LuxToolbarBinding((AppBarLayout)object2, (AppBarLayout)object2, toolbar, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LuxToolbarBinding inflate(LayoutInflater layoutInflater) {
        return LuxToolbarBinding.inflate(layoutInflater, null, false);
    }

    public static LuxToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.lux_toolbar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxToolbarBinding.bind((View)layoutInflater);
    }

    public AppBarLayout getRoot() {
        return this.rootView;
    }
}

