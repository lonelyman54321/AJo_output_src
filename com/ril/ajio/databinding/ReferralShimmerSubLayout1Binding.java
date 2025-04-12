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
import com.ril.ajio.R$layout;

public final class ReferralShimmerSubLayout1Binding
implements BC3 {
    private final LinearLayout rootView;

    private ReferralShimmerSubLayout1Binding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ReferralShimmerSubLayout1Binding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ReferralShimmerSubLayout1Binding referralShimmerSubLayout1Binding = new ReferralShimmerSubLayout1Binding((LinearLayout)object);
            return referralShimmerSubLayout1Binding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ReferralShimmerSubLayout1Binding inflate(LayoutInflater layoutInflater) {
        return ReferralShimmerSubLayout1Binding.inflate(layoutInflater, null, false);
    }

    public static ReferralShimmerSubLayout1Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.referral_shimmer_sub_layout_1;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReferralShimmerSubLayout1Binding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

