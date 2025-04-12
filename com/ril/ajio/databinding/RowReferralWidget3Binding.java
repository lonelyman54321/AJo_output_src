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

public final class RowReferralWidget3Binding
implements BC3 {
    private final FrameLayout rootView;
    public final FrameLayout rwParent;

    private RowReferralWidget3Binding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.rwParent = frameLayout2;
    }

    public static RowReferralWidget3Binding bind(View object) {
        if (object != null) {
            object = (FrameLayout)object;
            RowReferralWidget3Binding rowReferralWidget3Binding = new RowReferralWidget3Binding((FrameLayout)object, (FrameLayout)object);
            return rowReferralWidget3Binding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static RowReferralWidget3Binding inflate(LayoutInflater layoutInflater) {
        return RowReferralWidget3Binding.inflate(layoutInflater, null, false);
    }

    public static RowReferralWidget3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_widget_3;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralWidget3Binding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

