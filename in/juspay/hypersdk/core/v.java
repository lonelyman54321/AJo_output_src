/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class v
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String[] e;
    public final /* synthetic */ String f;

    public /* synthetic */ v(AndroidInterface androidInterface, String string2, String string3, int n3, String[] stringArray, String string4) {
        this.a = androidInterface;
        this.b = string2;
        this.c = string3;
        this.d = n3;
        this.e = stringArray;
        this.f = string4;
    }

    public final void run() {
        String[] stringArray = this.e;
        String string2 = this.f;
        AndroidInterface androidInterface = this.a;
        String string3 = this.b;
        String string4 = this.c;
        int n3 = this.d;
        AndroidInterface.v(androidInterface, string3, string4, n3, stringArray, string2);
    }
}

