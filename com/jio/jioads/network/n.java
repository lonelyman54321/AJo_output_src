/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.android.volley.DefaultRetryPolicy
 *  com.android.volley.RequestQueue
 *  com.android.volley.RetryPolicy
 *  com.android.volley.toolbox.Volley
 */
package com.jio.jioads.network;

import android.content.Context;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.RequestQueue;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.Volley;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.network.j;
import com.jio.jioads.network.k;
import com.jio.jioads.network.l;
import com.jio.jioads.network.m;
import java.util.Map;

public final class n {
    public static final j c;
    public static n d;
    public final Context a;
    public RequestQueue b;

    static {
        j j3;
        c = j3 = new Object();
    }

    public n(Context context) {
        this.a = context;
        context = this.a();
        this.b = context;
    }

    public final RequestQueue a() {
        RequestQueue requestQueue = this.b;
        if (requestQueue == null) {
            this.b = requestQueue = Volley.newRequestQueue((Context)this.a.getApplicationContext());
        }
        return this.b;
    }

    public final void b(int n3, String string2, Map map2, Integer n4, NetworkTaskListener networkTaskListener) {
        Integer n7;
        l l2 = new l(networkTaskListener);
        m m2 = new m(networkTaskListener);
        k k2 = new k(n3, string2, map2, l2, m2);
        n3 = n4;
        if (n3 == 0) {
            n3 = 20000;
            n7 = n3;
        } else {
            n3 = n4 * 1000;
            n7 = n3;
        }
        n3 = n7;
        int n8 = 1;
        float f5 = 1.0f;
        string2 = new DefaultRetryPolicy(n3, n8, f5);
        k2.setRetryPolicy((RetryPolicy)string2);
        n7 = this.a();
        if (n7 != null) {
            n7.add(k2);
        }
    }
}

