/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsAnimation
 */
package androidx.core.view;

import android.view.WindowInsetsAnimation;
import androidx.core.view.WindowInsetsAnimationCompat$d;

public final class WindowInsetsAnimationCompat$c
extends WindowInsetsAnimationCompat$d {
    public final WindowInsetsAnimation e;

    public WindowInsetsAnimationCompat$c(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public final long a() {
        return mg3_1.a(this.e);
    }

    public final float b() {
        return qg3_0.a(this.e);
    }

    public final float c() {
        return rg3_0.a(this.e);
    }

    public final int d() {
        return og3_0.a(this.e);
    }

    public final void e(float f5) {
        pg3_0.a(this.e, f5);
    }
}

