/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.ed;

public final class dz
implements Runnable {
    public final /* synthetic */ ed a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ dz(ed ed2, int n3, String string2) {
        this.a = ed2;
        this.b = n3;
        this.c = string2;
    }

    public final void run() {
        ed ed2 = this.a;
        int n3 = this.b;
        String string2 = this.c;
        ed.l(ed2, n3, string2);
    }
}

