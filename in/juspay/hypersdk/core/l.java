/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class l
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ l(AndroidInterface androidInterface, String string2, String string3, String string4) {
        this.a = androidInterface;
        this.b = string2;
        this.c = string3;
        this.d = string4;
    }

    public final void run() {
        String string2 = this.c;
        String string3 = this.d;
        AndroidInterface androidInterface = this.a;
        String string4 = this.b;
        AndroidInterface.q(androidInterface, string4, string2, string3);
    }
}

