/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ActivityNewAddressBinding
implements BC3 {
    public final FrameLayout addressNewContentframe;
    private final LinearLayout rootView;

    private ActivityNewAddressBinding(LinearLayout linearLayout, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.addressNewContentframe = frameLayout;
    }

    public static ActivityNewAddressBinding bind(View object) {
        int n3 = R$id.address_new_contentframe;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null) {
            object = (LinearLayout)object;
            ActivityNewAddressBinding activityNewAddressBinding = new ActivityNewAddressBinding((LinearLayout)object, frameLayout);
            return activityNewAddressBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityNewAddressBinding inflate(LayoutInflater layoutInflater) {
        return ActivityNewAddressBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityNewAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_new_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityNewAddressBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

