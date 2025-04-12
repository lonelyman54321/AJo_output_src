/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.network;

import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.i;
import kotlin.jvm.internal.Intrinsics;

public final class h
implements Runnable {
    public final /* synthetic */ i a;

    public /* synthetic */ h(i i3) {
        this.a = i3;
    }

    public final void run() {
        Object object;
        String string2 = "this$0";
        i i3 = this.a;
        Intrinsics.checkNotNullParameter(i3, string2);
        int n3 = i3.g;
        if (n3 != 0 && (object = i3.j) != null) {
            NetworkTaskListener networkTaskListener = i3.f;
            if (networkTaskListener != null) {
                networkTaskListener.onError(n3, object, null);
            }
        } else {
            object = i3.f;
            if (object != null) {
                String string3 = i3.i;
                object.onError(n3, string3, null);
            }
        }
        i3.f = null;
    }
}

