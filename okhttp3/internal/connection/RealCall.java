/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.connection.RealCall$AsyncCall;
import okhttp3.internal.connection.RealCall$a;
import okhttp3.internal.connection.RealCall$b;
import okhttp3.internal.connection.a;
import okio.AsyncTimeout;

public final class RealCall
implements ij_2 {
    public final x72_0 a;
    public final kj2_2 b;
    public final boolean c;
    public final a d;
    public final ib0_2 e;
    public final RealCall$b f;
    public final AtomicBoolean g;
    public Object h;
    public jc0_2 i;
    public je2_2 j;
    public boolean k;
    public zc0_2 l;
    public boolean m;
    public boolean n;
    public boolean o;
    public volatile boolean p;
    public volatile zc0_2 q;
    public volatile je2_2 r;

    public RealCall(x72_0 object, kj2_2 object2, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(object2, "originalRequest");
        this.a = object;
        this.b = object2;
        this.c = bl2;
        this.d = object2 = object.b.a;
        object2 = (ib0_2)((q40_0)object.e).a;
        Intrinsics.checkNotNullParameter(object2, "$this_asFactory");
        Intrinsics.checkNotNullParameter(this, "it");
        this.e = object2;
        object2 = new RealCall$b(this);
        long l2 = object.x;
        object = TimeUnit.MILLISECONDS;
        ((okio.a)object2).g(l2, (TimeUnit)((Object)object));
        this.f = object2;
        this.g = object;
        this.o = true;
    }

    public static final String b(RealCall object) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = ((RealCall)object).p;
        String string2 = bl2 ? "canceled " : "";
        stringBuilder.append(string2);
        bl2 = ((RealCall)object).c;
        string2 = bl2 ? "web socket" : "call";
        stringBuilder.append(string2);
        stringBuilder.append(" to ");
        object = ((RealCall)object).b.a.i();
        stringBuilder.append((String)object);
        return stringBuilder.toString();
    }

    public final boolean a() {
        return this.p;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(wj_2 object) {
        Intrinsics.checkNotNullParameter(object, "responseCallback");
        Object object2 = this.g;
        RealCall$AsyncCall realCall$AsyncCall = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object2).compareAndSet(false, bl2);
        if (!bl3) {
            object = "Already Executed".toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object2 = zs2_2.a;
        this.h = object2 = zs2_2.a.g();
        this.e.getClass();
        Intrinsics.checkNotNullParameter(this, "call");
        object2 = this.a.a;
        realCall$AsyncCall = new RealCall$AsyncCall(this, (wj_2)object);
        object2.getClass();
        object = "call";
        Intrinsics.checkNotNullParameter(realCall$AsyncCall, (String)object);
        synchronized (object2) {
            object = ((fr0_2)object2).b;
            ((ArrayDeque)object).add(realCall$AsyncCall);
            boolean bl4 = this.c;
            if (!bl4) {
                Object object3;
                block7: {
                    boolean bl5;
                    Object object4;
                    boolean bl6;
                    object = this.b;
                    object = ((kj2_2)object).a;
                    object = ((ob1_1)object).d;
                    Iterator iterator = ((fr0_2)object2).c;
                    iterator = ((ArrayDeque)((Object)iterator)).iterator();
                    while (bl6 = iterator.hasNext()) {
                        object3 = iterator.next();
                        object3 = (RealCall$AsyncCall)object3;
                        object4 = ((RealCall$AsyncCall)object3).c;
                        object4 = ((RealCall)object4).b;
                        object4 = ((kj2_2)object4).a;
                        object4 = ((ob1_1)object4).d;
                        bl5 = Intrinsics.areEqual(object4, object);
                        if (!bl5) continue;
                        break block7;
                    }
                    iterator = ((fr0_2)object2).b;
                    iterator = ((ArrayDeque)((Object)iterator)).iterator();
                    while (bl6 = iterator.hasNext()) {
                        object3 = iterator.next();
                        object3 = (RealCall$AsyncCall)object3;
                        object4 = ((RealCall$AsyncCall)object3).c;
                        object4 = ((RealCall)object4).b;
                        object4 = ((kj2_2)object4).a;
                        object4 = ((ob1_1)object4).d;
                        bl5 = Intrinsics.areEqual(object4, object);
                        if (!bl5) continue;
                        break block7;
                    }
                    bl6 = false;
                    object3 = null;
                }
                if (object3 != null) {
                    object = "other";
                    Intrinsics.checkNotNullParameter(object3, (String)object);
                    realCall$AsyncCall.b = object = ((RealCall$AsyncCall)object3).b;
                }
            }
            object = Unit.a;
        }
        ((fr0_2)object2).d();
    }

    public final void cancel() {
        boolean bl2 = this.p;
        if (bl2) {
            return;
        }
        this.p = bl2 = true;
        Object object = this.q;
        if (object != null) {
            object = ((zc0_2)object).d;
            object.cancel();
        }
        if ((object = this.r) != null && (object = ((je2_2)object).c) != null) {
            ez3.d((Socket)object);
        }
        this.e.getClass();
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public final Object clone() {
        boolean bl2 = this.c;
        x72_0 x72_02 = this.a;
        kj2_2 kj2_22 = this.b;
        RealCall realCall = new RealCall(x72_02, kj2_22, bl2);
        return realCall;
    }

    public final void d(je2_2 object) {
        Intrinsics.checkNotNullParameter(object, "connection");
        Object object2 = ez3.a;
        object2 = this.j;
        if (object2 == null) {
            this.j = object;
            object = ((je2_2)object).p;
            object2 = new RealCall$a;
            Object object3 = this.h;
            object2(this, object3);
            ((ArrayList)object).add(object2);
            return;
        }
        object2 = "Check failed.".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IOException e(IOException object) {
        boolean bl2;
        Object object2;
        Object object3 = ez3.a;
        object3 = this.j;
        if (object3 != null) {
            synchronized (object3) {
                object2 = this.k();
            }
            je2_2 je2_22 = this.j;
            if (je2_22 == null) {
                if (object2 != null) {
                    ez3.d((Socket)object2);
                }
                this.e.getClass();
                Intrinsics.checkNotNullParameter(this, "call");
                object2 = "connection";
                Intrinsics.checkNotNullParameter(object3, (String)object2);
            } else if (object2 != null) {
                object = "Check failed.".toString();
                object3 = new IllegalStateException((String)object);
                throw object3;
            }
        }
        if ((bl2 = this.k) || !(bl2 = ((AsyncTimeout)(object3 = (Object)this.f)).i())) {
            object3 = object;
        } else {
            object2 = "timeout";
            object3 = new InterruptedIOException((String)object2);
            if (object != null) {
                ((Throwable)object3).initCause((Throwable)object);
            }
        }
        if (object != null) {
            object = this.e;
            Intrinsics.checkNotNull(object3);
            object.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            object = "ioe";
            Intrinsics.checkNotNullParameter(object3, (String)object);
            return object3;
        }
        this.e.getClass();
        object = "call";
        Intrinsics.checkNotNullParameter(this, (String)object);
        return object3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final cl2_2 execute() {
        Object object = this.g;
        Object object2 = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (!bl3) {
            object = "Already Executed".toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        this.f.h();
        object = zs2_2.a;
        this.h = object = zs2_2.a.g();
        this.e.getClass();
        object = "call";
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.a;
        object = ((x72_0)object).a;
        synchronized (object) {
            object2 = "call";
        }
        {
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object2 = ((fr0_2)object).d;
            ((ArrayDeque)object2).add(this);
        }
        try {
            object = this.g();
            return object;
        }
        finally {
            object2 = this.a.a;
            object2.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            ArrayDeque arrayDeque = ((fr0_2)object2).d;
            ((fr0_2)object2).b(arrayDeque, this);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void f(boolean bl2) {
        block5: {
            zc0_2 zc0_22;
            // MONITORENTER : this
            boolean bl3 = this.o;
            if (!bl3) break block5;
            Unit unit = Unit.a;
            bl3 = false;
            unit = null;
            if (bl2 && (zc0_22 = this.q) != null) {
                ac0_2 ac0_22 = zc0_22.d;
                ac0_22.cancel();
                boolean bl4 = true;
                RealCall realCall = zc0_22.a;
                realCall.i(zc0_22, bl4, bl4, null);
            }
            this.l = null;
            return;
        }
        String string2 = "released";
        string2 = string2.toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final cl2_2 g() {
        String string2;
        boolean bl2;
        Object object;
        block12: {
            te2_2 te2_22;
            object = new ArrayList();
            cx_2.r(this.a.c, object);
            Object object2 = this.a;
            Object object3 = new em2_1((x72_0)object2);
            ((ArrayList)object).add(object3);
            object2 = this.a.j;
            object3 = new id_2((z80_0)object2);
            ((ArrayList)object).add(object3);
            object2 = this.a.k;
            object3 = new bj_2((ri_2)object2);
            ((ArrayList)object).add(object3);
            object3 = a50_0.a;
            ((ArrayList)object).add(object3);
            boolean bl3 = this.c;
            if (!bl3) {
                object3 = this.a.d;
                cx_2.r((Iterable)object3, object);
            }
            bl2 = this.c;
            object3 = new qj_2(bl2);
            ((ArrayList)object).add(object3);
            kj2_2 kj2_22 = this.b;
            object3 = this.a;
            int n3 = ((x72_0)object3).y;
            int n4 = ((x72_0)object3).z;
            int n7 = ((x72_0)object3).A;
            boolean bl4 = false;
            string2 = null;
            object3 = te2_22;
            object2 = this;
            te2_22 = new te2_2(this, (List)object, 0, null, kj2_22, n3, n4, n7);
            bl3 = false;
            object3 = null;
            bl2 = false;
            object2 = null;
            object = this.b;
            object = te2_22.a((kj2_2)object);
            bl4 = this.p;
            if (bl4) break block12;
            this.j(null);
            return object;
        }
        ez3.c((Closeable)object);
        string2 = "Canceled";
        try {
            object = new IOException(string2);
            throw object;
        }
        catch (Throwable throwable) {
        }
        catch (IOException iOException) {
            IOException iOException2 = this.j(iOException);
            string2 = "null cannot be cast to non-null type kotlin.Throwable";
            try {
                Intrinsics.checkNotNull(iOException2, string2);
                throw iOException2;
            }
            catch (Throwable throwable) {
                object = throwable;
                bl2 = true;
            }
        }
        if (!bl2) {
            this.j(null);
        }
        throw object;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final IOException i(zc0_2 var1_1, boolean var2_3, boolean var3_4, IOException var4_5) {
        Intrinsics.checkNotNullParameter(var1_1, "exchange");
        var5_6 = this.q;
        var6_7 = Intrinsics.areEqual(var1_1, var5_6);
        if (!var6_7) {
            return var4_5;
        }
        synchronized (this) {
            block16: {
                var6_7 = false;
                var1_1 = null;
                if (!var2_3) break block16;
                try {
                    var7_8 = this.m;
                    if (!var7_8) {
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var1_2) {
                    ** break block15
                }
            }
            if (var3_4 && (var7_8 = this.n)) lbl-1000:
            // 2 sources

            {
                if (var2_3) {
                    this.m = false;
                }
                if (var3_4) {
                    this.n = false;
                }
                var2_3 = this.m;
                var3_4 = true;
                if (!var2_3 && !(var7_8 = this.n)) {
                    var7_8 = true;
                    var8_9 = 1.4E-45f;
                } else {
                    var7_8 = false;
                    var8_10 = 0.0f;
                    var5_6 = null;
                }
                if (!(var2_3 || (var2_3 = this.n) || (var2_3 = this.o))) {
                    var6_7 = true;
                }
                var2_3 = var6_7;
                var6_7 = var7_8;
            } else {
                var2_3 = false;
            }
            ** if (!var6_7) goto lbl45
        }
lbl-1000:
        // 1 sources

        {
            var6_7 = false;
            this.q = null;
            var1_1 = this.j;
            if (var1_1 != null) {
                var1_1.h();
            }
        }
lbl45:
        // 4 sources

        if (var2_3) {
            return this.e(var4_5);
        }
        return var4_5;
lbl-1000:
        // 1 sources

        {
            throw var1_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final IOException j(IOException iOException) {
        boolean bl2;
        block4: {
            // MONITORENTER : this
            boolean bl3 = this.o;
            bl2 = false;
            if (!bl3) break block4;
            this.o = false;
            bl3 = this.m;
            if (!bl3 && !(bl3 = this.n)) {
                bl2 = true;
            }
        }
        // MONITOREXIT : this
        if (!bl2) return iOException;
        return this.e(iOException);
    }

    public final Socket k() {
        Object object;
        int n3;
        int n4;
        Iterator iterator;
        Object object2;
        Object object3;
        int n7;
        block7: {
            n7 = 1;
            object3 = this.j;
            Intrinsics.checkNotNull(object3);
            object2 = ez3.a;
            object2 = ((je2_2)object3).p;
            iterator = ((ArrayList)object2).iterator();
            n4 = 0;
            while (true) {
                boolean bl2 = iterator.hasNext();
                n3 = -1;
                if (!bl2) break;
                object = ((Reference)iterator.next()).get();
                bl2 = Intrinsics.areEqual(object, this);
                if (!bl2) {
                    n4 += n7;
                    continue;
                }
                break block7;
                break;
            }
            n4 = -1;
        }
        if (n4 != n3) {
            ((ArrayList)object2).remove(n4);
            iterator = null;
            this.j = null;
            boolean bl3 = ((ArrayList)object2).isEmpty();
            if (bl3) {
                long l2;
                ((je2_2)object3).q = l2 = System.nanoTime();
                object2 = this.d;
                object2.getClass();
                Intrinsics.checkNotNullParameter(object3, "connection");
                n4 = (int)(((je2_2)object3).j ? 1 : 0);
                object = ((a)object2).c;
                if (n4 == 0 && (n4 = ((a)object2).a) != 0) {
                    me2_2 me2_22 = ((a)object2).d;
                    okhttp3.internal.concurrent.b.d(object, me2_22);
                } else {
                    ((je2_2)object3).j = n7;
                    Object object4 = ((a)object2).e;
                    ((ConcurrentLinkedQueue)object4).remove(object3);
                    n7 = (int)(((ConcurrentLinkedQueue)object4).isEmpty() ? 1 : 0);
                    if (n7 != 0) {
                        ((b)object).a();
                    }
                    object4 = ((je2_2)object3).d;
                    Intrinsics.checkNotNull(object4);
                    return object4;
                }
            }
            return null;
        }
        object3 = "Check failed.".toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object3);
        throw illegalStateException;
    }

    public final void l() {
        boolean bl2 = this.k;
        boolean bl3 = true;
        if (bl2 ^= bl3) {
            this.k = bl3;
            this.f.i();
            return;
        }
        String string2 = "Check failed.".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final kj2_2 request() {
        return this.b;
    }
}

