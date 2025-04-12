/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class g
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ g(AndroidInterface androidInterface, String string2, int n3) {
        this.a = androidInterface;
        this.b = string2;
        this.c = n3;
    }

    public final void run() {
        String string2 = this.b;
        int n3 = this.c;
        AndroidInterface.c(this.a, string2, n3);
    }
}

