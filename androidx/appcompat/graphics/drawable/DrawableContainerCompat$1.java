/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.graphics.drawable;

import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.graphics.drawable.b;

class DrawableContainerCompat$1
implements Runnable {
    public final /* synthetic */ DrawableContainerCompat a;

    public DrawableContainerCompat$1(b b2) {
        this.a = b2;
    }

    public final void run() {
        DrawableContainerCompat drawableContainerCompat = this.a;
        drawableContainerCompat.a(true);
        drawableContainerCompat.invalidateSelf();
    }
}

