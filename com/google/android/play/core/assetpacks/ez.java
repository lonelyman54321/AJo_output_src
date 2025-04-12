/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.ey;
import com.google.android.play.core.assetpacks.fa;

public final class ez
implements Runnable {
    public final /* synthetic */ fa a;
    public final /* synthetic */ ey b;

    public /* synthetic */ ez(fa fa3, ey ey2) {
        this.a = fa3;
        this.b = ey2;
    }

    public final void run() {
        fa fa3 = this.a;
        ey ey2 = this.b;
        fa.a(fa3, ey2);
    }
}

