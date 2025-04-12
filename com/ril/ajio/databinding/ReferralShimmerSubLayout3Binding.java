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

public final class ReferralShimmerSubLayout3Binding
implements BC3 {
    private final LinearLayout rootView;

    private ReferralShimmerSubLayout3Binding(LinearLayout linearLayout) {
        this.rootView = linearLayout;
    }

    public static ReferralShimmerSubLayout3Binding bind(View object) {
        if (object != null) {
            object = (LinearLayout)object;
            ReferralShimmerSubLayout3Binding referralShimmerSubLayout3Binding = new ReferralShimmerSubLayout3Binding((LinearLayout)object);
            return referralShimmerSubLayout3Binding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static ReferralShimmerSubLayout3Binding inflate(LayoutInflater layoutInflater) {
        return ReferralShimmerSubLayout3Binding.inflate(layoutInflater, null, false);
    }

    public static ReferralShimmerSubLayout3Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.referral_shimmer_sub_layout_3;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ReferralShimmerSubLayout3Binding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

