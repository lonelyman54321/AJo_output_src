/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
package com.google.android.material.slider;

import android.view.ViewTreeObserver;
import com.google.android.material.slider.BaseSlider;

public final class a
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ BaseSlider a;

    public /* synthetic */ a(BaseSlider baseSlider) {
        this.a = baseSlider;
    }

    public final void onScrollChanged() {
        BaseSlider.a(this.a);
    }
}

