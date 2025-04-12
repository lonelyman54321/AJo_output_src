/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

/*
 * Renamed from in.juspay.hypersdk.core.b
 */
public final class b_0
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ b_0(AndroidInterface androidInterface, String string2, String string3, String string4, String string5) {
        this.a = androidInterface;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = string5;
    }

    public final void run() {
        String string2 = this.d;
        String string3 = this.e;
        AndroidInterface androidInterface = this.a;
        String string4 = this.b;
        String string5 = this.c;
        AndroidInterface.s(androidInterface, string4, string5, string2, string3);
    }
}

