/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.app;

import androidx.appcompat.app.h;

public final class h$b
extends ur3 {
    public final /* synthetic */ h a;

    public h$b(h h3) {
        this.a = h3;
    }

    public final void onAnimationEnd() {
        h h3 = this.a;
        h3.t = null;
        h3.d.requestLayout();
    }
}

