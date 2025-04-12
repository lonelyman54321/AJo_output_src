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
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LoaderLayoutLottieAnimBinding
implements BC3 {
    public final LottieAnimationView loaderLottieAnimView;
    private final FrameLayout rootView;

    private LoaderLayoutLottieAnimBinding(FrameLayout frameLayout, LottieAnimationView lottieAnimationView) {
        this.rootView = frameLayout;
        this.loaderLottieAnimView = lottieAnimationView;
    }

    public static LoaderLayoutLottieAnimBinding bind(View object) {
        int n3 = R$id.loader_lottie_anim_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView)dd2_2.a(n3, object);
        if (lottieAnimationView != null) {
            object = (FrameLayout)object;
            LoaderLayoutLottieAnimBinding loaderLayoutLottieAnimBinding = new LoaderLayoutLottieAnimBinding((FrameLayout)object, lottieAnimationView);
            return loaderLayoutLottieAnimBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LoaderLayoutLottieAnimBinding inflate(LayoutInflater layoutInflater) {
        return LoaderLayoutLottieAnimBinding.inflate(layoutInflater, null, false);
    }

    public static LoaderLayoutLottieAnimBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.loader_layout_lottie_anim;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LoaderLayoutLottieAnimBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

