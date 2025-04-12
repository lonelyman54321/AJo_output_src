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
import com.facebook.e;
import com.facebook.e$a;
import com.facebook.e$b;
import com.facebook.i;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class h
extends FilterOutputStream
implements gk2_0 {
    public final e a;
    public final Map b;
    public final long c;
    public final long d;
    public long e;
    public long f;
    public i g;

    public h(FilterOutputStream object, e e2, HashMap hashMap, long l2) {
        long l3;
        Intrinsics.checkNotNullParameter(object, "out");
        Intrinsics.checkNotNullParameter(e2, "requests");
        Intrinsics.checkNotNullParameter(hashMap, "progressMap");
        super((OutputStream)object);
        this.a = e2;
        this.b = hashMap;
        this.c = l2;
        object = FacebookSdk.a;
        Xz3.h();
        this.d = l3 = FacebookSdk.i.get();
    }

    public final void a(GraphRequest object) {
        if (object != null) {
            Map map2 = this.b;
            object = (i)map2.get(object);
        } else {
            object = null;
        }
        this.g = object;
    }

    public final void b(long l2) {
        long l3;
        long l4;
        i i3 = this.g;
        if (i3 != null) {
            long l7;
            long l8;
            i3.d = l8 = i3.d + l2;
            long l12 = i3.e;
            long l14 = i3.c;
            long l15 = l8 - (l12 += l14);
            Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object >= 0 || (object = (l7 = l8 - (l12 = i3.f)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) >= 0) {
                i3.a();
            }
        }
        this.e = l4 = this.e + l2;
        l2 = this.f;
        long l16 = this.d;
        long l17 = l4 - (l2 += l16);
        Object object = l17 == 0L ? 0 : (l17 < 0L ? -1 : 1);
        if (object >= 0 || (object = (l3 = l4 - (l2 = this.c)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0) {
            this.c();
        }
    }

    public final void c() {
        long l2 = this.e;
        long l3 = this.f;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object > 0) {
            boolean bl2;
            e e2 = this.a;
            Iterator iterator = e2.d.iterator();
            while (bl2 = iterator.hasNext()) {
                e$a e$a = (e$a)iterator.next();
                boolean bl3 = e$a instanceof e$b;
                if (!bl3) continue;
                Handler handler = e2.a;
                if (handler != null) {
                    e$a = (e$b)e$a;
                    sb2_0 sb2_02 = new sb2_0((e$b)e$a, this);
                    handler.post((Runnable)sb2_02);
                    continue;
                }
                e$a = (e$b)e$a;
                e$a.b();
            }
            this.f = l2 = this.e;
        }
    }

    public final void close() {
        boolean bl2;
        super.close();
        Iterator iterator = this.b.values().iterator();
        while (bl2 = iterator.hasNext()) {
            i i3 = (i)iterator.next();
            i3.a();
        }
        this.c();
    }

    public final void write(int n3) {
        this.out.write(n3);
        this.b(1L);
    }

    public final void write(byte[] byArray) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        this.out.write(byArray);
        long l2 = byArray.length;
        this.b(l2);
    }

    public final void write(byte[] byArray, int n3, int n4) {
        Intrinsics.checkNotNullParameter(byArray, "buffer");
        this.out.write(byArray, n3, n4);
        long l2 = n4;
        this.b(l2);
    }
}

