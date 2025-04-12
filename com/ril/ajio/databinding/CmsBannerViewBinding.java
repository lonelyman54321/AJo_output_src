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

public final class CmsBannerViewBinding
implements BC3 {
    public final ConstraintLayout containerOnboarding;
    private final ConstraintLayout rootView;

    private CmsBannerViewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.containerOnboarding = constraintLayout2;
    }

    public static CmsBannerViewBinding bind(View object) {
        if (object != null) {
            object = (ConstraintLayout)((Object)object);
            CmsBannerViewBinding cmsBannerViewBinding = new CmsBannerViewBinding((ConstraintLayout)((Object)object), (ConstraintLayout)((Object)object));
            return cmsBannerViewBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static CmsBannerViewBinding inflate(LayoutInflater layoutInflater) {
        return CmsBannerViewBinding.inflate(layoutInflater, null, false);
    }

    public static CmsBannerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cms_banner_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CmsBannerViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

