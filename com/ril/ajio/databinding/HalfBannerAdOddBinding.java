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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$layout;

public final class HalfBannerAdOddBinding
implements BC3 {
    public final ConstraintLayout adBanner;
    private final ConstraintLayout rootView;

    private HalfBannerAdOddBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.adBanner = constraintLayout2;
    }

    public static HalfBannerAdOddBinding bind(View object) {
        if (object != null) {
            object = (ConstraintLayout)((Object)object);
            HalfBannerAdOddBinding halfBannerAdOddBinding = new HalfBannerAdOddBinding((ConstraintLayout)((Object)object), (ConstraintLayout)((Object)object));
            return halfBannerAdOddBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static HalfBannerAdOddBinding inflate(LayoutInflater layoutInflater) {
        return HalfBannerAdOddBinding.inflate(layoutInflater, null, false);
    }

    public static HalfBannerAdOddBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.half_banner_ad_odd;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HalfBannerAdOddBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

