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
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class NewCollapsingNaigationItemBinding
implements BC3 {
    public final AppCompatImageView navBanner;
    public final LinearLayout navHeaderLL;
    public final View navView;
    private final LinearLayout rootView;

    private NewCollapsingNaigationItemBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, LinearLayout linearLayout2, View view) {
        this.rootView = linearLayout;
        this.navBanner = appCompatImageView;
        this.navHeaderLL = linearLayout2;
        this.navView = view;
    }

    public static NewCollapsingNaigationItemBinding bind(View object) {
        Object object2;
        int n3 = R$id.navBanner;
        AppCompatImageView appCompatImageView = (AppCompatImageView)dd2_2.a(n3, object);
        if (appCompatImageView != null) {
            object2 = object;
            object2 = (LinearLayout)object;
            int n4 = R$id.navView;
            View view = dd2_2.a(n4, object);
            if (view != null) {
                object = new NewCollapsingNaigationItemBinding((LinearLayout)object2, appCompatImageView, (LinearLayout)object2, view);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static NewCollapsingNaigationItemBinding inflate(LayoutInflater layoutInflater) {
        return NewCollapsingNaigationItemBinding.inflate(layoutInflater, null, false);
    }

    public static NewCollapsingNaigationItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_collapsing_naigation_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewCollapsingNaigationItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

