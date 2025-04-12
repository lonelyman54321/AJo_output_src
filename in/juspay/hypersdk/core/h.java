/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class h
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ h(AndroidInterface androidInterface, String string2, String string3) {
        this.a = androidInterface;
        this.b = string2;
        this.c = string3;
    }

    public final void run() {
        String string2 = this.b;
        String string3 = this.c;
        AndroidInterface.h(this.a, string2, string3);
    }
}

