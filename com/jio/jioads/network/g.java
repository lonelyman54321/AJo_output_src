/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.network;

import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.i;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class g
implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ HashMap b;

    public /* synthetic */ g(i i3, HashMap hashMap) {
        this.a = i3;
        this.b = hashMap;
    }

    public final void run() {
        i i3 = this.a;
        Intrinsics.checkNotNullParameter(i3, "this$0");
        HashMap hashMap = this.b;
        Intrinsics.checkNotNullParameter(hashMap, "$responseHeaders");
        NetworkTaskListener networkTaskListener = i3.f;
        if (networkTaskListener != null) {
            String string2;
            int n3 = i3.g;
            int n4 = 200;
            if (n3 == n4 && (string2 = i3.j) != null) {
                networkTaskListener.onSuccess(string2, hashMap);
                i3.f = null;
            } else {
                if (n3 != 0 && (string2 = i3.j) != null) {
                    networkTaskListener.onError(n3, string2, hashMap);
                } else {
                    string2 = i3.i;
                    networkTaskListener.onError(n3, string2, hashMap);
                }
                i3.f = null;
            }
        }
    }
}

