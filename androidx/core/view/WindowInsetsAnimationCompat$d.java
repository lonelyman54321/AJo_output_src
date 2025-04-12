/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 */
package androidx.core.view;

import android.view.animation.Interpolator;

public class WindowInsetsAnimationCompat$d {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public WindowInsetsAnimationCompat$d(int n3, Interpolator interpolator2, long l2) {
        this.a = n3;
        this.c = interpolator2;
        this.d = l2;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        return this.b;
    }

    public float c() {
        Interpolator interpolator2 = this.c;
        if (interpolator2 != null) {
            float f5 = this.b;
            return interpolator2.getInterpolation(f5);
        }
        return this.b;
    }

    public int d() {
        return this.a;
    }

    public void e(float f5) {
        this.b = f5;
    }
}

