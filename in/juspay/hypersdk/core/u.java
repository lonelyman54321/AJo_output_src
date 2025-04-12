/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class u
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;

    public /* synthetic */ u(AndroidInterface androidInterface, String string2) {
        this.a = androidInterface;
        this.b = string2;
    }

    public final void run() {
        AndroidInterface androidInterface = this.a;
        String string2 = this.b;
        AndroidInterface.i(androidInterface, string2);
    }
}

