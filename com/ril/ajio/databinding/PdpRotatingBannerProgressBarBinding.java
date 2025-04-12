/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.ril.ajio.R$layout;

public final class PdpRotatingBannerProgressBarBinding
implements BC3 {
    private final ProgressBar rootView;
    public final ProgressBar rowRotateProgressbarOne;

    private PdpRotatingBannerProgressBarBinding(ProgressBar progressBar, ProgressBar progressBar2) {
        this.rootView = progressBar;
        this.rowRotateProgressbarOne = progressBar2;
    }

    public static PdpRotatingBannerProgressBarBinding bind(View object) {
        if (object != null) {
            object = (ProgressBar)object;
            PdpRotatingBannerProgressBarBinding pdpRotatingBannerProgressBarBinding = new PdpRotatingBannerProgressBarBinding((ProgressBar)object, (ProgressBar)object);
            return pdpRotatingBannerProgressBarBinding;
        }
        object = new NullPointerException("rootView");
        throw object;
    }

    public static PdpRotatingBannerProgressBarBinding inflate(LayoutInflater layoutInflater) {
        return PdpRotatingBannerProgressBarBinding.inflate(layoutInflater, null, false);
    }

    public static PdpRotatingBannerProgressBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_rotating_banner_progress_bar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpRotatingBannerProgressBarBinding.bind((View)layoutInflater);
    }

    public ProgressBar getRoot() {
        return this.rootView;
    }
}

