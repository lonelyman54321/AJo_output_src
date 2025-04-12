/*
 * Decompiled with CFR 0.152.
 */
package com.airbnb.lottie;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

public final class LottieAnimationView$b
implements EC1 {
    public final WeakReference a;

    public LottieAnimationView$b(LottieAnimationView lottieAnimationView) {
        WeakReference<LottieAnimationView> weakReference;
        this.a = weakReference = new WeakReference<LottieAnimationView>(lottieAnimationView);
    }

    public final void onResult(Object object) {
        object = (Throwable)object;
        Object object2 = (LottieAnimationView)((Object)this.a.get());
        if (object2 != null) {
            int n3 = object2.d;
            if (n3 != 0) {
                object2.setImageResource(n3);
            }
            if ((object2 = object2.c) == null) {
                object2 = LottieAnimationView.n;
            }
            object2.onResult(object);
        }
    }
}

