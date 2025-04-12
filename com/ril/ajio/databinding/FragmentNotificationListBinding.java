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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentNotificationListBinding
implements BC3 {
    public final RecyclerView notificationList;
    private final LinearLayout rootView;

    private FragmentNotificationListBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.notificationList = recyclerView;
    }

    public static FragmentNotificationListBinding bind(View object) {
        int n3 = R$id.notification_list;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = (LinearLayout)object;
            FragmentNotificationListBinding fragmentNotificationListBinding = new FragmentNotificationListBinding((LinearLayout)object, recyclerView);
            return fragmentNotificationListBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentNotificationListBinding inflate(LayoutInflater layoutInflater) {
        return FragmentNotificationListBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentNotificationListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_notification_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentNotificationListBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

