/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;

public final class TabstripCustomLayoutAjioBinding
implements BC3 {
    public final AjioAspectRatioImageView iconAjioTab;
    public final LinearLayout llAjioTabHome;
    private final LinearLayout rootView;
    public final TextView textAjioTabHome;

    private TabstripCustomLayoutAjioBinding(LinearLayout linearLayout, AjioAspectRatioImageView ajioAspectRatioImageView, LinearLayout linearLayout2, TextView textView) {
        this.rootView = linearLayout;
        this.iconAjioTab = ajioAspectRatioImageView;
        this.llAjioTabHome = linearLayout2;
        this.textAjioTabHome = textView;
    }

    public static TabstripCustomLayoutAjioBinding bind(View object) {
        Object object2;
        int n3 = R$id.icon_ajio_tab;
        AjioAspectRatioImageView ajioAspectRatioImageView = (AjioAspectRatioImageView)dd2_2.a(n3, object);
        if (ajioAspectRatioImageView != null) {
            object2 = object;
            object2 = (LinearLayout)object;
            int n4 = R$id.text_ajio_tab_home;
            TextView textView = (TextView)dd2_2.a(n4, object);
            if (textView != null) {
                object = new TabstripCustomLayoutAjioBinding((LinearLayout)object2, ajioAspectRatioImageView, (LinearLayout)object2, textView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static TabstripCustomLayoutAjioBinding inflate(LayoutInflater layoutInflater) {
        return TabstripCustomLayoutAjioBinding.inflate(layoutInflater, null, false);
    }

    public static TabstripCustomLayoutAjioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.tabstrip_custom_layout_ajio;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TabstripCustomLayoutAjioBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

