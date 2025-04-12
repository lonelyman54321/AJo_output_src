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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class SlowNetworkNotificationLayoutBinding
implements BC3 {
    private final LinearLayout rootView;
    public final LinearLayout slowInternet;
    public final AjioTextView slowInternetText;

    private SlowNetworkNotificationLayoutBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.slowInternet = linearLayout2;
        this.slowInternetText = ajioTextView;
    }

    public static SlowNetworkNotificationLayoutBinding bind(View object) {
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.slow_internet_text;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = new SlowNetworkNotificationLayoutBinding((LinearLayout)object2, (LinearLayout)object2, ajioTextView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static SlowNetworkNotificationLayoutBinding inflate(LayoutInflater layoutInflater) {
        return SlowNetworkNotificationLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static SlowNetworkNotificationLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.slow_network_notification_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SlowNetworkNotificationLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

