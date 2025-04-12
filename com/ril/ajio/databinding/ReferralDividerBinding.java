/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ril.ajio.R$layout;

public final class ReferralDividerBinding
implements BC3 {
    private final View rootView;

    private ReferralDividerBinding(View view) {
        this.rootView = view;
    }

    public static ReferralDividerBinding bind(View object) {
        if (object != null) {
            ReferralDividerBinding referralDividerBinding = new ReferralDividerBinding((View)object);
            return referralDividerBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ReferralDividerBinding inflate(LayoutInflater layoutInflater) {
        return ReferralDividerBinding.inflate(layoutInflater, null, false);
    }

    public static ReferralDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.referral_divider;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReferralDividerBinding.bind((View)layoutInflater);
    }

    public View getRoot() {
        return this.rootView;
    }
}

