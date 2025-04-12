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
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$layout;

public final class LayoutSaleAnimBinding
implements BC3 {
    public final LottieAnimationView confettiSaleAnim;
    private final LottieAnimationView rootView;

    private LayoutSaleAnimBinding(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2) {
        this.rootView = lottieAnimationView;
        this.confettiSaleAnim = lottieAnimationView2;
    }

    public static LayoutSaleAnimBinding bind(View object) {
        if (object != null) {
            object = (LottieAnimationView)((Object)object);
            LayoutSaleAnimBinding layoutSaleAnimBinding = new LayoutSaleAnimBinding((LottieAnimationView)((Object)object), (LottieAnimationView)((Object)object));
            return layoutSaleAnimBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static LayoutSaleAnimBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSaleAnimBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSaleAnimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_anim;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSaleAnimBinding.bind((View)layoutInflater);
    }

    public LottieAnimationView getRoot() {
        return this.rootView;
    }
}

