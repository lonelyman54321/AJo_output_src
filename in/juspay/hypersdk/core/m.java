/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package in.juspay.hypersdk.core;

import android.util.Pair;
import in.juspay.hypersdk.core.AndroidInterface;

public final class m
implements Runnable {
    public final /* synthetic */ AndroidInterface a;
    public final /* synthetic */ Pair b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ m(AndroidInterface androidInterface, Pair pair, String string2, String string3) {
        this.a = androidInterface;
        this.b = pair;
        this.c = string2;
        this.d = string3;
    }

    public final void run() {
        String string2 = this.c;
        String string3 = this.d;
        AndroidInterface androidInterface = this.a;
        Pair pair = this.b;
        AndroidInterface.f(androidInterface, pair, string2, string3);
    }
}

