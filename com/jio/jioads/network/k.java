/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.android.volley.Request
 *  com.android.volley.Response$ErrorListener
 *  com.android.volley.Response$Listener
 */
package com.jio.jioads.network;

import com.android.volley.Request;
import com.android.volley.Response;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class k
extends Request {
    public final Map a;

    public k(int n3, String string2, Map map2, Response.Listener listener, Response.ErrorListener errorListener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        super(n3, string2, errorListener);
        this.a = map2;
    }
}

