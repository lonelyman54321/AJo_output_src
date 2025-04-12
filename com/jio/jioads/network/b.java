/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.network;

import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.a;
import java.util.Map;

public final class b
implements NetworkTaskListener {
    public final /* synthetic */ a a;

    public b(a a2) {
        this.a = a2;
    }

    public final void onError(int n3, Object object, Map map2) {
        this.a.onError(n3, object, null);
    }

    public final void onSuccess(String string2, Map map2) {
        this.a.onSuccess(string2, map2);
    }
}

