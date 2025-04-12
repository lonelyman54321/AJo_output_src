/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.util;

import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.c;
import java.util.Map;

public final class t
implements NetworkTaskListener {
    public final /* synthetic */ c a;

    public t(c c2) {
        this.a = c2;
    }

    public final void onError(int n3, Object object, Map map2) {
        this.a.a();
    }

    public final void onSuccess(String string2, Map map2) {
        this.a.a();
    }
}

