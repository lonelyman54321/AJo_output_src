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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class TopToolbarIconsRevampLuxeBinding
implements BC3 {
    public final TextView menuCartCountTvLuxeRevamp;
    public final AppCompatImageView menuCartIv;
    public final LinearLayout menuCartLayoutLuxeRevamp;
    private final ConstraintLayout rootView;
    public final AppCompatImageView wishlistIvLuxeRevamp;

    private TopToolbarIconsRevampLuxeBinding(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, AppCompatImageView appCompatImageView2) {
        this.rootView = constraintLayout;
        this.menuCartCountTvLuxeRevamp = textView;
        this.menuCartIv = appCompatImageView;
        this.menuCartLayoutLuxeRevamp = linearLayout;
        this.wishlistIvLuxeRevamp = appCompatImageView2;
    }

    public static TopToolbarIconsRevampLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.menu_cart_count_tv_luxe_revamp;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.menu_cart_iv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view;
            if (object2 != null) {
                n3 = R$id.menu_cart_layout_luxe_revamp;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.wishlist_iv_luxe_revamp;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AppCompatImageView)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (ConstraintLayout)((Object)object);
                        TopToolbarIconsRevampLuxeBinding topToolbarIconsRevampLuxeBinding = new TopToolbarIconsRevampLuxeBinding((ConstraintLayout)((Object)object4), (TextView)view2, (AppCompatImageView)((Object)object2), (LinearLayout)view3, (AppCompatImageView)((Object)object3));
                        return topToolbarIconsRevampLuxeBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TopToolbarIconsRevampLuxeBinding inflate(LayoutInflater layoutInflater) {
        return TopToolbarIconsRevampLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static TopToolbarIconsRevampLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.top_toolbar_icons_revamp_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TopToolbarIconsRevampLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

