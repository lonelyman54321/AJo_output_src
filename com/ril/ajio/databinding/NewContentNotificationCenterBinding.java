/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$layout;

public final class NewContentNotificationCenterBinding
implements BC3 {
    public final FrameLayout fragment;
    private final FrameLayout rootView;

    private NewContentNotificationCenterBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.fragment = frameLayout2;
    }

    public static NewContentNotificationCenterBinding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            NewContentNotificationCenterBinding newContentNotificationCenterBinding = new NewContentNotificationCenterBinding((FrameLayout)object, (FrameLayout)object);
            return newContentNotificationCenterBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static NewContentNotificationCenterBinding inflate(LayoutInflater layoutInflater) {
        return NewContentNotificationCenterBinding.inflate(layoutInflater, null, false);
    }

    public static NewContentNotificationCenterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_content_notification_center;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewContentNotificationCenterBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

