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

public final class ActivityAddressListBinding
implements BC3 {
    public final FrameLayout addressListContentframe;
    private final FrameLayout rootView;

    private ActivityAddressListBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.addressListContentframe = frameLayout2;
    }

    public static ActivityAddressListBinding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            ActivityAddressListBinding activityAddressListBinding = new ActivityAddressListBinding((FrameLayout)object, (FrameLayout)object);
            return activityAddressListBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ActivityAddressListBinding inflate(LayoutInflater layoutInflater) {
        return ActivityAddressListBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityAddressListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_address_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityAddressListBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

