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

public final class ActivityExchangeReturnControllerListBinding
implements BC3 {
    public final FrameLayout itemListControllerContentframe;
    private final FrameLayout rootView;

    private ActivityExchangeReturnControllerListBinding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.itemListControllerContentframe = frameLayout2;
    }

    public static ActivityExchangeReturnControllerListBinding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            ActivityExchangeReturnControllerListBinding activityExchangeReturnControllerListBinding = new ActivityExchangeReturnControllerListBinding((FrameLayout)object, (FrameLayout)object);
            return activityExchangeReturnControllerListBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ActivityExchangeReturnControllerListBinding inflate(LayoutInflater layoutInflater) {
        return ActivityExchangeReturnControllerListBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityExchangeReturnControllerListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_exchange_return_controller_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityExchangeReturnControllerListBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

