/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.exoplayer.e;
import com.google.common.base.Function;
import com.google.common.base.Supplier;

public final class ExoPlayer$c {
    public final Context a;
    public final ph3_0 b;
    public final Supplier c;
    public final Supplier d;
    public Supplier e;
    public Supplier f;
    public final Supplier g;
    public final Function h;
    public final Looper i;
    public final int j;
    public final dr_1 k;
    public final int l;
    public final boolean m;
    public final ex2_0 n;
    public final long o;
    public final long p;
    public final long q;
    public final km0_0 r;
    public final long s;
    public final long t;
    public final boolean u;
    public boolean v;
    public final String w;

    public ExoPlayer$c(Context context) {
        oe0_0 oe0_02 = new oe0_0(context);
        pe0_0 pe0_02 = new pe0_0(context);
        this(context, oe0_02, pe0_02);
    }

    public ExoPlayer$c(Context object, Supplier object2, Supplier supplier) {
        km0_0 km0_02;
        te0_1 te0_12;
        re0_1 re0_12;
        Object object3 = new QE0((Context)object);
        SE0 sE0 = new SE0((Context)object);
        super();
        object.getClass();
        this.a = object;
        this.c = object2;
        this.d = supplier;
        this.e = object3;
        this.f = re0_12;
        this.g = sE0;
        this.h = te0_12;
        int n3 = gz3.a;
        object = Looper.myLooper();
        if (object == null) {
            object = Looper.getMainLooper();
        }
        this.i = object;
        object = dr_1.g;
        this.k = object;
        this.l = n3 = 1;
        this.m = n3;
        this.n = object2 = ex2_0.c;
        this.o = 5000L;
        this.p = 15000L;
        this.q = 3000L;
        long l2 = gz3.I(20);
        long l3 = 500L;
        long l4 = gz3.I(l3);
        object3 = km0_02;
        this.r = km0_02 = new km0_0(l2, l4, 0.999f);
        this.b = object3 = VV.a;
        this.s = l3;
        this.t = 2000L;
        this.u = n3;
        this.w = "";
        this.j = -1000;
    }

    public final e a() {
        int n3 = this.v;
        boolean bl2 = true;
        ct3.f(n3 ^ bl2);
        this.v = bl2;
        n3 = gz3.a;
        e e2 = new e(this, null);
        return e2;
    }

    public final void b(zn0 zn02) {
        ct3.f(this.v ^ true);
        ne0_0 ne0_02 = new ne0_0(zn02);
        this.e = ne0_02;
    }
}

