/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class NotificationMenuItemBinding
implements BC3 {
    public final ImageView notiIcon;
    public final Button notificationCount;
    private final LinearLayout rootView;

    private NotificationMenuItemBinding(LinearLayout linearLayout, ImageView imageView, Button button) {
        this.rootView = linearLayout;
        this.notiIcon = imageView;
        this.notificationCount = button;
    }

    public static NotificationMenuItemBinding bind(View object) {
        Button button;
        int n3 = R$id.noti_icon;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (button = (Button)dd2_2.a(n3 = R$id.notification_count, object)) != null) {
            object = (LinearLayout)object;
            NotificationMenuItemBinding notificationMenuItemBinding = new NotificationMenuItemBinding((LinearLayout)object, imageView, button);
            return notificationMenuItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NotificationMenuItemBinding inflate(LayoutInflater layoutInflater) {
        return NotificationMenuItemBinding.inflate(layoutInflater, null, false);
    }

    public static NotificationMenuItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.notification_menu_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NotificationMenuItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

