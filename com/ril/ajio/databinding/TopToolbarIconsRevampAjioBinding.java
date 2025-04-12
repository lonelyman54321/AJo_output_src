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

public final class TopToolbarIconsRevampAjioBinding
implements BC3 {
    public final TextView menuCartCountTvAjioRevamp;
    public final AppCompatImageView menuCartIv;
    public final LinearLayout menuCartLayoutAjioRevamp;
    public final AppCompatImageView menuNotificationIvAjioRevamp;
    public final ConstraintLayout menuNotificationLayoutAjioRevamp;
    public final TextView menuNotificationTvAjioRevamp;
    private final ConstraintLayout rootView;
    public final AppCompatImageView wishlistIvAjioRevamp;

    private TopToolbarIconsRevampAjioBinding(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, LinearLayout linearLayout, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, TextView textView2, AppCompatImageView appCompatImageView3) {
        this.rootView = constraintLayout;
        this.menuCartCountTvAjioRevamp = textView;
        this.menuCartIv = appCompatImageView;
        this.menuCartLayoutAjioRevamp = linearLayout;
        this.menuNotificationIvAjioRevamp = appCompatImageView2;
        this.menuNotificationLayoutAjioRevamp = constraintLayout2;
        this.menuNotificationTvAjioRevamp = textView2;
        this.wishlistIvAjioRevamp = appCompatImageView3;
    }

    public static TopToolbarIconsRevampAjioBinding bind(View object) {
        View view;
        int n3 = R$id.menu_cart_count_tv_ajio_revamp;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.menu_cart_iv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view;
            if (object2 != null) {
                n3 = R$id.menu_cart_layout_ajio_revamp;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.menu_notification_iv_ajio_revamp;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AppCompatImageView)view;
                    if (object3 != null) {
                        n3 = R$id.menu_notification_layout_ajio_revamp;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (ConstraintLayout)view;
                        if (object4 != null) {
                            n3 = R$id.menu_notification_tv_ajio_revamp;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                n3 = R$id.wishlist_iv_ajio_revamp;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AppCompatImageView)view;
                                if (object5 != null) {
                                    Object object6 = object;
                                    object6 = (ConstraintLayout)((Object)object);
                                    TopToolbarIconsRevampAjioBinding topToolbarIconsRevampAjioBinding = new TopToolbarIconsRevampAjioBinding((ConstraintLayout)((Object)object6), (TextView)view2, (AppCompatImageView)((Object)object2), (LinearLayout)view3, (AppCompatImageView)((Object)object3), (ConstraintLayout)((Object)object4), (TextView)view4, (AppCompatImageView)((Object)object5));
                                    return topToolbarIconsRevampAjioBinding;
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TopToolbarIconsRevampAjioBinding inflate(LayoutInflater layoutInflater) {
        return TopToolbarIconsRevampAjioBinding.inflate(layoutInflater, null, false);
    }

    public static TopToolbarIconsRevampAjioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.top_toolbar_icons_revamp_ajio;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TopToolbarIconsRevampAjioBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

