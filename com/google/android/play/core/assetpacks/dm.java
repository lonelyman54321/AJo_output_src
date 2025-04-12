/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.dq;
import com.google.android.play.core.assetpacks.dt;

public final class dm
implements Runnable {
    public final /* synthetic */ dt a;
    public final /* synthetic */ dq b;

    public /* synthetic */ dm(dt dt2, dq dq2) {
        this.a = dt2;
        this.b = dq2;
    }

    public final void run() {
        dt dt2 = this.a;
        int n3 = this.b.a;
        dt2.n(n3);
    }
}

