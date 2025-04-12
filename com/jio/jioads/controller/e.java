/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.controller;

import com.jio.jioads.controller.o;
import com.jio.jioads.network.NetworkTaskListener;
import java.util.Map;

public final class e
implements NetworkTaskListener {
    public final /* synthetic */ o a;

    public e(o o3) {
        this.a = o3;
    }

    public final void onError(int n3, Object object, Map map2) {
        this.a.e();
    }

    public final void onSuccess(String string2, Map object) {
        object = this.a;
        ((o)object).e();
        ((o)object).v = string2;
    }
}

