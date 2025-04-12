/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class a
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ a(AndroidInterface androidInterface, boolean bl2, String string2) {
        this.a = androidInterface;
        this.b = bl2;
        this.c = string2;
    }

    public final void run() {
        boolean bl2 = this.b;
        String string2 = this.c;
        AndroidInterface.m(this.a, bl2, string2);
    }
}

