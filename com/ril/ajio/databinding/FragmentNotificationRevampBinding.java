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
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioNonSwipablePager;

public final class FragmentNotificationRevampBinding
implements BC3 {
    public final TabLayout notificationTab;
    public final AjioNonSwipablePager notificationViewpager;
    private final LinearLayout rootView;

    private FragmentNotificationRevampBinding(LinearLayout linearLayout, TabLayout tabLayout, AjioNonSwipablePager ajioNonSwipablePager) {
        this.rootView = linearLayout;
        this.notificationTab = tabLayout;
        this.notificationViewpager = ajioNonSwipablePager;
    }

    public static FragmentNotificationRevampBinding bind(View object) {
        AjioNonSwipablePager ajioNonSwipablePager;
        int n3 = R$id.notification_tab;
        TabLayout tabLayout = (TabLayout)dd2_2.a(n3, object);
        if (tabLayout != null && (ajioNonSwipablePager = (AjioNonSwipablePager)dd2_2.a(n3 = R$id.notification_viewpager, object)) != null) {
            object = (LinearLayout)object;
            FragmentNotificationRevampBinding fragmentNotificationRevampBinding = new FragmentNotificationRevampBinding((LinearLayout)object, tabLayout, ajioNonSwipablePager);
            return fragmentNotificationRevampBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentNotificationRevampBinding inflate(LayoutInflater layoutInflater) {
        return FragmentNotificationRevampBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentNotificationRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_notification_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentNotificationRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

