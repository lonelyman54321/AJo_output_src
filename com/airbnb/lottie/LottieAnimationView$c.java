/*
 * Decompiled with CFR 0.152.
 */
package com.airbnb.lottie;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

public final class LottieAnimationView$c
implements EC1 {
    public final WeakReference a;

    public LottieAnimationView$c(LottieAnimationView lottieAnimationView) {
        WeakReference<LottieAnimationView> weakReference;
        this.a = weakReference = new WeakReference<LottieAnimationView>(lottieAnimationView);
    }

    public final void onResult(Object object) {
        object = (QB1)object;
        LottieAnimationView lottieAnimationView = (LottieAnimationView)((Object)this.a.get());
        if (lottieAnimationView != null) {
            lottieAnimationView.setComposition((QB1)object);
        }
    }
}

