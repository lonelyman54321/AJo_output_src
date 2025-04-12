/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.AndroidInterface;

public final class q
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;

    public /* synthetic */ q(AndroidInterface androidInterface, String string2, String string3, int n3, String string4, boolean bl2, String string5, String string6) {
        this.a = androidInterface;
        this.b = string2;
        this.c = string3;
        this.d = n3;
        this.e = string4;
        this.f = bl2;
        this.g = string5;
        this.h = string6;
    }

    public final void run() {
        String string2 = this.g;
        String string3 = this.h;
        AndroidInterface androidInterface = this.a;
        String string4 = this.b;
        String string5 = this.c;
        int n3 = this.d;
        String string6 = this.e;
        boolean bl2 = this.f;
        AndroidInterface.b(androidInterface, string4, string5, n3, string6, bl2, string2, string3);
    }
}

