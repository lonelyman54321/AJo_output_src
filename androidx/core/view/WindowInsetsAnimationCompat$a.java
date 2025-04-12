/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.WindowInsetsAnimation$Bounds
 */
package androidx.core.view;

import android.view.WindowInsetsAnimation;

public final class WindowInsetsAnimationCompat$a {
    public final ei1 a;
    public final ei1 b;

    public WindowInsetsAnimationCompat$a(WindowInsetsAnimation.Bounds object) {
        ei1 ei12;
        this.a = ei12 = ei1.c(ug3_1.a(object));
        object = ei1.c(tg3_1.a(object));
        this.b = object;
    }

    public WindowInsetsAnimationCompat$a(ei1 ei12, ei1 ei13) {
        this.a = ei12;
        this.b = ei13;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Bounds{lower=");
        ei1 ei12 = this.a;
        stringBuilder.append(ei12);
        stringBuilder.append(" upper=");
        ei12 = this.b;
        stringBuilder.append(ei12);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

