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
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class TvNativeFeatureHeroBinding
implements BC3 {
    public final AjioTextView nativeFeatureHeroTv;
    private final AjioTextView rootView;

    private TvNativeFeatureHeroBinding(AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = ajioTextView;
        this.nativeFeatureHeroTv = ajioTextView2;
    }

    public static TvNativeFeatureHeroBinding bind(View object) {
        if (object != null) {
            object = (AjioTextView)object;
            TvNativeFeatureHeroBinding tvNativeFeatureHeroBinding = new TvNativeFeatureHeroBinding((AjioTextView)object, (AjioTextView)object);
            return tvNativeFeatureHeroBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static TvNativeFeatureHeroBinding inflate(LayoutInflater layoutInflater) {
        return TvNativeFeatureHeroBinding.inflate(layoutInflater, null, false);
    }

    public static TvNativeFeatureHeroBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.tv_native_feature_hero;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TvNativeFeatureHeroBinding.bind((View)layoutInflater);
    }

    public AjioTextView getRoot() {
        return this.rootView;
    }
}

