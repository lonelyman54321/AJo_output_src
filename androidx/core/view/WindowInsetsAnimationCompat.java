/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.WindowInsetsAnimation
 *  android.view.animation.Interpolator
 */
package androidx.core.view;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;
import androidx.core.view.WindowInsetsAnimationCompat$Impl21;
import androidx.core.view.WindowInsetsAnimationCompat$c;
import androidx.core.view.WindowInsetsAnimationCompat$d;

public final class WindowInsetsAnimationCompat {
    public WindowInsetsAnimationCompat$d a;

    public WindowInsetsAnimationCompat(int n3, Interpolator interpolator2, long l2) {
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 30;
        if (n4 >= n7) {
            WindowInsetsAnimation windowInsetsAnimation = vg3_0.a(n3, interpolator2, l2);
            WindowInsetsAnimationCompat$c windowInsetsAnimationCompat$c = new WindowInsetsAnimationCompat$c(windowInsetsAnimation);
            this.a = windowInsetsAnimationCompat$c;
        } else {
            WindowInsetsAnimationCompat$Impl21 windowInsetsAnimationCompat$Impl21;
            super(n3, interpolator2, l2);
            this.a = windowInsetsAnimationCompat$Impl21;
        }
    }
}

