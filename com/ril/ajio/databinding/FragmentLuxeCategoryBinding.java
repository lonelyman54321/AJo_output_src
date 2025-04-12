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
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.TopToolbarHomeRevampLuxeBinding;

public final class FragmentLuxeCategoryBinding
implements BC3 {
    public final ComposeView composeLuxeCategory;
    private final ConstraintLayout rootView;
    public final View shadow;
    public final TopToolbarHomeRevampLuxeBinding topToolbarLuxeLytRevamp;

    private FragmentLuxeCategoryBinding(ConstraintLayout constraintLayout, ComposeView composeView, View view, TopToolbarHomeRevampLuxeBinding topToolbarHomeRevampLuxeBinding) {
        this.rootView = constraintLayout;
        this.composeLuxeCategory = composeView;
        this.shadow = view;
        this.topToolbarLuxeLytRevamp = topToolbarHomeRevampLuxeBinding;
    }

    public static FragmentLuxeCategoryBinding bind(View object) {
        Object object2;
        View view;
        int n3 = R$id.compose_luxe_category;
        ComposeView composeView = (ComposeView)dd2_2.a(n3, object);
        if (composeView != null && (view = dd2_2.a(n3 = R$id.shadow, object)) != null && (object2 = dd2_2.a(n3 = R$id.top_toolbar_luxe_lyt_revamp, object)) != null) {
            TopToolbarHomeRevampLuxeBinding topToolbarHomeRevampLuxeBinding = TopToolbarHomeRevampLuxeBinding.bind(object2);
            object = (ConstraintLayout)((Object)object);
            object2 = new FragmentLuxeCategoryBinding((ConstraintLayout)((Object)object), composeView, view, topToolbarHomeRevampLuxeBinding);
            return object2;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentLuxeCategoryBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLuxeCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLuxeCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_luxe_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLuxeCategoryBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

