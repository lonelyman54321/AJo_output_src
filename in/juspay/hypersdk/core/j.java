/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class j
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;

    public /* synthetic */ j(AndroidInterface androidInterface, String string2, int n3, String string3) {
        this.a = androidInterface;
        this.b = string2;
        this.c = n3;
        this.d = string3;
    }

    public final void run() {
        int n3 = this.c;
        String string2 = this.d;
        AndroidInterface androidInterface = this.a;
        String string3 = this.b;
        AndroidInterface.d(androidInterface, string3, n3, string2);
    }
}

