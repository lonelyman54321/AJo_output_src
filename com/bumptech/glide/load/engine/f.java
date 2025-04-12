/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 *  android.util.Log
 */
package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.DecodeJob$g;
import com.bumptech.glide.load.engine.EngineJob;
import com.bumptech.glide.load.engine.a;
import com.bumptech.glide.load.engine.a$a;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.f$a;
import com.bumptech.glide.load.engine.f$b;
import com.bumptech.glide.load.engine.f$c;
import com.bumptech.glide.load.engine.f$d;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.g$a;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class f
implements Rz0,
ON1$a,
g$a {
    public static final boolean i = Log.isLoggable((String)"Engine", (int)2);
    public final fl1_0 a;
    public final RS1 b;
    public final ON1 c;
    public final f$b d;
    public final QK2 e;
    public final f$c f;
    public final f$a g;
    public final a h;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f(ad1_1 ad1_12, uj1_0 object, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4) {
        f$c f$c;
        this.c = ad1_12;
        this.f = f$c = new f$c((uj1_0)object);
        this.h = object = new a();
        synchronized (this) {
            synchronized (object) {
                ((a)object).d = this;
            }
        }
        this.b = object = new Object();
        this.a = object = new fl1_0();
        this.d = object = new f$b(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this, this);
        this.g = object = new f$a(f$c);
        this.e = object = new QK2();
        ad1_12.d = this;
    }

    public static void e(wk2_0 object) {
        boolean bl2 = object instanceof g;
        if (bl2) {
            ((g)object).d();
            return;
        }
        object = new IllegalArgumentException("Cannot release anything but an EngineResource");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(qn1_0 object, g g3) {
        Object object2 = this.h;
        synchronized (object2) {
            Object object3 = ((a)object2).b;
            object3 = ((HashMap)object3).remove(object);
            object3 = (a$a)object3;
            if (object3 != null) {
                ((a$a)object3).c = null;
                ((Reference)object3).clear();
            }
        }
        boolean bl2 = g3.a;
        if (bl2) {
            object2 = this.c;
            object2.c((qn1_0)object, g3);
            return;
        }
        object = this.e;
        bl2 = false;
        object2 = null;
        ((QK2)object).a(g3, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final f$d b(c c2, Object object, qn1_0 qn1_02, int n3, int n4, Class clazz, Class clazz2, Az2 az2, Nq0 nq0, pj_1 pj_12, boolean bl2, boolean bl3, Z92 z92, boolean bl4, boolean bl5, boolean bl6, boolean bl7, zk2_0 zk2_02, Executor executor) {
        Object object2;
        long l2;
        f f5 = this;
        int n7 = i;
        if (n7 != 0) {
            n7 = kx1.a;
            l2 = SystemClock.elapsedRealtimeNanos();
        } else {
            l2 = 0L;
        }
        f5.b.getClass();
        Object object3 = object2;
        object2 = new sz0_0(object, qn1_02, n3, n4, pj_12, clazz, clazz2, z92);
        synchronized (this) {
            try {
                object3 = f5.c((sz0_0)object2, bl4, l2);
                if (object3 == null) {
                    object3 = this;
                    return this.f(c2, object, qn1_02, n3, n4, clazz, clazz2, az2, nq0, pj_12, bl2, bl3, z92, bl4, bl5, bl6, bl7, zk2_02, executor, (sz0_0)object2, l2);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl18 : MonitorExitStatement: MONITOREXIT : this
                object2 = pi0_0.MEMORY_CACHE;
                ((j63)zk2_02).k((wk2_0)object3, (pi0_0)((Object)object2), false);
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final g c(sz0_0 sz0_02, boolean bl2, long l2) {
        Object object;
        Object object2;
        block15: {
            Object object3;
            block14: {
                if (!bl2) {
                    return null;
                }
                object2 = this.h;
                // MONITORENTER : object2
                object3 = ((a)object2).b;
                object3 = ((HashMap)object3).get(sz0_02);
                object3 = (a$a)object3;
                if (object3 != null) break block14;
                object = null;
                break block15;
            }
            object = ((Reference)object3).get();
            object = (g)object;
            if (object == null) {
                ((a)object2).b((a$a)object3);
            }
        }
        if (object != null) {
            ((g)object).b();
        }
        if (object != null) {
            bl2 = i;
            if (!bl2) return object;
            bl2 = kx1.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(sz0_02);
            return object;
        }
        object2 = this.c;
        Object object4 = object2.d(sz0_02);
        if (object4 == null) {
            object4 = null;
        } else {
            bl2 = object4 instanceof g;
            if (bl2) {
                object4 = (g)object4;
            } else {
                boolean bl3 = true;
                boolean bl4 = true;
                object = object2;
                object4 = object2 = new g((wk2_0)object4, bl3, bl4, sz0_02, this);
            }
        }
        if (object4 != null) {
            ((g)object4).b();
            object2 = this.h;
            ((a)object2).a(sz0_02, (g)object4);
        }
        if (object4 == null) return null;
        bl2 = i;
        if (!bl2) return object4;
        bl2 = kx1.a;
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(sz0_02);
        return object4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(EngineJob engineJob, qn1_0 qn1_02, g object) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                a a2;
                boolean bl2;
                block5: {
                    if (object != null) {
                        try {
                            bl2 = ((g)object).a;
                            if (!bl2) break block5;
                            a2 = this.h;
                            a2.a(qn1_02, (g)object);
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                }
                object = this.a;
                object.getClass();
                bl2 = engineJob.p;
                object = bl2 ? ((fl1_0)object).b : ((fl1_0)object).a;
                a2 = object.get(qn1_02);
                boolean bl3 = engineJob.equals(a2);
                if (bl3) {
                    object.remove(qn1_02);
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final f$d f(c c2, Object object, qn1_0 qn1_02, int n3, int n4, Class clazz, Class clazz2, Az2 az2, Nq0 nq0, pj_1 pj_12, boolean bl2, boolean bl3, Z92 z92, boolean bl4, boolean bl5, boolean bl6, boolean bl7, zk2_0 zk2_02, Executor executor, sz0_0 sz0_02, long l2) {
        int n7;
        f f5 = this;
        Object object2 = c2;
        Object object3 = object;
        qn1_0 qn1_03 = qn1_02;
        int n8 = n3;
        int n10 = n4;
        Az2 az22 = az2;
        Nq0 nq02 = nq0;
        Z92 z922 = z92;
        boolean bl8 = bl7;
        zk2_0 zk2_03 = zk2_02;
        Object object4 = executor;
        sz0_0 sz0_03 = sz0_02;
        Object object5 = this.a;
        object5 = bl7 ? ((fl1_0)object5).b : ((fl1_0)object5).a;
        if ((object5 = (EngineJob)object5.get(sz0_03)) != null) {
            ((EngineJob)object5).a(zk2_03, (Executor)object4);
            int n14 = i;
            if (n14 == 0) return new f$d(f5, zk2_03, (EngineJob)object5);
            n14 = kx1.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(sz0_02);
            return new f$d(f5, zk2_03, (EngineJob)object5);
        }
        object5 = (EngineJob)f5.d.g.b();
        synchronized (object5) {
            ((EngineJob)object5).l = sz0_03;
            ((EngineJob)object5).m = bl4;
            ((EngineJob)object5).n = bl5;
            ((EngineJob)object5).o = bl6;
            ((EngineJob)object5).p = bl8;
        }
        Object object6 = f5.g;
        DecodeJob decodeJob = (DecodeJob)((f$a)object6).b.b();
        int n15 = ((f$a)object6).c;
        ((f$a)object6).c = n7 = n15 + 1;
        object4 = decodeJob.a;
        ((d)object4).c = object2;
        ((d)object4).d = object3;
        ((d)object4).n = qn1_03;
        ((d)object4).e = n8;
        ((d)object4).f = n10;
        ((d)object4).p = nq02;
        object6 = clazz;
        ((d)object4).g = clazz;
        ((d)object4).h = object6 = decodeJob.d;
        object6 = clazz2;
        ((d)object4).k = clazz2;
        ((d)object4).o = az22;
        ((d)object4).i = z922;
        object6 = pj_12;
        ((d)object4).j = pj_12;
        ((d)object4).q = bl2;
        ((d)object4).r = bl3;
        decodeJob.h = object2;
        decodeJob.i = qn1_03;
        decodeJob.j = az22;
        decodeJob.k = sz0_03;
        decodeJob.l = n8;
        decodeJob.m = n10;
        decodeJob.n = nq02;
        decodeJob.t = bl8;
        decodeJob.o = z922;
        decodeJob.p = object5;
        decodeJob.q = n15;
        object2 = DecodeJob$g.INITIALIZE;
        decodeJob.s = object2;
        decodeJob.u = object3;
        object2 = f5.a;
        object2.getClass();
        int n16 = ((EngineJob)object5).p;
        object2 = n16 != 0 ? ((fl1_0)object2).b : ((fl1_0)object2).a;
        object2.put(sz0_03, object5);
        object2 = zk2_02;
        object3 = executor;
        ((EngineJob)object5).a(zk2_02, executor);
        ((EngineJob)object5).k(decodeJob);
        n16 = i;
        if (n16 == 0) return new f$d(f5, (zk2_0)object2, (EngineJob)object5);
        n16 = kx1.a;
        SystemClock.elapsedRealtimeNanos();
        Objects.toString(sz0_02);
        return new f$d(f5, (zk2_0)object2, (EngineJob)object5);
    }
}

