/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.view.View
 */
package androidx.core.view;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21;
import androidx.core.view.WindowInsetsAnimationCompat$a;

class WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3
implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ WindowInsetsAnimationCompat b;
    public final /* synthetic */ WindowInsetsAnimationCompat.a c;
    public final /* synthetic */ ValueAnimator d;

    public WindowInsetsAnimationCompat$Impl21$Impl21OnApplyWindowInsetsListener$3(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.a a2, ValueAnimator valueAnimator) {
        this.a = view;
        this.b = windowInsetsAnimationCompat;
        this.c = a2;
        this.d = valueAnimator;
    }

    public final void run() {
        WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.b;
        WindowInsetsAnimationCompat.a a2 = this.c;
        WindowInsetsAnimationCompat$Impl21.i(this.a, windowInsetsAnimationCompat, a2);
        this.d.start();
    }
}

