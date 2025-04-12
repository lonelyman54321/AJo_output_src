/*
 * Decompiled with CFR 0.152.
 */
package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.DecodeJob$b;
import com.bumptech.glide.load.engine.DecodeJob$h;
import com.bumptech.glide.load.engine.EngineJob$CallLoadFailed;
import com.bumptech.glide.load.engine.EngineJob$CallResourceReady;
import com.bumptech.glide.load.engine.EngineJob$a;
import com.bumptech.glide.load.engine.EngineJob$b;
import com.bumptech.glide.load.engine.EngineJob$c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.g;
import com.bumptech.glide.load.engine.g$a;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public final class EngineJob
implements DecodeJob$b,
LI0$d {
    public static final EngineJob$a z;
    public final EngineJob$c a;
    public final Tb3$a b;
    public final g$a c;
    public final yw2 d;
    public final EngineJob$a e;
    public final Rz0 f;
    public final GlideExecutor g;
    public final GlideExecutor h;
    public final GlideExecutor i;
    public final GlideExecutor j;
    public final AtomicInteger k;
    public qn1_0 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public wk2_0 q;
    public pi0_0 r;
    public boolean s;
    public GlideException t;
    public boolean u;
    public g v;
    public DecodeJob w;
    public volatile boolean x;
    public boolean y;

    static {
        EngineJob$a engineJob$a;
        z = engineJob$a = new Object();
    }

    public EngineJob() {
        throw null;
    }

    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, Rz0 rz0, g$a g$a, LI0$c lI0$c) {
        EngineJob$a engineJob$a = z;
        ArrayList arrayList = new ArrayList(2);
        Object object = new EngineJob$c(arrayList);
        this.a = object;
        this.b = object = new Object();
        this.k = object = new AtomicInteger();
        this.g = glideExecutor;
        this.h = glideExecutor2;
        this.i = glideExecutor3;
        this.j = glideExecutor4;
        this.f = rz0;
        this.c = g$a;
        this.d = lI0$c;
        this.e = engineJob$a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(zk2_0 zk2_02, Executor object) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    int n3;
                    boolean bl2;
                    Object object2;
                    block6: {
                        try {
                            object2 = this.b;
                            ((Tb3$a)object2).a();
                            object2 = this.a;
                            object2.getClass();
                            EngineJob$b engineJob$b = new EngineJob$b(zk2_02, (Executor)object);
                            object2 = ((EngineJob$c)object2).a;
                            object2.add(engineJob$b);
                            bl2 = this.s;
                            n3 = 1;
                            if (!bl2) break block6;
                            this.e(n3);
                            object2 = new EngineJob$CallResourceReady(this, zk2_02);
                            object.execute((Runnable)object2);
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    bl2 = this.u;
                    if (bl2) {
                        this.e(n3);
                        object2 = new EngineJob$CallLoadFailed(this, zk2_02);
                        object.execute((Runnable)object2);
                    } else {
                        boolean bl3 = this.x ^ n3;
                        object = "Cannot add callbacks to a cancelled EngineJob";
                        dV0.a(bl3, (String)object);
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final Tb3$a b() {
        return this.b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        boolean bl2 = this.f();
        if (bl2) {
            return;
        }
        this.x = bl2 = true;
        Object object = this.w;
        ((DecodeJob)object).D = bl2;
        Object object2 = ((DecodeJob)object).B;
        if (object2 != null) {
            object2.cancel();
        }
        object2 = this.f;
        object = this.l;
        object2 = (f)object2;
        synchronized (object2) {
            Object object3 = ((f)object2).a;
            object3.getClass();
            boolean bl3 = this.p;
            object3 = bl3 ? ((fl1_0)object3).b : ((fl1_0)object3).a;
            Object v4 = object3.get(object);
            bl3 = this.equals(v4);
            if (bl3) {
                object3.remove(object);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        synchronized (this) {
            try {
                boolean bl2;
                Object object = this.b;
                ((Tb3$a)object).a();
                int n3 = this.f();
                String string2 = "Not yet complete!";
                dV0.a(n3 != 0, string2);
                object = this.k;
                n3 = ((AtomicInteger)object).decrementAndGet();
                if (n3 >= 0) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    string2 = null;
                }
                String string3 = "Can't decrement below 0";
                dV0.a(bl2, string3);
                if (n3 != 0) return;
                object = this.v;
                this.i();
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl20 : MonitorExitStatement: MONITOREXIT : this
                if (object == null) return;
                ((g)object).d();
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(int n3) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        g g3;
                        boolean bl2 = this.f();
                        String string2 = "Not yet complete!";
                        dV0.a(bl2, string2);
                        AtomicInteger atomicInteger = this.k;
                        n3 = atomicInteger.getAndAdd(n3);
                        if (n3 != 0 || (g3 = this.v) == null) break block4;
                        g3.b();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final boolean f() {
        boolean bl2 = this.u;
        bl2 = bl2 || (bl2 = this.s) || (bl2 = this.x);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void g() {
        Object object;
        block7: {
            block8: {
                // MONITORENTER : this
                object = this.b;
                ((Tb3$a)object).a();
                int n3 = this.x;
                if (n3 != 0) {
                    this.i();
                    // MONITOREXIT : this
                    return;
                }
                object = this.a;
                object = ((EngineJob$c)object).a;
                n3 = object.isEmpty();
                if (n3 != 0) break block7;
                n3 = this.u;
                if (n3 != 0) break block8;
                n3 = 1;
                this.u = n3;
                Object object2 = this.l;
                Object object3 = this.a;
                object3.getClass();
                object3 = ((EngineJob$c)object3).a;
                Object object4 = new ArrayList(object3);
                int n4 = object4.size() + n3;
                this.e(n4);
                // MONITOREXIT : this
                object = this.f;
                n4 = 0;
                object3 = null;
                ((f)object).d(this, (qn1_0)object2, null);
                object = object4.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        this.d();
                        return;
                    }
                    object2 = (EngineJob$b)object.next();
                    object3 = ((EngineJob$b)object2).b;
                    object2 = ((EngineJob$b)object2).a;
                    object4 = new EngineJob$CallLoadFailed(this, (zk2_0)object2);
                    object3.execute((Runnable)object4);
                }
            }
            String string2 = "Already failed once";
            object = new Object(string2);
            throw object;
        }
        String string3 = "Received an exception without any callbacks to notify";
        object = new Object(string3);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void h() {
        Object object;
        block7: {
            block8: {
                // MONITORENTER : this
                object = this.b;
                ((Tb3$a)object).a();
                int n3 = this.x;
                if (n3 != 0) {
                    object = this.q;
                    object.a();
                    this.i();
                    // MONITOREXIT : this
                    return;
                }
                object = this.a;
                object = ((EngineJob$c)object).a;
                n3 = object.isEmpty();
                if (n3 != 0) break block7;
                n3 = this.s;
                if (n3 != 0) break block8;
                object = this.e;
                Object object2 = this.q;
                boolean bl2 = this.m;
                qn1_0 qn1_02 = this.l;
                g$a g$a = this.c;
                object.getClass();
                boolean bl3 = true;
                Object object3 = object;
                object = new Object((wk2_0)object2, bl2, bl3, qn1_02, g$a);
                this.v = object;
                n3 = 1;
                this.s = n3;
                object3 = this.a;
                object3.getClass();
                object3 = ((EngineJob$c)object3).a;
                object2 = new ArrayList(object3);
                int n4 = object2.size() + n3;
                this.e(n4);
                object = this.l;
                object3 = this.v;
                // MONITOREXIT : this
                Object object4 = (f)this.f;
                ((f)object4).d(this, (qn1_0)object, (g)object3);
                object = object2.iterator();
                while (true) {
                    if ((n4 = (int)(object.hasNext() ? 1 : 0)) == 0) {
                        this.d();
                        return;
                    }
                    object3 = (EngineJob$b)object.next();
                    object2 = ((EngineJob$b)object3).b;
                    object3 = ((EngineJob$b)object3).a;
                    object4 = new EngineJob$CallResourceReady(this, (zk2_0)object3);
                    object2.execute((Runnable)object4);
                }
            }
            String string2 = "Already have resource";
            object = new Object(string2);
            throw object;
        }
        String string3 = "Received a resource without any callbacks to notify";
        object = new Object(string3);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                try {
                    object = this.l;
                    if (object != null) {
                        object = this.a;
                        object = ((EngineJob$c)object).a;
                        object.clear();
                        object = null;
                        this.l = null;
                        this.v = null;
                        this.q = null;
                        DecodeJob decodeJob = null;
                        this.u = false;
                        this.x = false;
                        this.s = false;
                        this.y = false;
                        decodeJob = this.w;
                        decodeJob.m();
                        this.w = null;
                        this.t = null;
                        this.r = null;
                        object = this.d;
                        object.a(this);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new IllegalArgumentException();
                throw object;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(zk2_0 object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    int n3;
                    try {
                        Object object2 = this.b;
                        ((Tb3$a)object2).a();
                        object2 = this.a;
                        iE0$b iE0$b = iE0.b;
                        EngineJob$b engineJob$b = new EngineJob$b((zk2_0)object, iE0$b);
                        object = ((EngineJob$c)object2).a;
                        object.remove(engineJob$b);
                        object = this.a;
                        object = ((EngineJob$c)object).a;
                        n3 = object.isEmpty();
                        if (n3 == 0) break block4;
                        this.c();
                        n3 = this.s;
                        if (n3 == 0 && (n3 = this.u) == 0) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    object = this.k;
                    n3 = ((AtomicInteger)object).get();
                    if (n3 == 0) {
                        this.i();
                    }
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
    public final void k(DecodeJob decodeJob) {
        synchronized (this) {
            boolean bl2;
            this.w = decodeJob;
            Object object = DecodeJob$h.INITIALIZE;
            object = decodeJob.i((DecodeJob$h)((Object)object));
            DecodeJob$h decodeJob$h = DecodeJob$h.RESOURCE_CACHE;
            object = object != decodeJob$h && object != (decodeJob$h = DecodeJob$h.DATA_CACHE) ? ((bl2 = this.n) ? this.i : ((bl2 = this.o) ? this.j : this.h)) : this.g;
            ((GlideExecutor)object).execute(decodeJob);
            return;
        }
    }
}

