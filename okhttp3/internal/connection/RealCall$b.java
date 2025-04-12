/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import okhttp3.internal.connection.RealCall;
import okio.AsyncTimeout;

public final class RealCall$b
extends AsyncTimeout {
    public final /* synthetic */ RealCall m;

    public RealCall$b(RealCall realCall) {
        this.m = realCall;
    }

    public final void k() {
        this.m.cancel();
    }
}

