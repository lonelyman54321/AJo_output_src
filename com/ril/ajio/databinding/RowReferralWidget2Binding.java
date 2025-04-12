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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowReferralWidget2Binding
implements BC3 {
    private final FrameLayout rootView;
    public final FrameLayout rwParent;

    private RowReferralWidget2Binding(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.rwParent = frameLayout2;
    }

    public static RowReferralWidget2Binding bind(View object) {
        int n3 = R$id.rw_parent;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null) {
            object = (FrameLayout)object;
            RowReferralWidget2Binding rowReferralWidget2Binding = new RowReferralWidget2Binding((FrameLayout)object, frameLayout);
            return rowReferralWidget2Binding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowReferralWidget2Binding inflate(LayoutInflater layoutInflater) {
        return RowReferralWidget2Binding.inflate(layoutInflater, null, false);
    }

    public static RowReferralWidget2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_referral_widget_2;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowReferralWidget2Binding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

