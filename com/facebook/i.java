/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
package com.facebook;

import android.os.Handler;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$b;
import com.facebook.GraphRequest$f;
import kotlin.jvm.internal.Intrinsics;

public final class i {
    public final Handler a;
    public final GraphRequest b;
    public final long c;
    public long d;
    public long e;
    public long f;

    public i(Handler object, GraphRequest graphRequest) {
        long l2;
        Intrinsics.checkNotNullParameter(graphRequest, "request");
        this.a = object;
        this.b = graphRequest;
        object = FacebookSdk.a;
        Xz3.h();
        this.c = l2 = FacebookSdk.i.get();
    }

    public final void a() {
        long l2 = this.d;
        long l3 = this.e;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            Object object2 = this.b;
            GraphRequest$b graphRequest$b = ((GraphRequest)object2).g;
            long l7 = this.f;
            long l8 = 0L;
            long l12 = l7 - l8;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 > 0 && (object3 = (Object)(graphRequest$b instanceof GraphRequest$f)) != false) {
                Handler handler = this.a;
                if (handler != null) {
                    rx1_0 rx1_02;
                    object2 = rx1_02;
                    rx1_02 = new rx1_0(graphRequest$b, l2, l7);
                    handler.post((Runnable)rx1_02);
                } else {
                    graphRequest$b = (GraphRequest$f)graphRequest$b;
                    graphRequest$b.a();
                }
                this.e = l3 = this.d;
            }
        }
    }
}

