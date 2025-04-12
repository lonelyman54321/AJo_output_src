/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.SystemClock
 *  android.util.Log
 */
package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.data.a;
import com.bumptech.glide.load.engine.DecodeJob$a;
import com.bumptech.glide.load.engine.DecodeJob$b;
import com.bumptech.glide.load.engine.DecodeJob$c;
import com.bumptech.glide.load.engine.DecodeJob$d;
import com.bumptech.glide.load.engine.DecodeJob$e;
import com.bumptech.glide.load.engine.DecodeJob$f;
import com.bumptech.glide.load.engine.DecodeJob$g;
import com.bumptech.glide.load.engine.DecodeJob$h;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.c$a;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.f$c;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class DecodeJob
implements c$a,
Runnable,
Comparable,
LI0$d {
    public ei0_0 A;
    public volatile c B;
    public volatile boolean C;
    public volatile boolean D;
    public boolean E;
    public final d a;
    public final ArrayList b;
    public final Tb3$a c;
    public final DecodeJob$e d;
    public final yw2 e;
    public final DecodeJob$d f;
    public final DecodeJob$f g;
    public com.bumptech.glide.c h;
    public qn1_0 i;
    public Az2 j;
    public sz0_0 k;
    public int l;
    public int m;
    public Nq0 n;
    public Z92 o;
    public DecodeJob$b p;
    public int q;
    public DecodeJob$h r;
    public DecodeJob$g s;
    public boolean t;
    public Object u;
    public Thread v;
    public qn1_0 w;
    public qn1_0 x;
    public Object y;
    public pi0_0 z;

    public DecodeJob(f$c f$c, LI0$c lI0$c) {
        Object object = new d();
        this.a = object;
        object = new ArrayList();
        this.b = object;
        this.c = object = new Object();
        this.f = object = new Object();
        this.g = object = new Object();
        this.d = f$c;
        this.e = lI0$c;
    }

    public final void a(qn1_0 object, Object object2, ei0_0 ei0_02, pi0_0 pi0_02, qn1_0 qn1_02) {
        this.w = object;
        this.y = object2;
        this.A = ei0_02;
        this.z = pi0_02;
        this.x = qn1_02;
        object2 = this.a.a();
        boolean bl2 = false;
        ei0_02 = null;
        if (object != (object2 = ((ArrayList)object2).get(0))) {
            bl2 = true;
        }
        this.E = bl2;
        object = Thread.currentThread();
        if (object != (object2 = this.v)) {
            object = DecodeJob$g.DECODE_DATA;
            this.o((DecodeJob$g)((Object)object));
        } else {
            this.g();
        }
    }

    public final Tb3$a b() {
        return this.c;
    }

    public final void c(qn1_0 object, Exception object2, ei0_0 ei0_02, pi0_0 pi0_02) {
        ei0_02.b();
        object2 = Collections.singletonList(object2);
        String string2 = "Fetching data failed";
        GlideException glideException = new GlideException(string2, (List)object2);
        object2 = ei0_02.a();
        glideException.b = object;
        glideException.c = pi0_02;
        glideException.d = object2;
        this.b.add(glideException);
        object = Thread.currentThread();
        object2 = this.v;
        if (object != object2) {
            object = DecodeJob$g.SWITCH_TO_SOURCE_SERVICE;
            this.o((DecodeJob$g)((Object)object));
        } else {
            this.p();
        }
    }

    public final int compareTo(Object object) {
        object = (DecodeJob)object;
        Az2 az2 = this.j;
        int n3 = az2.ordinal();
        Az2 az22 = ((DecodeJob)object).j;
        int n4 = az22.ordinal();
        if ((n3 -= n4) == 0) {
            n3 = this.q;
            int n7 = ((DecodeJob)object).q;
            n3 -= n7;
        }
        return n3;
    }

    public final void d() {
        DecodeJob$g decodeJob$g = DecodeJob$g.SWITCH_TO_SOURCE_SERVICE;
        this.o(decodeJob$g);
    }

    public final wk2_0 e(ei0_0 ei0_02, Object object, pi0_0 object2) {
        Throwable throwable2;
        block10: {
            block9: {
                int n3;
                if (object == null) {
                    ei0_02.b();
                    return null;
                }
                try {
                    n3 = kx1.a;
                }
                catch (Throwable throwable2) {}
                SystemClock.elapsedRealtimeNanos();
                object = this.f(object, (pi0_0)((Object)object2));
                object2 = "DecodeJob";
                n3 = 2;
                boolean bl2 = Log.isLoggable((String)object2, (int)n3);
                if (!bl2) break block9;
                object.toString();
                SystemClock.elapsedRealtimeNanos();
                object2 = this.k;
                Objects.toString(object2);
                object2 = Thread.currentThread();
                ((Thread)object2).getName();
                break block10;
            }
            ei0_02.b();
            return object;
        }
        ei0_02.b();
        throw throwable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final wk2_0 f(Object object, pi0_0 object2) {
        Object object3;
        Object object4 = object.getClass();
        Object object5 = this.a;
        Mv1 mv1 = ((d)object5).c((Class)object4);
        object4 = this.o;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        if (n3 >= n4) {
            boolean bl2;
            pi0_0 pi0_02 = pi0_0.RESOURCE_DISK_CACHE;
            if (object2 != pi0_02 && !(bl2 = ((d)object5).r)) {
                bl2 = false;
                object5 = null;
            } else {
                bl2 = true;
            }
            U92 u92 = vs0.i;
            Object object6 = (Boolean)((Z92)object4).c(u92);
            if (object6 == null || (n4 = (int)(((Boolean)object6).booleanValue() ? 1 : 0)) != 0 && !bl2) {
                object4 = new Z92();
                object6 = this.o.b;
                object3 = ((Z92)object4).b;
                ((pj_1)object3).i((a53)object6);
                object5 = bl2;
                ((pj_1)object3).put(u92, object5);
            }
        }
        object3 = object4;
        object4 = this.h.b();
        object = ((Registry)object4).h(object);
        try {
            n3 = this.l;
            n4 = this.m;
            DecodeJob$c decodeJob$c = new DecodeJob$c(this, (pi0_0)((Object)object2));
            wk2_0 wk2_02 = mv1.a(n3, n4, (Z92)object3, (a)object, decodeJob$c);
            return wk2_02;
        }
        finally {
            object.b();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        Throwable throwable2;
        Object object;
        block19: {
            block18: {
                di0 di02;
                Object object2;
                Object object3;
                Object object4;
                Object object5;
                object = "DecodeJob";
                int n3 = 2;
                boolean bl2 = Log.isLoggable((String)object, (int)n3);
                if (bl2) {
                    object = new StringBuilder("data: ");
                    object5 = this.y;
                    ((StringBuilder)object).append(object5);
                    ((StringBuilder)object).append(", cache key: ");
                    object5 = this.w;
                    ((StringBuilder)object).append(object5);
                    ((StringBuilder)object).append(", fetcher: ");
                    object5 = this.A;
                    ((StringBuilder)object).append(object5);
                    object = ((StringBuilder)object).toString();
                    n3 = kx1.a;
                    SystemClock.elapsedRealtimeNanos();
                    object5 = this.k;
                    Objects.toString(object5);
                    if (object != null) {
                        object5 = ", ";
                        ((String)object5).concat((String)object);
                    }
                    object = Thread.currentThread();
                    ((Thread)object).getName();
                }
                bl2 = false;
                object = null;
                try {
                    object5 = this.A;
                    object4 = this.y;
                    object3 = this.z;
                    object5 = this.e((ei0_0)object5, object4, (pi0_0)((Object)object3));
                }
                catch (GlideException glideException) {
                    object4 = this.x;
                    object3 = this.z;
                    glideException.b = object4;
                    glideException.c = object3;
                    glideException.d = null;
                    object4 = this.b;
                    ((ArrayList)object4).add(glideException);
                    n3 = 0;
                    object5 = null;
                }
                if (object5 == null) {
                    this.p();
                    return;
                }
                object4 = this.z;
                boolean bl3 = this.E;
                boolean bl4 = object5 instanceof uh1_0;
                if (bl4) {
                    object2 = object5;
                    object2 = (uh1_0)object5;
                    object2.initialize();
                }
                object2 = this.f.c;
                boolean bl5 = true;
                ek2_0 ek2_02 = null;
                if (object2 != null) {
                    object = (dw1_0)dw1_0.e.b();
                    ((dw1_0)object).d = false;
                    ((dw1_0)object).c = bl5;
                    ((dw1_0)object).b = (wk2_0)object5;
                    object5 = object;
                }
                this.r();
                object2 = (EngineJob)this.p;
                synchronized (object2) {
                    ((EngineJob)object2).q = (wk2_0)object5;
                    ((EngineJob)object2).r = object4;
                    ((EngineJob)object2).y = bl3;
                }
                ((EngineJob)object2).h();
                object5 = DecodeJob$h.ENCODE;
                this.r = object5;
                try {
                    object5 = this.f;
                    object4 = ((DecodeJob$d)object5).c;
                    if (object4 == null) {
                        bl5 = false;
                        di02 = null;
                    }
                    if (!bl5) break block18;
                    object4 = this.d;
                    object3 = this.o;
                    object5.getClass();
                }
                catch (Throwable throwable2) {
                    break block19;
                }
                try {
                    object4 = (f$c)object4;
                    object4 = ((f$c)object4).a();
                    object2 = ((DecodeJob$d)object5).a;
                    ek2_02 = ((DecodeJob$d)object5).b;
                    dw1_0 dw1_02 = ((DecodeJob$d)object5).c;
                    di02 = new di0(ek2_02, dw1_02, (Z92)object3);
                    object4.a((qn1_0)object2, di02);
                }
                finally {
                    object5 = ((DecodeJob$d)object5).c;
                    ((dw1_0)object5).d();
                }
            }
            if (object != null) {
                ((dw1_0)object).d();
            }
            this.k();
            return;
        }
        if (object == null) throw throwable2;
        ((dw1_0)object).d();
        throw throwable2;
    }

    public final c h() {
        Object object = DecodeJob$a.b;
        Object object2 = this.r;
        int n3 = ((Enum)object2).ordinal();
        int n4 = object[n3];
        n3 = 1;
        Object object3 = this.a;
        if (n4 != n3) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 == n3) {
                        return null;
                    }
                    object = new IllegalStateException;
                    object2 = new StringBuilder("Unrecognized stage: ");
                    object3 = this.r;
                    ((StringBuilder)object2).append(object3);
                    object2 = ((StringBuilder)object2).toString();
                    object((String)object2);
                    throw object;
                }
                object = new i;
                object((d)object3, this);
                return object;
            }
            object = new b;
            object2 = object3.a();
            object((List)object2, (d)object3, this);
            return object;
        }
        object = new h;
        object((d)object3, this);
        return object;
    }

    public final DecodeJob$h i(DecodeJob$h object) {
        Object object2 = DecodeJob$a.b;
        int n3 = object.ordinal();
        int n4 = object2[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3 && n4 != (n3 = 4)) {
                    n3 = 5;
                    if (n4 == n3) {
                        object = this.n;
                        boolean bl2 = ((Nq0)object).b();
                        if (bl2) {
                            object = DecodeJob$h.RESOURCE_CACHE;
                        } else {
                            object = DecodeJob$h.RESOURCE_CACHE;
                            object = this.i((DecodeJob$h)((Object)object));
                        }
                        return object;
                    }
                    object2 = new IllegalArgumentException;
                    StringBuilder stringBuilder = new StringBuilder("Unrecognized stage: ");
                    stringBuilder.append(object);
                    object = stringBuilder.toString();
                    object2((String)object);
                    throw object2;
                }
                return DecodeJob$h.FINISHED;
            }
            boolean bl3 = this.t;
            object = bl3 ? DecodeJob$h.FINISHED : DecodeJob$h.SOURCE;
            return object;
        }
        object = this.n;
        boolean bl4 = ((Nq0)object).a();
        if (bl4) {
            object = DecodeJob$h.DATA_CACHE;
        } else {
            object = DecodeJob$h.DATA_CACHE;
            object = this.i((DecodeJob$h)((Object)object));
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j() {
        this.r();
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = new ArrayList(arrayList);
        GlideException glideException = new GlideException("Failed to load resource", arrayList2);
        EngineJob engineJob = (EngineJob)this.p;
        synchronized (engineJob) {
            engineJob.t = glideException;
        }
        engineJob.g();
        this.l();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void k() {
        boolean bl2;
        DecodeJob$f decodeJob$f = this.g;
        // MONITORENTER : decodeJob$f
        decodeJob$f.b = bl2 = true;
        bl2 = decodeJob$f.a();
        // MONITOREXIT : decodeJob$f
        if (!bl2) return;
        this.n();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void l() {
        boolean bl2;
        DecodeJob$f decodeJob$f = this.g;
        // MONITORENTER : decodeJob$f
        decodeJob$f.c = bl2 = true;
        bl2 = decodeJob$f.a();
        // MONITOREXIT : decodeJob$f
        if (!bl2) return;
        this.n();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void m() {
        boolean bl2;
        DecodeJob$f decodeJob$f = this.g;
        // MONITORENTER : decodeJob$f
        decodeJob$f.a = bl2 = true;
        bl2 = decodeJob$f.a();
        // MONITOREXIT : decodeJob$f
        if (!bl2) return;
        this.n();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n() {
        Object object = this.g;
        synchronized (object) {
            Object var2_2 = null;
            ((DecodeJob$f)object).b = false;
            ((DecodeJob$f)object).a = false;
            ((DecodeJob$f)object).c = false;
        }
        object = this.f;
        ((DecodeJob$d)object).a = null;
        ((DecodeJob$d)object).b = null;
        ((DecodeJob$d)object).c = null;
        object = this.a;
        ((d)object).c = null;
        ((d)object).d = null;
        ((d)object).n = null;
        ((d)object).g = null;
        ((d)object).k = null;
        ((d)object).i = null;
        ((d)object).o = null;
        ((d)object).j = null;
        ((d)object).p = null;
        ((d)object).a.clear();
        ((d)object).l = false;
        ((d)object).b.clear();
        ((d)object).m = false;
        this.C = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.r = null;
        this.B = null;
        this.v = null;
        this.w = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.D = false;
        this.b.clear();
        this.e.a(this);
    }

    public final void o(DecodeJob$g object) {
        this.s = object;
        object = (EngineJob)this.p;
        boolean bl2 = ((EngineJob)object).n;
        object = bl2 ? ((EngineJob)object).i : ((bl2 = ((EngineJob)object).o) ? ((EngineJob)object).j : ((EngineJob)object).h);
        ((GlideExecutor)object).execute(this);
    }

    public final void p() {
        DecodeJob$h decodeJob$h;
        Object object;
        boolean bl2;
        Object object2 = Thread.currentThread();
        this.v = object2;
        int n3 = kx1.a;
        SystemClock.elapsedRealtimeNanos();
        n3 = 0;
        object2 = null;
        while (!(bl2 = this.D) && (object = this.B) != null && (n3 = (int)((object2 = this.B).b() ? 1 : 0)) == 0) {
            object = this.r;
            object = this.i((DecodeJob$h)((Object)object));
            this.r = object;
            this.B = object = this.h();
            object = this.r;
            decodeJob$h = DecodeJob$h.SOURCE;
            if (object != decodeJob$h) continue;
            object2 = DecodeJob$g.SWITCH_TO_SOURCE_SERVICE;
            this.o((DecodeJob$g)((Object)object2));
            return;
        }
        object = this.r;
        decodeJob$h = DecodeJob$h.FINISHED;
        if ((object == decodeJob$h || (bl2 = this.D)) && n3 == 0) {
            this.j();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void q() {
        int[] nArray = DecodeJob$a.a;
        Object object = this.s;
        int n3 = ((Enum)object).ordinal();
        int n4 = nArray[n3];
        if (n4 == (n3 = 1)) {
            c c2;
            DecodeJob$h decodeJob$h;
            DecodeJob$h decodeJob$h2 = DecodeJob$h.INITIALIZE;
            this.r = decodeJob$h = this.i(decodeJob$h2);
            this.B = c2 = this.h();
            this.p();
            return;
        }
        n3 = 2;
        if (n4 == n3) {
            this.p();
            return;
        }
        n3 = 3;
        if (n4 == n3) {
            this.g();
            return;
        }
        object = new StringBuilder("Unrecognized run reason: ");
        DecodeJob$g decodeJob$g = this.s;
        ((StringBuilder)object).append((Object)decodeJob$g);
        object = ((StringBuilder)object).toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    public final void r() {
        Object object = this.c;
        ((Tb3$a)object).a();
        boolean bl2 = this.C;
        int n3 = 1;
        if (bl2) {
            object = this.b;
            bl2 = ((ArrayList)object).isEmpty();
            if (bl2) {
                bl2 = false;
                object = null;
            } else {
                object = this.b;
                object = (Throwable)pp_0.a(n3, (ArrayList)object);
            }
            IllegalStateException illegalStateException = new IllegalStateException("Already notified", (Throwable)object);
            throw illegalStateException;
        }
        this.C = n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Throwable throwable3;
        ei0_0 ei0_02;
        block11: {
            boolean bl2;
            Throwable throwable22;
            block10: {
                block8: {
                    ei0_02 = this.A;
                    boolean bl3 = this.D;
                    if (!bl3) break block8;
                    this.j();
                    if (ei0_02 == null) return;
                    ei0_02.b();
                    return;
                }
                try {
                    this.q();
                    if (ei0_02 == null) return;
                }
                catch (Throwable throwable22) {
                }
                catch (YJ yJ) {
                    throw yJ;
                }
                ei0_02.b();
                return;
                Object object = "DecodeJob";
                int n3 = 3;
                try {
                    DecodeJob$h decodeJob$h;
                    bl2 = Log.isLoggable((String)object, (int)n3);
                    if (bl2) {
                        object = this.r;
                        Objects.toString(object);
                    }
                    if ((object = this.r) == (decodeJob$h = DecodeJob$h.ENCODE)) break block10;
                    object = this.b;
                    ((ArrayList)object).add(throwable22);
                    this.j();
                }
                catch (Throwable throwable3) {
                    break block11;
                }
            }
            if (bl2 = this.D) throw throwable22;
            throw throwable22;
        }
        if (ei0_02 == null) throw throwable3;
        ei0_02.b();
        throw throwable3;
    }
}

