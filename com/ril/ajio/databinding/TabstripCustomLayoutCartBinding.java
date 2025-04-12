/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;

public final class TabstripCustomLayoutCartBinding
implements BC3 {
    public final TextView countCartTab;
    public final AjioAspectRatioImageView iconCartTab;
    public final RelativeLayout llAjioTabCart;
    private final RelativeLayout rootView;

    private TabstripCustomLayoutCartBinding(RelativeLayout relativeLayout, TextView textView, AjioAspectRatioImageView ajioAspectRatioImageView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.countCartTab = textView;
        this.iconCartTab = ajioAspectRatioImageView;
        this.llAjioTabCart = relativeLayout2;
    }

    public static TabstripCustomLayoutCartBinding bind(View object) {
        AjioAspectRatioImageView ajioAspectRatioImageView;
        int n3 = R$id.count_cart_tab;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null && (ajioAspectRatioImageView = (AjioAspectRatioImageView)dd2_2.a(n3 = R$id.icon_cart_tab, object)) != null) {
            object = (RelativeLayout)object;
            TabstripCustomLayoutCartBinding tabstripCustomLayoutCartBinding = new TabstripCustomLayoutCartBinding((RelativeLayout)object, textView, ajioAspectRatioImageView, (RelativeLayout)object);
            return tabstripCustomLayoutCartBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TabstripCustomLayoutCartBinding inflate(LayoutInflater layoutInflater) {
        return TabstripCustomLayoutCartBinding.inflate(layoutInflater, null, false);
    }

    public static TabstripCustomLayoutCartBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.tabstrip_custom_layout_cart;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TabstripCustomLayoutCartBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

